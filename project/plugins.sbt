addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.6.2")

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.5.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.7")
