
ThisBuild / name := "cassandra-poc"
ThisBuild / organization := "com.learn"
ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(
    Defaults.itSettings,
    libraryDependencies ++= Seq(
      //Logging
      "org.slf4j" % "slf4j-jdk14" % "1.7.21",
      "org.wvlet.airframe" %% "airframe-log" % "20.5.1",

      //Testing
      "org.scalactic" %% "scalactic" % "3.1.1",
      "org.scalatest" %% "scalatest" % "3.1.1" % "test,it",
      "com.dimafeng" %% "testcontainers-scala-scalatest" % Packages.TestContainers % "it",
      "com.dimafeng" %% "testcontainers-scala-cassandra" % Packages.TestContainers % "it",
      "org.testcontainers" % "localstack" % "1.14.2" % "it"
    )
  )