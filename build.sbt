name := "spec2_test"

version := "0.1"

scalaVersion := "2.13.3"

val junit = "com.novocode" % "junit-interface" % "0.11" % Test

lazy val base = project.in(file("base"))

lazy val foo = project
  .in(file("foo"))
  .dependsOn(base)
  .settings(libraryDependencies ++= Seq(junit))

lazy val bar = project
  .in(file("bar"))
  .dependsOn(base)
  .settings(libraryDependencies ++= Seq(junit))
