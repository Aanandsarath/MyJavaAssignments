Feature: Create Oppurtunities in Salesforce Application
Scenario Outline: Creating Multiple Opportunities
Given Launch the browser and Load the URL
When Enter the Username as 'dilip@testleaf.com'
And Enter the Password as 'leaf@2024'
And Click on login Button
And Create Opportunity 
And Enter the name as <oppname> 
And Amount as <amount>
Then Verify the Opportunity Name
And Close the browser


Examples:
|oppname|amount|
|'Salesforce Automation By Aanand Sarath'|'75000'|
|'Salesforce Automation By Walter White'|'85000'|
|'Salesforce Automation By Harvey Specter'|'95000'|
