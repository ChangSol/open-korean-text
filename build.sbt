name := "Korean Text Processing Utilities SBT"

version := "4.0"

scalaVersion := "2.13.16"

libraryDependencies ++= Seq(
  "com.twitter" % "twitter-text" % "1.14.3",
  "org.slf4j" % "slf4j-nop" % "1.7.36" % "provided",
  "com.github.nscala-time"  %% "nscala-time"   % "2.32.0" % "provided",
  "org.scalatest"     %% "scalatest"   % "3.2.19" % "test",
  "junit"             %  "junit"       % "4.13.1"  % "test"
)
