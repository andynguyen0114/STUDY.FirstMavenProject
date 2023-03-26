# Project Title
First Maven Project 

# Project Description 
A Java project using Maven. It contains three classes, one being a tester class. 
The HelloWorld class prints out the local time and calls a method from 
the Greeter class. The test class GreeterTest contains a test to check if the method 
for sayHello() contains the word "Hello". 

# How to Install and Run 
1. Download Visual Studio Code (make sure the necessary downloads are installed and beware 
of pathing issues) 
    * Install 'Extension Pack for Java'
    
2. Open Visual Studio Code 
    * Create a New Folder 
    * Clone 'STUDY.FirstMavenProject' repository into created folder 
    * Open cloned repository 

3. In project 'FirstMavenProject' 
    * Open file 'pom.xml'
    * Check that Maven properties match the Maven version for VS Code 
![(1)MavenProperties](https://user-images.githubusercontent.com/34176263/227806409-35f3293b-5988-4c2b-960f-b024c9936d32.PNG)
    * Check that the required dependencies are present
![(2)Dependencies](https://user-images.githubusercontent.com/34176263/227806789-c0dc8af5-3a2c-4f02-915b-864be734d57b.PNG)
 
 
# Using Project 
1. Using the Jode dependency, class 'org.joda.time.Localtime' is used to print out the current local time. Then, an object from 
class Greeter is created to print out the sayHello() method. 
![(3)Import](https://user-images.githubusercontent.com/34176263/227807811-f181e505-9bda-4bcf-ad37-2e6dd9d782b5.PNG)
    * Open 'HelloWorld.java' 
    * Run (Or click F5) 
    * Output will be of the current local time and 'Hello World' message 
![(4)Output](https://user-images.githubusercontent.com/34176263/227807856-219bf6c1-e136-4bf9-b823-7dee38f44c3b.PNG)


2. Using the JUnit dependency, access to methods that allow for unit testing is available. The GreeterTest class has a single test unit 
that checks to see if the greet object with method sayHello() contains the word 'Hello'. 
![(5)Testing](https://user-images.githubusercontent.com/34176263/227808175-f255fb7f-fddb-40fa-8699-1bf481792953.PNG)
    * Open 'GreeterTest.java'
    * Left-click on the arrow next to 'public class GreeterTest' to run test 
    * Output will be a 'test passed' message found in the Testing Tab 
![(6)TestingOutputPassed](https://user-images.githubusercontent.com/34176263/227808814-afec7729-9b69-4652-ad34-defc591cd4a0.PNG)

    * On line 22, change "Hello" to "Hellow" inside the containsString() method
    * By doing so, the output will change to an error that shows the expected string and actual string
![(7)TestingOutputError](https://user-images.githubusercontent.com/34176263/227809078-9e8e81d9-2d89-4d66-9bdd-81924d232f74.PNG)

# Project Overview 
By completing this project, the understanding of pom.xml file was obtained. POM (Project Object Model) is regarded as the 
fundamental unit of work in Maven and the XML file contains information about the project and configuration details used 
by Maven to build the project. 

By adding the JUnit dependency to this project, access to a testing framework was made available and the ability to create 
unit test for this project became possible. 
    
