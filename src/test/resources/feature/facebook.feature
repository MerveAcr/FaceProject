Feature: facebook sign in sayfasinda textleri check et
Scenario: baslik, alt baslik ve labelleri check et
	Given user on signin page 
	When user click create new account button  
	Then user able to see sign up title
	And user able to see sign up subtitle
	And user able to see firstname label
	And user able to see lastname label
	And user able to see mobile number or email label
	And user able to see new password label
	And user able to see birthday header
	And user able to see gender header 
	And user able to see sign up button text
	

	