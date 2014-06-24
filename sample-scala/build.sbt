name := "sample-scala"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
	"org.codehaus.jackson" % "jackson-core-asl" % "1.6.1",
	"org.scala-tools.testing" % "specs_2.10" % "1.6.9" % "test" 
)

