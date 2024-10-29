Feature: Login Functionality of LeafTaps application



Scenario: Login with positive credentials
#Given Open the browser and Load the URL
When Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
And Click on Login Button
Then Verify Login is successful 
#And Close the Browser


Scenario: Login with negative credentials
#Given Open the browser and Load the URL
When Enter the username as 'demo'
And Enter the password as 'crm'
And Click on Login Button
Then Verify Login is not successful 
#And Close the Browser

