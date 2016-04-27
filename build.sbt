name := "scala-dao-example"
version := "0.01"
scalaVersion := "2.11.8"

libraryDependencies ++= {
  Seq(
    "mysql" % "mysql-connector-java" % "6.0.2",
    "org.hibernate" % "hibernate-core" % "5.1.0.Final"
  )
}
