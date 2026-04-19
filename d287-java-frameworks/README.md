<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

# Student Changes Log
This log documents all modifications made to the base project for tasks C through J.

## Task C
- Prompt: Customize the HTML user interface for the customer’s application to include the shop name, product names, and part names.
- File: mainscreen.html
- Line Number: 14
- Change: Updated the HTML heading from "Shop" to "Mishock’s Tech Supply" to customize the user interface while keeping product and part names displayed.

## Task D
- Prompt: Add an “About” page to the application to describe the chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
- File: about.html, mainscreen.html, MainScreenControllerr.java
- Line Number: about.html (1), mainscreen.html (line where About link was added), MainScreenControllerr.java (line where @GetMapping("/about") was added)
- Change: Created a new About page for Mishock’s Tech Supply, added a controller method to map "/about" to the About page, added an "About Us" link on the main screen, and added navigation back to the main screen.

## Task E
- Prompt: Add a sample inventory appropriate for the chosen store with five parts and five products without overwriting existing data.
- File: BootStrapData.java
- Line Number:  BootStrapData.java (inside run method)
- Change: Added conditional logic to insert five sample parts and five sample products for Mishock’s Tech Supply only when both part and product lists are empty.

## Task F
- Prompt: Add a “Buy Now” button to the product list that decrements product inventory by one and displays a success or failure message.
- File: mainscreen.html, MainScreenControllerr.java
- Line Number: mainscreen.html (product table section), MainScreenControllerr.java (Buy Now method)
- Change: Added a Buy Now button next to update and delete, implemented controller logic to decrement product inventory by one without affecting parts, and added a message to display purchase success or failure.

## Task G
- Prompt: Modify the parts to track maximum and minimum inventory by adding fields, updating sample inventory, updating forms, renaming persistent storage, and enforcing inventory between minimum and maximum values.
- File: Part.java, InhousePartForm.html, OutsourcedPartForm.html, BootStrapData.java, application.properties, AddInhousePartController.java, AddOutsourcedPartController.java
- Line Number: Part.java (fields section), forms (input fields), controllers (validation logic)
- Change: Added minimum and maximum inventory fields to the Part entity, updated the sample inventory to include min and max values, added input fields for min and max to both Inhouse and Outsourced part forms, renamed the database file, and implemented validation logic to ensure inventory remains between the defined minimum and maximum values.

## Task H
- Prompt: Add validation for between or at the maximum and minimum fields, including error messages for low and high inventory conditions for parts and products.
- File: AddInhousePartController.java, AddOutsourcedPartController.java, InhousePartForm.html, OutsourcedPartForm.html, AddProductController.java, productForm.html
- Line Number: controllers (validation logic), productForm.html (error message section)
- Change: Added validation and error messages to ensure part inventory remains within minimum and maximum limits, and implemented product validation to prevent associated parts from dropping below minimum inventory when updating products.

## Task I
- Prompt: Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
- File: PartTest.java
- Line Number: PartTest.java (test methods section)
- Change: Added unit tests to verify the minimum and maximum inventory fields in the Part class.

## Task J
- Prompt: Remove the class files for any unused validators in order to clean your code.
- File: validators package
- Line Number: N/A
- Change: Removed unused validator classes and retained only the ValidDeletePart annotation and DeletePartValidator class, which are actively used in the application.