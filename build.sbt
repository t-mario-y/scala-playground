name := "scala-playground"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies := Seq(
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "io.spray" %% "spray-json" % "1.3.5",
  "org.slf4j" % "slf4j-simple" % "1.7.25"
)

lazy val root = (project in file("."))
  .settings(buildSettings)
  .settings(
    imageNames in docker := Seq(ImageName("scala-playground:latest"))
  ).enablePlugins(DockerPlugin)

lazy val buildSettings = Seq(
  dockerfile in docker := {
    val artifact = assembly.value
    val artifactTargetPath = s"/app/${artifact.name}"

    new Dockerfile {
      from("openjdk:8-jre")
      add(artifact, artifactTargetPath)
      entryPoint("java", "-jar", artifactTargetPath)
    }
  }
)
