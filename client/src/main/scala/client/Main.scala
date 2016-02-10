package client

import org.scalajs.dom

import scala.scalajs.js.JSApp

/**
  * The entry point for the Scala.js app.
  *
  * This is exported as `client.Main` (the fully qualified type name) in javascript.
  * The launcher that the Scala.js build system generates is simply a call to `client.Main().main()`
  */
object Main extends JSApp {

  override def main(): Unit = {

    val content = dom.document.getElementsByClassName("message")(0)
    content.textContent = "Hello from Scala.js!"
  }
}
