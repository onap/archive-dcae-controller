#!/bin/bash

_die() {
        echo "$1"
        exit 2;
}

_exit() {
        echo "$1"
        exit 0;
}

SFILE=/etc/default/docker
DFILE=/tmp/docker

grep 'mtu=1400' $SFILE 1>/dev/null || _die "Could not open $SFILE"

[ $? -eq 0 ] && _exit "DOCKER_OPTS already updated"

[ ! -f ${SFILE}.ori ]  && sudo -uroot cp -p ${SFILE} ${SFILE}.ori

cp -p $SFILE $DFILE

sed --in-place -e 's/DOCKER_OPTS="--debug/DOCKER_OPTS="--mtu=1400 --debug/' ${DFILE}

grep 'mtu=1400' $DFILE 1>/dev/null || _die "Could not adjust DOCKER_OPTS"

[ -s $DFILE ] && sudo -uroot cp -p $DFILE $SFILE
