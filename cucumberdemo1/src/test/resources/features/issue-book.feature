Feature: issue a book to member
	Issue a book (if available) to members.

	Background: Common for all scenarios
		Given Book with title 'Java 2 Primer' is Available
		And Book with title 'Let Us C' is Not available.
		And Member ID M001 is Eligible for new issue.
		And Member ID M002 is Not Eligible for new issue.

	Scenario: issue available book
		Given member M001 is logged in
		When member click 'request' on book 'java 2 primer'
		Then goto 'issue' page, ask for address
		And book should be marked as Non Available

	Scenario: issue non-available book
		Given member M001 is logged in
		When member click 'request' on book 'Let Us C'
		Then Page redirects to error with message 'Sorry, Book is currently not available'

	Scenario: issue available book to non-eligible member
		Given member M002 is logged in
		When member click on 'request' on book 'Java 2 Primer'
		Then Page redirects to error page with message 'Sorry, You have not yet returned your last book!'
