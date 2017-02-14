#!/bin/bash
paramName=$1
paramValue=$2
#localpropertyfile="/home/dcae/SEC/SE-Collector-1.0.0-SNAPSHOT/etc/collector.properties"
#localadminscript="/home/dcae/SEC/SE-Collector-1.0.0-SNAPSHOT/bin/SErestfulCollector.sh"
#tmpfile="/home/dcae/SEC/SE-Collector-1.0.0-SNAPSHOT/etc/collector.properties.tmp"

localpropertyfile="/opt/app/SEC/etc/collector.properties"
localadminscript="/opt/app/SEC/bin/SErestfulCollector.sh"
tmpfile="/opt/app/SEC/etc/collector.properties.tmp"


echo $paramName
echo $paramValue

 

case $1 in 
	"ADMIN")
		echo $localadminscript $2
 		$localadminscript $2
 		;;
 	*)
 		rm $tmpfile
		sed "s~$paramName=.*~$paramName=$paramValue~g" $localpropertyfile > $tmpfile
		echo `cat $tmpfile > $localpropertyfile`
		rm $tmpfile
		#$localadminscript stop
		#$localadminscript start
		;;
esac
## To be modified for supporting DMAAP