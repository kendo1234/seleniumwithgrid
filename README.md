### Docker Selenium Grid Example ###

Building:

Network

- docker network create seleniumsandbox
- docker network inspect seleniumsandbox | jq

Grid

- docker run -d -p 4444:4444 --net seleniumsandbox --name selenium-hub selenium/hub:latest

Node

- docker run -d --net seleniumsandbox -e HUB_HOST=selenium-hub -v /dev/shm:/dev/shm selenium/node-chrome:latest

TODO: Explore Selenoid
