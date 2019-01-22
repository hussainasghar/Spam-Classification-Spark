name := "Scala-Spark"

version := "1.0"

scalaVersion := "2.11.12"


//resolvers += "Big Bee Consultants" at "http://dl.bintray.com/rick-beton/maven"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql_2.11
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.2.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-mllib
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.2.0"

//SparkNLP
//libraryDependencies += "com.johnsnowlabs.nlp" % "spark-nlp_2.11" % "1.4.2"

// https://mvnrepository.com/artifact/org.apache.spark/spark-hive_2.10
//libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.3.0"

//libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.3.0"

//libraryDependencies += "com.eed3si9n" % "sbt-assembly_2.8.1" % "sbt0.10.1_0.6"



// https://mvnrepository.com/artifact/databricks/spark-corenlp
//libraryDependencies += "databricks" % "spark-corenlp" % "0.2.0-s_2.11"


//libraryDependencies +=  "com.databricks" %% "spark-csv" % "2.3.0"

//Standford Core-Nlp
/*
licenses := Seq("GPL-3.0" -> url("http://opensource.org/licenses/GPL-3.0"))
resolvers += Resolver.mavenLocal
libraryDependencies ++= Seq(
  "edu.stanford.nlp" % "stanford-corenlp" % "3.6.0",
  "com.google.protobuf" % "protobuf-java" % "2.6.1",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.6.0" % "test" classifier "models",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
"edu.stanford.nlp" % "stanford-parser" % "3.6.0"

)
*/

// Chalk is library for NLP.
//libraryDependencies += "org.scalanlp" %% "chalk" % "1.3.0"

// https://mvnrepository.com/artifact/org.json/json
//libraryDependencies += "org.json" % "json" % "20090211"


// A little Text Processing Library
/*resolvers += "peoplepattern" at "https://dl.bintray.com/peoplepattern/maven/"

libraryDependencies += "com.peoplepattern" %% "lib-text" % "0.3"*/


//Microsoft Spark-MML Library
/*
resolvers += "MMLSpark Repo" at "https://mmlspark.azureedge.net/maven"
libraryDependencies += "com.microsoft.ml.spark" %% "mmlspark" % "0.11"
*/


/*
libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.5"
libraryDependencies +="org.slf4j" % "slf4j-api" % "1.7.1"
libraryDependencies +="ch.qos.logback" % "logback-classic" % "1.0.3"
libraryDependencies +=   "org.apache.spark" %% "spark-sql"  % "2.2.0"
libraryDependencies ++= Seq(
  "uk.co.bigbeeconsultants" %% "bee-client" % "0.29.+",
  "org.json4s" %% "json4s-native" % "3.2.9",
  "co.freeside" % "betamax" % "1.1.2" % "test",
  "org.codehaus.groovy" % "groovy-all" % "1.8.8" % "test"
)*/



