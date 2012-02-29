#!/bin/bash

dir=`dirname $0`
java -Dproducerconsumer.table=$1 -Dproducerconsumer.producer=$2 -Dproducerconsumer.consumer=$3 -Dproducerconsumer.limit=$4 -jar ${dir}/../lib/pc.jar

