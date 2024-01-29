# Employees-Management-Full-stack-Application
It's Full Stack Application Using Angular &amp; J2EE

<h2>Project Description:- </h2>
<br>
<h3>Backend Description:- </h3>



<h5>ProjectOfEmployeeManagmentSystemApplication (Main Class):-</h5>
<p>
The main work of this class is to serve as the entry point for the Employee Management System application. It uses Spring Boot to initialize the application on server and print a welcome message to the console.
</p><br>

<h5>Model Class (Employee):-</h5>  <p>
This class represents the structure of an Employee entity for the Employee Management System. It defines attributes such as id, name, email, job title, phone, and image URL, along with their respective getters, setters, and a method for generating a string representation of an Employee object. It is also annotated to be used with a relational database using JPA (Java Persistence API).
</p>


<h5>Controller (EmployeeController):- </h5>  <p>
This EmployeeController class is responsible for managing HTTP requests related to employee data. It handles operations such as retrieving all employees, finding an employee by ID, adding a new employee, updating an existing employee, and deleting an employee. The class utilizes the Spring framework for building RESTful web services and allows cross-origin requests from port http://localhost:4200 for the Frontend.
</p>


<h5>Repository (EmployeeRepo):-</h5>  <p>
The EmployeeRepo interface serves as a repository for the Employee entity, allowing for the management of employee data in the Employee Management System. It extends the JpaRepository interface, which provides convenient methods for performing CRUD (Create, Read, Update, Delete) operations on the Employee entity. Additionally, it includes custom methods for deleting an employee by ID and finding an employee by ID. These custom methods provide specific functionality tailored to the requirements of the Employee Management System.

Overall, the EmployeeRepo interface encapsulates the data access and manipulation logic for the Employee entity, enabling efficient interaction with the underlying database..
</p>


<h5>Service EmployeeService:- </h5> <p>
The EmployeeService class is responsible for providing various operations related to employee management. Each method in the class performs specific tasks:

addEmployee(Employee employee): Generates a unique employee code for the provided employee and saves them into the system.

findAllEmployees(): Retrieves and returns a list of all employees registered in the system.

updateEmployee(Employee employee): Updates the details of an existing employee in the system.

findEmployeeById(Long id): Retrieves a specific employee by their ID, throwing an exception if the employee is not found.

deleteEmployee(Long id): Removes an employee from the system based on their ID.

The @Service annotation indicates that this class is a service component in the Spring framework, and the @Transactional annotation ensures the proper management of transactions for each method within the service.
</p>


<h5>Exception UserNotFoundException Class:- </h5>  <p>
The UserNotFoundException class is a custom exception used to represent the situation where a Employee is not found in the Employee Management System. It extends the RuntimeException class and has a constructor that takes a message, which is then passed to the parent class for handling. This exception is thrown to indicate that a Employee could not be found in the system.</p>



Author Name:- Pritam Marathe