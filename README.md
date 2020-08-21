# API Hybrid Test Automation Framework.

API Hybrid is a Hybrid test automation framework, that combines features of (Modular, Keyword Driven and Data driven).

## Concepts Included:

* Data Driven.

* Keyword Driven.

* Page Object pattern and Page Factory.  [POM ](https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html)

* Objects shared repository.

* Rest Assured

## Tools

* Java. 

* TestNG.

* Rest Assured

* Java editor.



## Getting Started.

* Clone the project. 

* Open the project in InteliJ Java editor. 

* Project is organized as follow:

### **com.java.PetRestAssured.Utilities**:
Contains shared libraries to handle all interaction in the framework and also as follow.

 * **com.java.PetRestAssured.Utilities.listeners** : used to handle transforming testNG test methods and create extent report.

### **com.java.PetRestAssured.Utilities.core**:

 * **DataManager** : used to handle reading and updating data from excel sheet.

 * **Driver**: used to handle the execution of the test by reading test cases from excel sheet, reading test data, invoking the test methods as per test data and reporting.

 * **Global** : used to create global variables in the project like [Global.Test.Browser].

* **Common** : Some Common general purpose methods.

### **com.java.PetRestAssured.PetTest.Test**:
Contains the test methods.

### **com.java.PetRestAssured.PetTest.Scenarios**:
Contains the test scenario methods 

### **com.java.PetRestAssured.PetTest.Main**:
This module is the main entry point for the execution.

We will run our project from selecting main method and run it through the InteliJ IDEA.


## On line Sample API used in this project:
We are using the PET on line as example [http://petstore.swagger.io/#/] 


### Runing the test:

 1. Clone the Project.
 2. Open it in InteliJ.
 3. Configure the Excel Control file , The Driver sheet with the name of your test scenario method Select which method to execute by flag yes/no.  file [ TestAssets/TestData/TestData.xlsx ]
 4. Define your test data as in Excel Control file , PetServiceDetails sheet 
 5. Save all you work.
 6. Got to Class Runner.
 8. run the test by using the /main method.
 9. The system will run the test and generate a HTML report with date and time stamp name as per the below example
 ReportsAutomation_Result_2020_08_21_102827/Automation_Report.html
 

If you wish to get more information, please contact me by Email: shoyebc@yahoo.com