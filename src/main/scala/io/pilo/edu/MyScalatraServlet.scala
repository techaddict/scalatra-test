package io.pilo.edu

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends EducationStack {

  get("/") {
    redirect("/home")
  }
  get("/home") {
    <h1>Home</h1>
  }
  notFound {
    <h1>404 Not found.</h1>
  }
}
