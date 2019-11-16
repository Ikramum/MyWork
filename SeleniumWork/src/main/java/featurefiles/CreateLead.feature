Feature: Create a new Lead

Background:
Given Open the Browser
And Maximize the window
And Load the URL
And Set the Timeout

@createLead
Scenario: To create a new lead using mandatory fields
#
#Given Open the Browser
#And Maximize the window
#And Load the URL
#And Set the Timeout
And Enter the Username as demosalesmanager
And Enter the Password as crmsfa
And Click the Login button
And Click CRMSFA Link
And Click on Create Lead link
And Enter the Company Name as TestLeaf 
And Enter the FirstName as Mohammed
And Enter the LastName as Ikramuddin
When Click on Submit button
Then Verify new Lead is created successfully with the first name as Mohammed

Scenario Outline: To Create leads using examples
#
#Given Open the Browser
#And Maximize the window
#And Load the URL
#And Set the Timeout
And Enter the Username as <uName>
And Enter the Password as <pwd>
And Click the Login button
And Click CRMSFA Link
And Click on Create Lead link
And Enter the Company Name as <cName> 
And Enter the FirstName as <fName>
And Enter the LastName as <lName>
When Click on Submit button
Then Verify new Lead is created successfully with the first name as <fName>

Examples:
|uName|pwd|cName|fName|lName|
|demosalesmanager|crmsfa|TestLeaf||Ikramuddin|
|demosalesmanager|crmsfa|TestLeaf|UV|Raj|

