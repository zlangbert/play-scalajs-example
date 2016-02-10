// Play sbt plugin - provides the Play libraries and sbt settings/helpers
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.6")

// sbt-web plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")

// Scala.js plugin - provides compiler and library
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.6")

// A helper plugin to make setting up a Play/Scala.js project easier
addSbtPlugin("com.vmunier" % "sbt-play-scalajs" % "0.2.9")
