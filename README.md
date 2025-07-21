# StudentApplication
Spring Boot project for a Student CRUD API using JPA and H2 in-memory database
Student CRUD Application (Spring Boot + H2 + REST API)
A simple Spring Boot project that provides CRUD operations for managing students using a RESTful API. It uses Spring Data JPA with an in-memory H2 database.

🛠️ Tech Stack

Java 17+

Spring Boot

Spring Data JPA

H2 Database (In-memory)

Maven

RESTful API


📂 Project Structure

com.example.studentapp

│

├── controller

│   └── StudentController.java

├── model

│   └── Student.java

├── repository

│   └── StudentRepository.java

├── StudentApplication.java

└── resources

    └── application.properties



⚙️ How to Run

Clone the repository

git clone https://github.com/your-username/student-crud-app.git

cd student-crud-app

Build and run the project

mvn spring-boot:run

App will be running on:

http://localhost:9090

H2 Console (to view in-memory DB)

http://localhost:9090/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: password


🔌 API Endpoints

Method	  Endpoint	            Description

GET	      /api/students	        Get all students

GET	      /api/students/{id}	Get student by ID

POST	  /api/students	        Add a new student

PUT	      /api/students/{id}	Update student by ID

DELETE	  /api/students/{id}	Delete student by ID


📝 Sample POST Payload

{

    "id": 1,
    
    "name": "Alice Johnson",
    
    "email": "alice.johnson@example.com",
    
    "age": 21
    
}


✅ Sample GET Response

[

    {
    
        "id": 1,
        
        "name": "Alice Johnson",
        
        "email": "alice.johnson@example.com",
        
        "age": 21
        
    },
    
    {
    
        "id": 2,
        
        "name": "Gabinesh",
        
        "email": "gabinesh@example.com",
        
        "age": 18
        
    },
    
    {
    
        "id": 3,
        
        "name": "Venba",
        
        "email": "venba@example.com",
        
        "age": 19
        
    },
    
    {
    
        "id": 4,
        
        "name": "Harish Bala",
        
        "email": "harish.bala@example.com",
        
        "age": 20
        
    }
    
]


🧪 Test Cases

Unit and integration tests can be added using JUnit and Spring Boot Test. See the StudentControllerTest.java file for examples.


💡 Notes

All student data will be lost when the app restarts (H2 in-memory DB).


You can switch to a persistent DB (like MySQL/PostgreSQL) by updating application.properties.

