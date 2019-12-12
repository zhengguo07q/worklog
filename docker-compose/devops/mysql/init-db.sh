#!/usr/bin/env bash
echo "test"
cd /sql
ls -al
find /sql -name "*.sql"
cat /sql/db.sql
file /sql/db.sql
stat /sql/db.sql
echo 0
find /sql -name "*.sql" -exec ls {} \;
echo 1
find /sql -name "*.sql" -exec ls {} \;| grep -v postgres
echo 2
find /sql -name "*.sql" -exec ls {} \;| grep -v postgres | sort | tr ' ' '|' | tr '\n' ' '
for file in $(find /sql -name "*.sql" -exec ls {} \;| grep -v postgres | sort | tr ' ' '|' | tr '\n' ' ')
do
    file=$(echo ${file} | tr '|' ' ')
    printf "Applying update ${file}\n"
    mysql -uroot -p$MYSQL_ROOT_PASSWORD -h mysql < ${file}
done

while true;do echo hello docker;sleep 1;done