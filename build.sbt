organization := "com.balajisivaraman"

version := "0.1.0"

scalaVersion := "2.11.8"

name := "tic-tac-toe"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")