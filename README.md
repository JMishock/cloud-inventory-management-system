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

This application can be deployed as a scalable, cloud-based system using AWS services with the following architecture:

- Compute Layer: The Spring Boot application can be hosted on Amazon EC2 instances or deployed using Elastic Beanstalk for simplified management
- Database Layer: Amazon RDS can be used to provide a managed relational database for storing product and inventory data
- Load Balancing: An Application Load Balancer can distribute incoming traffic across multiple application instances to ensure high availability
- Auto Scaling: Auto Scaling Groups can automatically adjust the number of EC2 instances based on demand, ensuring performance during peak usage
- Monitoring and Logging: Amazon CloudWatch can be used to monitor application performance, log activity, and trigger alerts
- Security: AWS IAM can control access to resources, and security groups can restrict network traffic to the application and database layers

This architecture supports scalability, fault tolerance, and maintainability, aligning with AWS Well-Architected Framework principles.

## Future Enhancements
- Replace server-rendered pages with a REST API and modern front-end
- Add authentication and role-based access control
- Containerize the application with Docker
- Implement CI/CD deployment pipelines
- Add monitoring dashboards and alerting
- Store static assets and backups in Amazon S3

## Resume Highlights

- Designed and implemented a Spring Boot inventory management application supporting product-part relationships and inventory validation logic
- Applied layered architecture principles, including controller, service, and data access layers
- Implemented business rules for minimum and maximum inventory constraints to ensure data integrity
- Mapped the application to a scalable AWS architecture, including EC2, RDS, and load balancing concepts
- Demonstrated understanding of cloud design principles, including scalability, availability, and monitoring
