enablePlugins(SbtPlugin)

organization := "com.example"

name := "cnfgr-installer-test"

ThisBuild / organization := "technology.kapp"
ThisBuild / homepage := Some(url("https://github.com/zoosky/cnfgr-installer-test"))
ThisBuild / licenses += (("BSD 3-Clause", url("https://github.com/rtimush/cnfgr-installer-test/blob/master/LICENSE")))
ThisBuild / developers := List(
  Developer("zoosky", "Andreas Kapp", "zoosky@gmail.com", url("https://github.com/zoosky"))
)
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/zoosky/cnfgr-installer-test"),
    "scm:git:https://github.com/zoosky/cnfgr-installer-test.git",
    Some("scm:git:git@github.com:zoosky/cnfgr-installer-test.git")
  )
)

ThisBuild / scalacOptions := Seq("-deprecation", "-unchecked", "-feature")
