object Versions extends ScalaJS {
  val scalaPrimary = "2.12.2"
  val scalaOlder = Seq("2.12.1", "2.11.8", "2.11.5")  // todo add more
}

trait ScalaJS {
  // this is the current version of facades
  // bintray do not use SNAPSHOT
  // todo on update:
  //                What do with version? Must change on every publish?
  val scalaJSGoogleCharts = "0.2.0"
}