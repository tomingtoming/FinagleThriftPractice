#!/bin/bash -au
JARURL=https://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/sbt-launch/0.13.9/sbt-launch.jar
JARFILE=$(dirname $0)/sbt-launch.jar

if [ ! -e "$JARFILE" ]
then
  curl -Lso $JARFILE $JARURL
fi

SBT_OPTS="-Xms64M -Xmx256M"
java $SBT_OPTS -jar $JARFILE "$@"
