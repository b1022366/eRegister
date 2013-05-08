eRegister README
=========

## About
This project is a case study in the 12/13 web architectures module at Sheffield Hallam University.

The project was used to show various aspects of a web application system, which included a RESTful web service, 
domain modelling, configuration managment and controller development.

This project is specifically avoiding authentication as we get to grips with web architectures more generally. 
Authentication is dealt with elsewhere in the course.

## Checking out and Running the project

Within a terminal/command prompt type "git clone https://github.com/b1022366/eRegister.git" 
(wait for this to clone the code from GitHub which may take a while depending on your hardware.)

Then type "grails run-app" to run the application eRegister (this may take a while) when running the terminal will show, 
"Server running. Browse to http://localhost:8080/eRegister", right click and select "Open Link" to open the application in your web browser.

### Prerequisites 

The running application requies prerequisites before it can be successfully executed.
It reguires the following:

* A running local mysql database called eregister where the user is called webarch and the password is webarch.
* The mysql database should be created using the command "create database eregister". 
* The project is a groovy/grails project and therefore needs Java7 JDK and grails SDK to be correctly installed.



By Chris Shelley
