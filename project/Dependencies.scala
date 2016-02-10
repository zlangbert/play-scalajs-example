import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

/**
  * Specifies the project's dependencies
  */
object Dependencies {

  /**
    * The dependencies specific to the server
    */
  lazy val server = Def.setting(Seq(
    "com.vmunier" %% "play-scalajs-scripts" % "0.4.0"
  ))

  /**
    * The dependencies specific to the client
    */
  lazy val client = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.8.2"
  ))

  /**
    * Dependencies shared between
    */
  lazy val shared = Def.setting(Seq())
}
