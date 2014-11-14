name := "IntroWorksheets"

organization := "org.scala-meetup-mvd"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.2"

libraryDependencies += "org.scalatest"     %% "scalatest"    % "2.2.1" % "test"

//Scala compiler options
scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",         // yes, this is 2 args
  "-Xlint",
  "-Xfuture",
  "-Xexperimental",
  "-Xlog-reflective-calls",
  "-Xcheckinit",
  "-unchecked"
  //"-Ywarn-dead-code",           // N.B. doesn't work well with the ??? hole
  //"-Ywarn-numeric-widen",
  //"-Ywarn-value-discard",
  //"-Xfatal-warnings",           // Does not work well with DelayedInit
  //"-feature",
  //"-language:existentials",
  //"-language:higherKinds",
  //"-language:implicitConversions",
  //"-Yno-adapted-args",
)



