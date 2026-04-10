# Java Calculator App with ADO Pipeline

A Java SimpleCalculator application with comprehensive unit tests, integrated with Azure DevOps CI/CD pipeline and MongoDB support.

## Overview

This project demonstrates:
- **Java 11** application development
- **JUnit** unit testing framework
- **Maven** build automation
- **MongoDB** integration
- **Azure Pipelines** CI/CD automation
- **Azure Artifacts** package management

## Features

- Simple calculator functionality
- Complete unit test coverage
- Automated build and test pipeline
- Artifact publishing to Azure DevOps feed
- MongoDB integration for data persistence

## Build & Test

```bash
mvn clean package
```

## Connect to ADO Feed

To authenticate with ADO artifacts, encrypt your PAT in `settings.xml`:

```bash
mvn --encrypt-master-password <password>
```

For detailed instructions, refer to:
- [Microsoft Azure DevOps Artifacts - Maven Guide](https://learn.microsoft.com/en-us/azure/devops/artifacts/get-started-maven?view=azure-devops)
- [Maven Encryption Guide](https://maven.apache.org/guides/mini/guide-encryption.html)

## CI/CD Pipeline

The Azure Pipelines configuration automates:
1. Java 11 installation
2. Maven clean package build
3. JUnit test execution
4. Test results publishing
5. Build artifact creation
6. Deployment to ADO techbrain-feed
