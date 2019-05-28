Feature: issue a book to member
Issue a book (if available) to members.

Background: Common for all scenarios 
	Given Book with title 'Java 2 Primer' is Available 
	And 	while book with title 'Let Us C' is Not available.

Scenario: issue available book	
	Given member M001 is requesting book 'Java 2 Primer'
	When  member click 'request' on book 'java 2 primer'
	Then	goto 'issue' page, ask for address
	And		book should be marked as Non Available 	

Scenario: issue non-available book
	 Given	member M001 is requesting book 'Let Us C'
	 When 	member click 'request' on book 'Let Us C'
	 Then		Page redirects to error with message 'Sorry, Book is currently not available'
