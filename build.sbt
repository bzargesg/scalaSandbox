ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"


libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % Test
libraryDependencies += "junit" % "junit" % "4.13.2" % Test


lazy val root = (project in file("."))
  .settings(
    name := "ToyProblems"
  )
