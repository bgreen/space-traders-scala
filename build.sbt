val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .aggregate(app, sdk)

lazy val app = project
  .in(file("app"))
  .settings(
    name := "space-traders-scala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    //libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,

    //libraryDependencies += ("org.openapitools" % "openapi-client" % "1.0.1") cross CrossVersion.for3Use2_13
    
  )
  .dependsOn(sdk)

lazy val sdk = project
  .in(file("sdk"))
  .settings(
    version := "1.0.1",
    name := "openapi-client",
    organization := "org.openapitools",

    scalaVersion := "2.13.10",
    crossScalaVersions := Seq(scalaVersion.value, "2.12.17"),

    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.client3" %% "core" % "3.3.18",
      "com.softwaremill.sttp.client3" %% "json4s" % "3.3.18",
      "org.json4s" %% "json4s-jackson" % "3.6.11"
    ),

    scalacOptions := Seq(
      "-unchecked",
      "-deprecation",
      "-feature"
    )
  )