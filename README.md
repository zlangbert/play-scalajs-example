# play-scalajs-example

A starting point for Play/Scala.js projects. This is meant to be a seed for future
projects, but also to help anyone using it understand more about how the setup works.
Much of the code is commented with explanations and further detail.

## Getting Started

```
git clone https://github.com/zlangbert/play-scalajs-example.git <my-folder-name>
cd my-folder-name
sbt run
```

This will start the Play server with the app viewable at `http://localhost:9000/`

## Setup Overview

The project is managed using [sbt](http://www.scala-sbt.org/). There is a root project,
with three sub-projects: `server`, `client`, and `shared`.

* `server`: The Play framework, server code, and assets
* `client`: The root of the Scala.js project. All sources here will end up as javascript.
* `shared`: Sources meant to be shared between the client and server. By default a
            "Full" cross project is used, which you can read more about
            [here](http://www.scala-js.org/api/sbt-scalajs/0.6.6/#org.scalajs.sbtplugin.cross.CrossProject).

This example projects makes use of [sbt-play-scalajs](https://github.com/vmunier/sbt-play-scalajs),
a great sbt plugin by [vmunier](https://github.com/vmunier). This plugin does much of the heavy
lifting tying together Play and Scala.js.

## Developer Workflow

There are multiple ways to edit and run the project. You can use a basic text editor
and run `sbt` from the command line. You can use an IDE with full support for Scala and Play.
Or some combination of both.

Either way, once you start the Play development server, it will watch for changes to any source file
and recomplie/reload. Thanks to the sbt incremental compiler, turnaround time when making a change
is pretty short.

### IntelliJ

If you want to use an IDE, I would recommend using IntelliJ. Importing projects is easy and it's Scala
support is excellent. Additionally it has built-in support for Play if you are using the Ultimate edition
(note if you are using it for education or training proposes you can receive a free Ultimate license).

1. Install IntelliJ
1. Install the Scala plugin
1. Import the project ([guide here](https://www.jetbrains.com/idea/help/getting-started-with-sbt.html#import_project))
1. (optional) Add a `Run Configuration` to start the play dev server. If you don't do this, you will
    need to run `sbt` from the command-line.

### Eclipse

It is possible to use Eclipse as well. Using the [Scala IDE](http://scala-ide.org/) and the sbteclipse
sbt plugin (included in this project), you can generate Eclipse projects.

## References

[Play documentation](https://www.playframework.com/documentation/2.4.x/Home)

[Scala.js documentation](http://www.scala-js.org/doc/)
