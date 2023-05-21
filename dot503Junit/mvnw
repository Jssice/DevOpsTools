#!/bin/bash

MAVEN_VERSION=3.8.1

MAVEN_URL=https://apache.osuosl.org/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz

if [ ! -d "apache-maven-$MAVEN_VERSION" ]; then
    curl $MAVEN_URL --output apache-maven-$MAVEN_VERSION-bin.tar.gz
    tar -xf apache-maven-$MAVEN_VERSION-bin.tar.gz
fi

./apache-maven-$MAVEN_VERSION/bin/mvn "$@"
