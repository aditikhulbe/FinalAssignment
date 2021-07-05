#Automation Final Project

*[Visit Website used for automation](https://www.redbus.in/)*


GitHub repository:


*[Visit GitHub Repository of this project](https://github.com/aditikhulbe/FinalAssignment.git)*



---
#Module Description:

** 1.  Pages Package: ** 

_contains the page classes for all pages_

 classes contain locators and methods for the web elements

---

** 2. Test Package: **

 _contains the test cases for all pages_
 
 classes contain:  
 
 objects, and method calling from respective page class
 
 
---

** 3. Utils: ** 

_contains classes that have common usage throughout_

---

** 4. Drivers**

 _Folder contains drivers for _
 Chrome, Firefox & IE_

---

** 5. Failed Screenshots:** 

_ Folder where any failed screenshot gets saved_

---


** 6.Jars:**

_folder contains the external jar file for screenshots_

---

** 7. log:** 

_ Folder contains the logs of a test run_

---

** 8. Reports:**

 _Folder contains the extent report generated after a test run_

---

** 9. Resources:** 

_Contains_


_ - config.properties file_ : contains the website url and browser options

_ -Data excel Sheet_ : excel file from where test data is fetched

_ -log4j. properties file_ : contains appenders for the log file, location and size of log file etc

---


** 10. test-output **

_contains_

_-docker-compose.yml file :_  initialization of services of chrome and firefox to start the docker functionality

_-pom.xml file :_ contains the dependencies required for code to run



---

#How to Run 

**Run using Maven install:**

_First, Run the following command in the project command prompt_

**mvn install:install-file -Dfile=ScreenshotUtility-0.0.1-SNAPSHOT.jar -DgroupId=ScreenshotUtility -DartifactId=ScreenshotUtility -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar**

2. Then click on Project > Maven > Update Project

3. Click on Project > Maven Clean

4. Click on Project > Maven Run

---


**Run using testng:**

1. Go to the file testng.xml

2. Right click > run as testng


---

**Jenkins Integration:** See attached file in project named "Jenkins.docx"

---

