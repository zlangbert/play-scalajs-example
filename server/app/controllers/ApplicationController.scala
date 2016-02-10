package controllers

import play.api.mvc._

class ApplicationController extends Controller {

  /**
    * Our index action simply needs to return our client.html view,
    * which in turn is including our compiled Scala.js sources
    */
  def index = Action {
    Ok(views.html.client())
  }
}
