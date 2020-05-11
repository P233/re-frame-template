This package is built to experiment with the toolchain and workflow for developing re-frame projects from scratch as a new clojurian.

## Features

- [x] shadow-cljs
- [x] devtools and re-frame-10x
- [x] Sass (via PostCSS) / Autoprefixer / CSS Modules / [Minify Class](https://github.com/odensc/css-loader-minify-class) **[1]**
- [x] stylelint command and pre-commit hook
- [x] clj-kondo lint command and pre-commit hook **[2]**
- [x] cljfmt commands and pre-commit hook **[3]**
- [x] shadow-cljs browser testing
- [x] npm mirror and maven mirror **[4]**

**[1]**: Inspired by [ghivert/modular-styles](https://github.com/ghivert/modular-styles). Please see [the rollup configuration file](https://github.com/P233/re-frame-template/blob/master/rollup.config.js) for more details. \
**[2]**: You'll need to [install clj-kondo globally](https://github.com/borkdude/clj-kondo/blob/master/doc/install.md). \
**[3]**: The Clojure CLI tool is required, I wonder if cljfmt can be called via shadow-cljs. \
**[4]**: Remove the `.npmrc` file and the `:repositories` key from `shadow-cljs.edn`, if you are not located in China.

Please feel free to submit a PR or open a new issue, if you'd like to improve this package in any way possible.

MIT License
