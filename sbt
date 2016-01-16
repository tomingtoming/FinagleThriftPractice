#!/bin/bash -au
JARURL=http://central.maven.org/maven2/com/typesafe/sbt/sbt-launcher/0.13.6/sbt-launcher-0.13.6.jar
JARFILE=$(dirname $0)/sbt-launch.jar

if [ ! -e "$JARFILE" ]
then
  curl -so $JARFILE $JARURL
fi

SBT_OPTS="-Xms64M -Xmx256M"
java $SBT_OPTS -jar $JARFILE "$@"
