name := "CMUSDS"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa, 
  "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
  "com.google.code.gson" % "gson" % "2.2.2",
  "com.amazonaws" % "aws-java-sdk" % "1.7.6",
  "com.google.guava" % "guava" % "14.0"
)

play.Project.playJavaSettings
