addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.5.0")

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")

addSbtPlugin("com.typesafe" % "sbt-abide" % "0.1-SNAPSHOT")

addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "3.14.1")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

// Necessary for finagle-stats, which depends on com.twitter.common.metrics
resolvers += "twttr" at "http://maven.twttr.com/"
