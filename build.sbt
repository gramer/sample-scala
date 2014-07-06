name := "sample-scala"

version := "1.0"

scalaVersion := "2.10.4"

val springVersion = "3.2.9.RELEASE"
val jbossVersion = "3.5.6-Final"

// utils
libraryDependencies ++= Seq(
	"org.codehaus.jackson" % "jackson-core-asl" % "1.6.1",
	"org.slf4j" % "slf4j-api" % "1.6.1",
	"org.slf4j" % "slf4j-log4j12" % "1.6.1",
	"log4j" % "log4j" % "1.2.16" 
)

// core frameworks 
libraryDependencies ++= Seq(
	"org.springframework" % "spring-expression" % springVersion,
	"org.springframework" % "spring-beans" % springVersion,
	"org.springframework" % "spring-core" % springVersion,
	"org.springframework" % "spring-context" % springVersion,
	"org.springframework" % "spring-context-support" % springVersion,
	"org.springframework" % "spring-jdbc" % springVersion,
	"org.springframework" % "spring-orm" % springVersion,
	"org.hibernate" % "hibernate-core" % jbossVersion,
	"org.hibernate" % "hibernate-entitymanager" % jbossVersion,
	"org.hibernate" % "hibernate-validator" % "4.1.0.Final",
	"javax.validation" % "validation-api" % "1.0.0.GA",
	"commons-dbcp" % "commons-dbcp" % "1.2.2",	
 	"com.h2database" % "h2" % "1.4.179"
)

// test
libraryDependencies ++= Seq(
	"org.scala-tools.testing" % "specs_2.10" % "1.6.9" % "test"
)



