# emailApplicationJava

Project from: https://www.youtube.com/watch?v=U3Ibvu0htNs

<h2>Email Application</h2>

Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires

Your application should do the following:

Generate an email with the following syntax: firstname.lastname@department.company.com <br />
Determine the department (sales, development, accounting), if none leave blank <br />
Generate a random String for a password <br />
Have set methods to change the password, set the mailbox capacity, and define an alternate email address <br />
Have get methods to display the name, email, and mailbox capacity <br />

Executed

![image](https://user-images.githubusercontent.com/68548733/166971835-d30ce6c6-e922-41f4-b7a7-967ff60038ad.png)

Currently doing:

Email App

- Create email object with name and surname as parameters
- Print out details

Email class

- Constructor<br />
    -> takes Name and Surname as parameters<br />
    -> sets department with method (displays list of departments to user to select)<br />
    -> sets a random generated password of default length<br />
    -> creates an email with string concatenation of parameters (uses the toLowerCase() of the string class)
    
- setDepartment()<br />
    -> sisplays list of options to user<br />
    -> create scanner object to handle input<br />
    -> if statement to set department according to input received (TO DO: change to switch statement, add validation to check for valid input)<br />
    
- setPassword()<br />
    -> default password length as parameter<br />
    -> create a string with valid characters for password (passwordSet)<br />
    -> create character array to add characters to password<br />
    -> add character to array with every iteration of for loop<br />
        * uses Math.random() to generate the index position<br /> 
        * adds character to password array that corresponds to the character at the random index position generated in the passwordSet defined<br />
        
- getters and setters for private variables

- showInfo() method to display variables in a certain format
