# Daily Expenses Sharing Application

This project is a backend implementation for a daily expenses sharing application. The application allows users to add expenses and split them based on three different methods: exact amounts, percentages, and equal splits. The application manages user details, validates inputs, and generates downloadable balance sheets.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Requirements](#requirements)
- [Setup and Installation](#setup-and-installation)
- [API Endpoints](#api-endpoints)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)
- [Contributing](#contributing)

## Features

- User management: create and retrieve user details
- Expense management: add expenses, retrieve individual user expenses, retrieve overall expenses, and download balance sheets
- Expense splitting methods: equal split, exact amounts, and percentages
- Data validation
- Documentation with clear and concise code comments

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- H2 Database (for in-memory testing)

## Requirements

- Java 8 or higher
- Maven
- MySQL

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/daily-expenses-sharing.git
   cd daily-expenses-sharing
2. Update the application.properties file with your MySQL database connection details:
 ```bash
spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
```
3. Create the MySQL database:
```
CREATE DATABASE yourdatabase;
```
4. Build the project using Maven:
```
mvn clean install
```
5. Run the application:
```
mvn spring-boot:run
```
# API Endpoints
## User Endpoints
Create User

http
```
POST /api/users
Request Body:
```
json
```
{
  "email": "user@example.com",
  "name": "User Name",
  "mobileNumber": "1234567890"
}
```
## Retrieve User Details

http
```
GET /api/users/{id}
```
## Expense Endpoints
Add Expense

http
```
POST /api/expenses
```
Request Body:

json
```
{
  "description": "Dinner",
  "amount": 100.0,
  "splitMethod": "EQUAL",
  "userShares": {
    "user1@example.com": 25.0,
    "user2@example.com": 25.0,
    "user3@example.com": 25.0,
    "user4@example.com": 25.0
  }
}
```
## Retrieve Individual User Expenses

http
```
GET /api/expenses/user/{userId}
```
## Retrieve Overall Expenses

http
```
GET /api/expenses
```
## Download Balance Sheet

http
```
GET /api/expenses/balance-sheet
```
Database Configuration
Update your application.properties file with the correct MySQL connection details:

properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
```
Running the Application
To run the application, use the following command:

bash
```
mvn spring-boot:run
The application will start on http://localhost:8080.
```
##Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your changes.
