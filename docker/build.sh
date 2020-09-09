#!/bin/bash

CURRENT_DIR=`pwd`

cd "../$1"

[ $? -eq 0 ] || exit 1

JAVA_BUILD_DIR=`pwd`

mvn clean package -DskipTests=true

cp ../docker/Dockerfile .

docker build --build-arg JAR_FILE=target/*.jar -t chris/$1 .

rm Dockerfile
