scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.spire-math" %% "cats" % "0.4.0-SNAPSHOT",
  "com.chuusai" %% "shapeless" % "2.2.5",
  "com.github.mpilquist" %% "simulacrum" % "0.5.0",
  "io.github.jto" %% "validation-core" % "1.0.2",
  "io.github.jto" %% "validation-json" % "1.0.2",
  compilerPlugin("org.scalamacros" %% "paradise" % "2.1.0-M5" cross CrossVersion.full),
  compilerPlugin("org.spire-math" %% "kind-projector" % "0.6.3"))

resolvers += Resolver.sonatypeRepo("snapshots")

scalacOptions := Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yinline-warnings",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)
