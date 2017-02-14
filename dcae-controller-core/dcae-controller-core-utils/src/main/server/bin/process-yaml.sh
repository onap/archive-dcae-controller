#!/bin/bash

export JAVA_HOME=/opt/app/java/jdk/jdk170
export GROOVY_HOME=/opt/app/groovy/246

PATH=$JAVA_HOME/bin:$GROOVY_HOME/bin:$PATH

cd $(dirname $(dirname $(readlink -e $0)))

groovy -cp 'lib/*' scripts/process-yaml.groovy "$@"

chgrp dcae /var/config/DCAE/chef/*
