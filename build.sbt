ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "DataSentinel"
  )

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.1",
  "org.apache.spark" %% "spark-sql" % "3.5.1",
  "org.scalatest" %% "scalatest" % "3.2.19" % Test,
  "com.dimafeng" %% "testcontainers-scala-scalatest" % "0.41.3" % Test,
  "com.holdenkarau" %% "spark-testing-base" % "3.5.1_1.5.3" % Test,
  "com.typesafe" % "config" % "1.4.3",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.12.765",
  "org.postgresql" % "postgresql" % "42.7.3",
  "mysql" % "mysql-connector-java" % "8.0.33",
  "com.microsoft.sqlserver" % "mssql-jdbc" % "12.7.0.jre11",
  "com.oracle.database.jdbc" % "ojdbc8" % "23.3.0.23.09",
  "org.apache.iceberg" %% "iceberg-spark-runtime-3.5" % "1.6.0",

)

