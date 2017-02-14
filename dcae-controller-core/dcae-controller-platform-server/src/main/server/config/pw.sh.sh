#!/bin/bash

### used to generate random passwords


echo '#!/bin/bash'
echo ""

echo 'cat \'

for i in CONSOLE GUI CLIENT MONITOR
do 
  echo  '  |' sed s/${i}_PW/$(echo $i:$(date +%s) | sha256sum | base64 | head -c 20 ; echo)/ \\
done
  