name := """play-java-seed"""
organization := "com.bebetterprogrammer"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.3"

libraryDependencies += guice

libraryDependencies ++= Seq(
  javaJdbc,
  evolutions,
  "mysql" % "mysql-connector-java" % "5.1.47"
)
