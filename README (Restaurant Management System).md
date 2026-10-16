# 🍴 Spice & Slice – Restaurant Management System

## 📌 Project Overview

**Spice & Slice** is a web-based Restaurant Management System developed to simplify restaurant operations and food ordering. It provides a user-friendly interface for browsing food items and supports restaurant data management through a Java-based web application connected to a MySQL database.

This project was developed as a college project using Java web technologies and the MVC architecture.

## 🎯 Objectives

- Develop a user-friendly restaurant website.
- Display food items across different categories.
- Manage restaurant information and orders through a database.
- Implement an admin login interface and administrative functionality.
- Connect the frontend and backend using Java Servlets and JDBC.
- Use AJAX for asynchronous web requests.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| HTML5 | Web page structure |
| CSS3 | Styling and layout |
| JavaScript | Client-side functionality |
| JSP | Dynamic web pages |
| Java Servlets | Backend request processing |
| JDBC | Database connectivity |
| MySQL 8.0 | Data storage |
| AJAX | Asynchronous requests |
| MVC Architecture | Application organization |
| Apache Tomcat 9 | Web application server |
| Eclipse IDE | Development environment |

## ✨ Key Features

- **Food Menu:** Browse available food items and categories.
- **Food Categories:** Includes pizza, burgers, pasta, Chinese food, and more.
- **Admin Login:** Provides an admin login interface.
- **Order Management:** Supports order-related operations implemented in the application.
- **Database Integration:** Stores and retrieves application data using MySQL.
- **Dynamic Web Pages:** Uses JSP and Servlets to process requests.
- **AJAX Integration:** Supports asynchronous communication where implemented.
- **MVC Architecture:** Separates application components for easier maintenance.

## 🏗️ Project Architecture

The project follows the Model-View-Controller (MVC) pattern:

- **Model:** Java classes and JDBC handle data access and business logic.
- **View:** JSP, HTML, CSS, and JavaScript provide the user interface.
- **Controller:** Java Servlets handle incoming requests and coordinate application processing.

## 📂 Project Structure

The exact folder structure may vary depending on your Eclipse project configuration. This is an illustrative example—update it to match your actual project before publishing.

```text
Spice-And-Slice/
├── src/
│   ├── controller/
│   ├── model/
│   └── dao/
├── WebContent/
│   ├── css/
│   ├── js/
│   ├── images/
│   ├── WEB-INF/
│   │   └── web.xml
│   └── *.jsp
├── database/
│   └── restaurantdb.sql
└── README.md
```

## ⚙️ Requirements

- Java Development Kit (JDK) 17
- Eclipse IDE for Enterprise Java and Web Development
- Apache Tomcat 9
- MySQL Server 8.0
- MySQL JDBC Driver

## 🚀 Installation and Setup

### 1. Clone the Repository

Replace `YOUR-USERNAME` with your GitHub username and adjust the repository URL if needed.

```bash
git clone https://github.com/YOUR-USERNAME/Spice-And-Slice.git
```

### 2. Import the Project into Eclipse

1. Open Eclipse IDE.
2. Select **File → Import → Existing Projects into Workspace**.
3. Select the downloaded project folder.
4. Finish the import process.

### 3. Configure MySQL

Start MySQL and create the database:

```sql
CREATE DATABASE restaurantdb;
```

If the repository includes an SQL export, import it to create the required tables and sample data. Update the database connection settings in the Java code.

Example JDBC connection:

```java
String url = "jdbc:mysql://localhost:3306/restaurantdb";
String username = "your_username";
String password = "your_password";

Connection con = DriverManager.getConnection(
    url, username, password
);
```

Replace the example credentials with your local MySQL credentials. **Do not upload real passwords or other secrets to GitHub.**

### 4. Configure Apache Tomcat

1. Add Apache Tomcat 9 to Eclipse.
2. Configure the project to use Tomcat.
3. Add the MySQL JDBC driver to the application's classpath.
4. Run the project on the server.

### 5. Open the Application

After starting the server, open the local URL configured for your application. For example:

```text
http://localhost:8080/Spice-And-Slice/
```

Adjust the context path to match your Eclipse project name.

## 🧪 Testing

Test the functionality implemented in your project, such as:

- Opening the home page and browsing food categories.
- Checking admin login validation.
- Verifying database connectivity.
- Testing food and order operations.
- Checking AJAX requests and responses.
- Verifying that invalid inputs are handled appropriately.

## 📚 Learning Outcomes

Through this project, I gained practical experience in:

- Java web application development.
- JSP and Servlet integration.
- MySQL database design and JDBC connectivity.
- MVC architecture.
- AJAX-based web interactions.
- Deploying Java web applications on Apache Tomcat.
- Integrating frontend and backend components.

## 🔮 Future Enhancements

- Online payment gateway integration.
- Customer registration and authentication.
- Order tracking and order history.
- Search, filtering, and sorting of food items.
- Improved responsive design.
- Enhanced security and input validation.

## 👩‍💻 Author

**Namrata Rai**  
B.Tech – Computer Science and Engineering

## 📄 License

This project was developed for educational purposes as a college project. Add an appropriate open-source license if you intend to distribute it publicly.
