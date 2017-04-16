#/bin/bash

case $(/opt/cdap/cli/bin/cdap-cli.sh -u localhost list namespaces | head -1) in
  Successfully*) 
    echo GREEN 
    ;;
  *) 
    echo "RED:CDAP service down" 
    ;;
esac
