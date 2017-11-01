docker build -t docker-springboot .

docker tag 7aadd445009e sagarmahapatro/docker-springboot:latest

docker push sagarmahapatro/docker-springboot:latest


docker run -d --name mysql-sbddb -e MYSQL_ROOT_PASSWORD=sagar -e MYSQL_DATABASE=sbduserdb -e MYSQL_USER=dbuser -e MYSQL_PASSWORD=dbuser -p 3306:3306  mysql:latest
	
docker run -d --name spring-boot-jpa-docker-example --link mysql-sbddb:mysql -p 8080:8080 -e DATABASE_HOST=mysql-sbddb  -e DATABASE_PORT=3306 -e DATABASE_NAME=sbduserdb -e DATABASE_USER=dbuser -e DATABASE_PASSWORD=dbuser sagar/dockerspringbootexample:latest