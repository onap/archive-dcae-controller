#!/bin/bash 

APP=$1

LOG1=$(echo $APP | sed s/dcae-//).err
LOG2=$(echo $APP | sed s/dcae-//).out

cat > | /etc/logrotate.d/$APP << EOF

/opt/app/$APP/logs/$LOG1 {
    missingok
    compress
    daily
    rotate 14
    dateext
    copytruncate
}

/opt/app/$APP/logs/$LOG2 {
    missingok
    compress
    daily
    rotate 14
    dateext
    copytruncate
}

EOF