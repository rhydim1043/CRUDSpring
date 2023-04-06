# CRUDSpring
CRUD web application in using spring framework

#FUNCTIONALITIES
1. Person: a simple POJO (Plain Old Java Object) class representing a person with an id and a name.

2. PersonDao: an interface that defines the data access operations for the Person object. It contains two methods: int insertPerson(UUID id, Person person) and a default method int addPerson(Person person). insertPerson inserts a person object with the given UUID into the database, and addPerson generates a UUID and calls insertPerson to insert the person object with the generated UUID.

3. MockPersonDataAccessService: a mock implementation of the PersonDao interface, which uses an in-memory list to simulate a database.

4. PersonService: a service class that acts as an intermediary between the controller and the data access layer (PersonDao). It provides a single method addPerson(Person person) which calls insertPerson method of the injected PersonDao object to add a new person to the database.

5. PersonController: a REST API controller class that maps HTTP requests to the appropriate service methods. It provides CRUD (Create, Read, Update, Delete) operations for a Person object over HTTP.
