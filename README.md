cdr-tools
=========

Setting up CDR on Hortonworks Sandbox
----------------------------------------

sandbox# yum install -y flume
sandbox# mkdir /root/cdr

local$ mvn package
local$ scp target/flume-cdr-source-*.jar lvm:/root/cdr/
local$ scp setup/flume.conf setup/flume-env.sh lvm:/etc/flume/conf/

sandbox# flume-ng agent -n CDRAgent -c /etc/flume/conf -f /etc/flume/conf/flume.conf
