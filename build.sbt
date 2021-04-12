
ThisBuild / scalaVersion := "2.13.5"

mainClass in (Compile, run) := Some("repro.Main")

lazy val root = (project in file("."))
  .settings(
    name := "zipkin-http-repro",
    libraryDependencies := Seq(
      "io.zipkin.finagle2" %% "zipkin-finagle-http" % "2.2.4"
    )
  )
