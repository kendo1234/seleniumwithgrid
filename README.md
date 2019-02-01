### Docker Selenium Grid Example ###

Building:

Network

- docker network create seleniumsandbox
- docker network inspect seleniumsandbox | jq

Grid

- docker run -d -p 4444:4444 --net seleniumsandbox --name selenium-hub selenium/hub:latest

Node

- docker run -d --net seleniumsandbox -e HUB_HOST=selenium-hub -v /dev/shm:/dev/shm selenium/node-chrome:latest

Selenoid Build

- curl -s https://aerokube.com/cm/bash | bash \
      && ./cm selenoid start --vnc --tmpfs 128
      
- ./cm selenoid-ui start


NOTE: Current driver setup in FirstTest is for selenoid 

### Docker Compose ###

I have included a docker compose file that sets up a hub and node. This is NOT for Selenoid, but a normal Grid-Docker implementation. 

To run - *docker-compose up*

Example of scaling up to 5 chrome nodes - *docker-compose scale chrome=5*


      