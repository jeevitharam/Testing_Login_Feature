Feature: successful gmail login 
Scenario: login using valid credentials
	Given user is on the login page
	When enter username and password
	Then log in and leave a msg 