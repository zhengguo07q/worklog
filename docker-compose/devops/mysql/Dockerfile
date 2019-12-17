FROM ubuntu
MAINTAINER 85938406@qq.com
ENV WORK_PATH /sql
RUN mkdir -p $WORK_PATH
ADD init-db.sh /init-db.sh
RUN chmod +777 /init-db.sh
ENTRYPOINT /init-db.sh