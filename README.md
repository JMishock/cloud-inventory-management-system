# Cloud-Ready Inventory Management System

A Spring Boot inventory management application for managing products, parts, inventory constraints, and purchasing workflows, with a proposed scalable AWS deployment architecture.

## Project Overview

The application manages inventory for a retail supply business where products are composed of associated parts. It supports inventory tracking, product-part relationships, purchasing workflows, and validation of minimum and maximum inventory levels.

The project combines a Java/Spring Boot application with cloud architecture planning for scalability, availability, monitoring, and maintainability.

## Core Features

- Add and update in-house parts
- Add and update outsourced parts
- Create and manage products
- Associate parts with products
- Track minimum and maximum inventory levels
- Validate inventory constraints
- Purchase products through a "Buy Now" workflow
- Prevent invalid inventory submissions

## Technology Stack

- Java
- Spring Boot
- Thymeleaf
- Spring Data JPA / Hibernate
- H2 Database
- HTML / CSS
- Maven

## Application Architecture

The application follows a layered architecture:

- **Presentation Layer:** Thymeleaf-based web interface
- **Application Layer:** Spring Boot controllers and business logic
- **Persistence Layer:** JPA/Hibernate data access
- **Validation Layer:** Inventory and business-rule enforcement

## Proposed AWS Architecture

The application can be migrated to AWS using a scalable architecture built around managed cloud services.

### Compute

The Spring Boot application can run on Amazon EC2 or AWS Elastic Beanstalk.

### Database

Amazon RDS can replace the local H2 database to provide managed relational database persistence.

### Load Balancing

An Application Load Balancer can distribute incoming requests across multiple application instances.

### Auto Scaling

EC2 Auto Scaling can adjust application capacity based on demand and improve availability.

### Monitoring and Logging

Amazon CloudWatch can provide application monitoring, centralized logging, metrics, and alerting.

### Security

AWS IAM can provide role-based access to AWS resources, while security groups can restrict network traffic between the application and database tiers.

## Proposed Cloud Architecture

```text
                User / Browser
                      |
                      v
          Application Load Balancer
                      |
                      v
              EC2 Auto Scaling
          Spring Boot Application
                      |
                      v
                 Amazon RDS

Monitoring / Logging: Amazon CloudWatch
Access Management:    AWS IAM
Network Security:     Security Groups
```

This design demonstrates how the existing application could evolve from a locally hosted Spring Boot application into a scalable cloud deployment using AWS services.

## Engineering Concepts Demonstrated

- Object-oriented Java development
- Spring Boot application development
- Layered application architecture
- JPA / Hibernate persistence
- Relational data modeling
- Business-rule validation
- Inventory constraint enforcement
- AWS architecture design
- Scalability and availability planning
- Cloud monitoring and security concepts

## Future Enhancements

- Replace server-rendered pages with a REST API and modern front end
- Migrate from H2 to Amazon RDS
- Add authentication and role-based access control
- Containerize the application with Docker
- Implement CI/CD deployment pipelines
- Add CloudWatch dashboards and alarms
- Store static assets and backups in Amazon S3
