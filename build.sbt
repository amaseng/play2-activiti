organization := "com.amaseng"

name := "play2-activiti"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.4"

playScalaSettings

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-jdbc" % "2.2.3",
  "org.activiti" % "activiti-engine" % "5.16.4",
  "org.scalatest" % "scalatest_2.10" % "2.2.2" % "test"
)

publishTo <<= version { v: String =>
       val nexus = "https://oss.sonatype.org/"
       if (v.trim.endsWith("SNAPSHOT")) Some("publish-snapshots" at nexus + "content/repositories/snapshots")
       else                             Some("publish-releases" at nexus + "service/local/staging/deploy/maven2")
     }

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
       <url>https://github.com/amaseng/play2-activiti</url>
         <licenses>
           <license>
             <name>the Apache License, ASL Version 2.0</name>
             <url>http://www.apache.org/licenses/LICENSE-2.0</url>
             <distribution>repo</distribution>
           </license>
         </licenses>
         <scm>
           <url>https://github.com/amaseng/play2-activiti</url>
           <connection>scm:git:git@github.com:amaseng/play2-activiti.git</connection>
           <developerConnection>
             scm:git:git@github.com:amaseng/play2-activiti.git
           </developerConnection>
         </scm>
         <developers>
           <developer>
             <id>cheeseng</id>
             <name>Chua Chee Seng</name>
             <email>cheeseng@amaseng.com</email>
           </developer>
         </developers>
      )
