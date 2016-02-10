/**
  * The build file for the app. All sub-projects and build settings are defined here.
  *
  * Dependencies are defined in the [[Dependencies]] object
  */

/**
  * The name of the root project.
  * Set this to the name of your project!
  */
name := "play-scalajs-seed"

version := "1.0-SNAPSHOT"

/**
  * [[ThisBuild]] is the build in the current context, whatever build that may be.
  * In this case it allows us to set the scala version for every project defined
  * here. Note it is still possible to override this in a specific project's settings
  */
scalaVersion in ThisBuild := "2.11.7"

/**
  * The Play server project
  */
lazy val server = project
  .enablePlugins(PlayScala)
  .aggregate(client)
  .dependsOn(sharedServer, client)
  .settings(
    scalaJSProjects := Seq(client),

    routesGenerator := InjectedRoutesGenerator,
    pipelineStages := Seq(scalaJSProd, digest, gzip),

    libraryDependencies ++= Dependencies.shared.value ++ Dependencies.server.value
  )

/**
  * A project for client sources (i.e Scala.js)
  *
  * This project will have access to all sources and dependencies in its own
  * project and sources in [[shared]]
  */
lazy val client = project
  .enablePlugins(ScalaJSPlugin, ScalaJSPlay)
  .dependsOn(sharedClient)
  .settings(
    persistLauncher := true,
    persistLauncher in Test := false,
    libraryDependencies ++= Dependencies.shared.value ++ Dependencies.client.value
  )

/**
  * A project for sources shared between the client and server.
  *
  * This is a [[CrossType.Full]] project, meaning there are directories for
  * server/jvm specfic sources, client/js specific sources, and sources shared between both.
  */
lazy val shared = crossProject
  .jsConfigure(_ enablePlugins ScalaJSPlay)
    .settings(
      libraryDependencies ++= Dependencies.shared.value
    )

// the cross project must be split into its two actual project to be used/depended on
lazy val sharedServer = shared.jvm
lazy val sharedClient = shared.js

// loads the Play project at sbt startup
onLoad in Global := (Command.process("project server", _: State)) compose (onLoad in Global).value
