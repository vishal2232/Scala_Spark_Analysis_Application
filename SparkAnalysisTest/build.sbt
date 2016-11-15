name := "SparkSimpleTest"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq( "org.apache.spark" %% "spark-core" % "1.3.1",
  "org.apache.spark" %% "spark-sql" % "1.3.1", "org.apache.spark" %% "spark-streaming" % "1.3.1")
    