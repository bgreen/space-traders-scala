val scala3Version = "3.3.0"
val sttpVersion = "3.8.15"
val circeVersion = "0.14.1"
val json4sVersion = "3.6.11"

lazy val root = project
  .in(file("."))
  .aggregate(app, sdk)
  .settings(
    scalaVersion := scala3Version,
  )

lazy val app = project
  .in(file("app"))
  .dependsOn(sdk)
  .settings(
    name := "space-traders-scala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    //libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,

    //libraryDependencies += ("org.openapitools" % "openapi-client" % "1.0.1") cross CrossVersion.for3Use2_13
    libraryDependencies += ("org.json4s" %% "json4s-jackson" % "3.6.11") cross CrossVersion.for3Use2_13
    
  )

lazy val sdk = project
  .in(file("sdk"))
  .settings(
    version := "1.0.1",
    name := "openapi-client",
    organization := "org.openapitools",

    scalaVersion := "2.13.10",
    crossScalaVersions := Seq(scalaVersion.value, "2.12.17"),

    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.client3" %% "core" % sttpVersion,
      "com.softwaremill.sttp.client3" %% "circe" % sttpVersion,
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion
    ),

    scalacOptions := Seq(
      "-unchecked",
      "-deprecation",
      "-feature"
    )
  )