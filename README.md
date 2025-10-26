# RestAssuredApi-Homework5:
API Test Project:
This project contains automated API tests for CRUD operations on the Swagger Petstore user endpoint using Rest Assured and TestNG. 
It is designed to demonstrate creating, reading, updating, and deleting users programmatically and validating responses.

Project Overview:
This project performs the following operations on the Swagger Petstore API:
Create User – Sends a POST request to create a new user.
Read User – Sends a GET request to verify the created user.
Update User – Sends a PUT request to modify user details.
Delete User – Sends a DELETE request to remove the user.
All tests validate API response codes and response body fields.


Tech:
Java 17
Maven
TestNG
Rest Assured
JSONPath

Test Structure:
ApiTestCrud.java – Contains CRUD test cases.
ApiHelper.java – Handles HTTP requests (GET, POST, PUT, DELETE).
UserDataGenerator.java – Generates random user data for testing.
DataUtils.java – Reads JSON files.
FileConstant.java – Stores file paths and constants.
