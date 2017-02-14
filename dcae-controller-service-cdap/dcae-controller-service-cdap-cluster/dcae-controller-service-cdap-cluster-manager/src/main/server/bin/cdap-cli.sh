#!/bin/bash

echo $(date) /opt/cdap/cli/bin/cdap-cli.sh "$@" >> logs/cdap-cli.log

sleep 5

echo y | /opt/cdap/cli/bin/cdap-cli.sh "$@" 

