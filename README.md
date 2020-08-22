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

* Clone the project. [https://github.com/memonshoyeb/PetStoreHungerStation.git]

* Open the project in InteliJ Java editor. 

* Project is organized as follow:

### **com.Hybrid.hunger.Utilities**:
Contains shared libraries to handle all interaction in the framework and also as follow.

 * **com.Hybrid.hunger.Utilities.listeners** : used to handle transforming testNG test methods and create extent report.

### **com.Hybrid.hunger.Utilities.core**:

 * **DataManager** : used to handle reading and updating data from excel sheet.

 * **Driver**: used to handle the execution of the test by reading test cases from excel sheet, reading test data, invoking the test methods as per test data and reporting.

 * **Global** : used to create global variables in the project like [Global.Test.Browser].

* **Common** : Some Common general purpose methods.

### **com.Hybrid.hunger.Pet.Test**:
Contains the test methods.

### **com.Hybrid.hunger.Pet.Scenarios**:
Contains the test scenario methods 

### **com.Hybrid.hunger.Pet.Main**:
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
 8. run the test by using the /main method. If "java: error: release version 5 not supported (Error in IntelliJ)", then follow Troubleshooting section.
 9. The system will run the test and generate a HTML report with date and time stamp name as per the bellow example 
	Reports/Automation_Result_2020_08_22_082802/Automation_Report.html

### Troubleshooting:

    Problem Statement: "java: error: release version 5 not supported (Error in IntelliJ)"
    Solution:
    1. Goto File>Settings>Search for "Java compiler" and change the target bytecode version in module section to 11.
    2. Goto File>Project Structure>Modules and change the Language level to 11 under Source tab.
    
 

Please for more details do not hesitate to contact me at shoyebc@yahoo.com or call me at 0509568098