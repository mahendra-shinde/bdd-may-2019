Feature: Test login page
	
	Scenario: Invalid Username
		Given User is on login page
		When User enters invalid username
		Then Display Please enter username
		
	Scenario: Invalid Password
	 	Given User is on login page
	 	When User enters invalid password
	 	Then Display Please enter password