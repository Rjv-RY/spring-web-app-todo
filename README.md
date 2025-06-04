# SpringBoot Web App

This is a learning project where I explore Spring Boot by building a basic web application.

🔧 Tech Stack

    Spring Boot – Core framework and annotations

    Spring Security – For login, logout, and access control

    Spring Data JPA + Hibernate – Simplified database interactions via ORM

    MySQL – Main database (running in a Docker container)

    H2 – In-memory database for local testing

    JSP + Jasper – For server-side rendering

    Bootstrap – Frontend styling

    jQuery – (Included for Bootstrap compatibility; not used directly yet)

    Maven – Project build management


📦 Features

    Login/logout flow with route protection

    Server-rendered pages using JSP

    Form validation

    Dockerized database setup

    Uses Hibernate’s ddl-auto=update for schema management during dev

🐳 Running MySQL with Docker (Quick Setup)

    Have docker installed in your local machine

    Run the command: docker run --detach --env MYSQL_ROOT_PASSWORD=password --env MYSQL_USER=todos-user --env MYSQL_PASSWORD=password --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle
    Use the aformentioned command's details in the application.properties file, specifically in spring.datasource's .url, .password and .username statements.

    Hopefully the routes have no issues and your container is running without issues, so it works.
