# Cloud-Ready Inventory Management System

## Project Overview
This project is a Spring Boot-based inventory management application designed to manage parts and products for a retail supply business. The system supports inventory tracking, product-part relationships, and business rules for minimum and maximum inventory levels.

This project was originally built as a Java Spring application and is now being reframed as a Solutions Architect portfolio project by mapping the system to a scalable AWS cloud architecture.

## Business Use Case
A retail technology supply business needs a system to manage inventory for products made up of multiple parts. The application helps track product availability, maintain valid inventory ranges, and support product purchasing workflows.

## Tech Stack
- Java
- Spring Boot
- Thymeleaf
- JPA / Hibernate
- H2 Database
- HTML/CSS

## Core Features
- Add and update in-house parts
- Add and update outsourced parts
- Track minimum and maximum inventory levels
- Validate inventory constraints
- Associate parts with products
- Buy products using a "Buy Now" workflow
- Prevent invalid inventory submissions

## Architecture Overview
The application follows a layered design:

- Presentation layer: Thymeleaf-based user interface
- Application layer: Spring Boot controllers and business logic
- Data layer: JPA/Hibernate persistence
- Validation layer: inventory and business rule enforcement

## Solutions Architect Perspective
From a cloud architecture perspective, this application can be deployed as a scalable web application using AWS services such as:

- Amazon EC2 or Elastic Beanstalk for application hosting
- Amazon RDS for relational database storage
- Application Load Balancer for traffic distribution
- Auto Scaling for elasticity
- Amazon CloudWatch for logging and monitoring
- IAM for secure administrative access

## Future Enhancements
- Replace server-rendered pages with a REST API and modern front-end
- Add authentication and role-based access control
- Containerize the application with Docker
- Implement CI/CD deployment pipelines
- Add monitoring dashboards and alerting
- Store static assets and backups in Amazon S3
