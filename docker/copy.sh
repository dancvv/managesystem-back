#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20220814.sql ./mysql/db
cp ../sql/ry_config_20220510.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../uavsystem-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy uavsystem-gateway "
cp ../uavsystem-gateway/target/uavsystem-gateway.jar ./ruoyi/gateway/jar

echo "begin copy uavsystem-auth "
cp ../uavsystem-auth/target/uavsystem-auth.jar ./ruoyi/auth/jar

echo "begin copy uavsystem-visual "
cp ../uavsystem-visual/uavsystem-monitor/target/uavsystem-visual-monitor.jar  ./ruoyi/visual/monitor/jar

echo "begin copy uavsystem-modules-system "
cp ../uavsystem-modules/uavsystem-system/target/uavsystem-modules-system.jar ./ruoyi/modules/system/jar

echo "begin copy uavsystem-modules-file "
cp ../uavsystem-modules/uavsystem-file/target/uavsystem-modules-file.jar ./ruoyi/modules/file/jar

echo "begin copy uavsystem-modules-job "
cp ../uavsystem-modules/uavsystem-job/target/uavsystem-modules-job.jar ./ruoyi/modules/job/jar

echo "begin copy uavsystem-modules-gen "
cp ../uavsystem-modules/uavsystem-gen/target/uavsystem-modules-gen.jar ./ruoyi/modules/gen/jar

