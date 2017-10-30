docker build -t docker-springboot .

docker tag 7aadd445009e sagarmahapatro/docker-springboot:latest

docker push sagarmahapatro/docker-springboot:latest


$ docker run -d -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=db -p 3306:3306 --name sb_docker mysql:latest