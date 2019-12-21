Feature: Test login feature of OrangeHRM website

Scenario Outline: testing admin login credentials using chrome
Given User navigates to OrangeHRM website
When user logins with admin "<username>" and "<password>"
Then user navigates to dashboard page

Examples:
	|username|password|
	|Admin   |admin12|
