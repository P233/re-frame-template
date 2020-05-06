import { writeFileSync } from "fs";
import autoprefixer from "autoprefixer";
import postcss from "rollup-plugin-postcss";
import { Minifier } from "css-loader-minify-class";

const isProduction = !process.env.ROLLUP_WATCH;

const minifier = new Minifier({ prefix: "_" }).getLocalIdent;
const minifyClassname = localName => {
  return minifier({ resourcePath: "" }, null, localName);
};

const generateStylesCljs = json => {
  const lines = ["(ns app.styles)\n"];
  for (let [key, value] of Object.entries(json)) {
    lines.push(`(def ${key} "${value}")`);
  }
  writeFileSync("src/app/styles.cljs", lines.join("\n"));
};

export default [
  {
    input: "src/styles/main.scss",
    output: {
      file: "public/css/main.css",
      format: "es"
    },
    plugins: [
      postcss({
        plugins: [autoprefixer],
        extract: true,
        minimize: true,
        sourceMap: false,
        extensions: [".scss"],
        modules: {
          generateScopedName: isProduction
            ? minifyClassname
            : "[local]-[hash:base64:5]",
          getJSON: (_, json) => {
            generateStylesCljs(json);
          }
        }
      })
    ]
  }
];
