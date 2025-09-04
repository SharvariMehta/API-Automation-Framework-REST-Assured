# 🚀 REST Assured API Automation Framework

---

![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Framework](https://img.shields.io/badge/Framework-REST%20Assured-00A4EF?style=for-the-badge\&logo=swagger\&logoColor=white)
![Language](https://img.shields.io/badge/Language-Java-red?style=for-the-badge\&logo=openjdk)
![Build Tool](https://img.shields.io/badge/Build-Maven-blue?style=for-the-badge\&logo=apache-maven)
![Test Framework](https://img.shields.io/badge/TestNG-AssertJ-green?style=for-the-badge)
![Reports](https://img.shields.io/badge/Report-Allure-purple?style=for-the-badge\&logo=allure)
![Logs](https://img.shields.io/badge/Logs-log4j-orange?style=for-the-badge)
![Linting](https://img.shields.io/badge/Linting-SonarLint-critical?style=for-the-badge\&logo=sonarlint)
![Repo Type](https://img.shields.io/badge/Repo%20Type-Testing%20Portfolio-blue?style=for-the-badge\&logo=github)

---

## 📌 Overview

This project is a **robust API Automation Framework** built with **Java + REST Assured** and designed for **scalability, maintainability, and CI/CD readiness**. It validates REST APIs against functional requirements, integrates with reporting & logging tools, and follows industry-standard best practices.

The framework is modular, supports **test data-driven testing**, and integrates seamlessly with **CI/CD pipelines (Jenkins)** while maintaining clean code quality with **SonarLint**.

---

## 🛠️ Tech Stack

| Category                   | Tools / Libraries               |
| -------------------------- | ------------------------------- |
| **Language**               | Java (JDK 21 → 24 supported)    |
| **API Testing**            | REST Assured                    |
| **Build Tool**             | Maven                           |
| **Test Framework**         | TestNG + AssertJ                |
| **Payload Management**     | POJOs with GSON & Jackson API   |
| **Reporting**              | Allure Report                   |
| **Logging**                | log4j                           |
| **Test Data**              | JSON Files & Excel (Apache POI) |
| **Linting / Code Quality** | SonarLint                       |
| **Version Control**        | Git & GitHub                    |
| **CI/CD**                  | Jenkins                         |

---

## 📂 Project Structure

```
API-Automation-Framework/
│── src/main/java/           # Core framework code
│   ├── base/                # Base setup classes
│   ├── utils/               # Utilities (Excel, JSON, Config)
│   ├── pojo/                # Request & Response POJOs
│── src/test/java/           # Test classes
│   ├── tests/               # API test cases
│   ├── data/                # Test data readers
│── testdata/                # JSON & Excel files
│── reports/                 # Allure Reports
│── logs/                    # log4j logs
│── pom.xml                  # Maven dependencies
│── README.md                # Project documentation
```

---

## ⚡ Key Features

* ✅ **Reusable Request Specification** for base URI, headers, authentication
* ✅ **POJO-based Payload Management** using **GSON & Jackson API**
* ✅ **Data-driven Testing** via JSON & Excel (Apache POI)
* ✅ **Custom Assertions** with **AssertJ** for fluent validation
* ✅ **Allure Reporting** with detailed test execution insights
* ✅ **Centralized Logging** using **log4j**
* ✅ **Clean Code Practices** enforced by **SonarLint**
* ✅ **Git + Jenkins CI/CD Integration** for continuous testing

---

## 📊 Test Flow

1. **Authentication API** → Fetch token
2. **CRUD Operations** → Create / Update / Delete resource using REST Assured
3. **Validation** → Assertions using TestNG + AssertJ
4. **Reporting & Logs** → Allure + log4j integration

---

## 🌟 Why This Project Stands Out

* **Enterprise-grade design** – separation of concerns with clean packages
* **Scalable test data strategy** – JSON + Excel-based approach
* **CI/CD Ready** – Jenkins & GitHub integration
* **Developer Friendly** – SonarLint & log4j ensure code quality & traceability

---

## 📧 Contact

👤 **Sharvari Mehta**
📩 Email: [sharvarimehta97@gmail.com](mailto:sharvarimehta97@gmail.com)
💼 LinkedIn: [linkedin.com/in/sharvarimehta](https://www.linkedin.com/in/sharvarimehta)
🚀 GitHub: [github.com/sharvarimehta](https://github.com/sharvarimehta)

---