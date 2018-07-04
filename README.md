# TechArticle
A tech blogging site. Project is based on spring
framework using Spring boot with packages
- Spring MVC
- Spring JPA including Spring Data and Spring Hibernate
- Postgresql driver

### Done
- Rest endpoints for author and articles
- ManyToOne bidirectional mapping of articles and author

### TODO
- Security using Spring Security and Spring Cloud OAuth2
- Frontend (Angular/React and Vue)
- Dockerfile for backend and frontend
- docker-compose.yml for single command deploy of whole project

#### Note
'application.properties' contains link to postgresql running
on docker container with default exposed port of 5432. If want to use
postgresql running locally just change the port to localhost or
if postresql running on remote server like Google Cloud Platform
add the public IP address of the server.
 