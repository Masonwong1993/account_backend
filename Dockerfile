FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD 1993
ADD script.sql /docker-entrypoint-initdb.d
EXPOSE 3306