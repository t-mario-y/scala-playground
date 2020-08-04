name := "scala-playground"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies := Seq(
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "io.spray" %% "spray-json" % "1.3.5",
  "org.slf4j" % "slf4j-simple" % "1.7.25"
)
