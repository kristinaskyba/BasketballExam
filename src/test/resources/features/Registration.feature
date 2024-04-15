Feature: User Registration

  Scenario Template: Registering new user
    Given User is on the registration page using "<browser>"
    When User enters "<date>" of birth
    When User enters "<name>" and "<lastName>"
    When User enters mail "<mail>" and "<confirmMail>"
    When User enters password "<password>" and "<confirmPassword>"
    When User accepts therms "<terms>", "<age>", and "<ethics>"
    And User clicks submit button
    Then User sees the message "<message>"

    Examples:
      | browser | date       | name      | lastName      | mail       | confirmMail | password | confirmPassword | terms | age  | ethics | message                                                                   |
      | chrome  | 17/10/1989 |           | lastNameONE   | @gmail.com | @gmail.com  | 12345    | 12345           | true  | true | true   | First Name is required                                                    |
      | chrome  | 17/10/1989 | NameTWO   | lastNameTWO   | @gmail.com | @gmail.com  | 12345    | 12345678        | true  | true | true   | Password did not match                                                    |
      | chrome  | 17/10/1989 | NameTHREE | lastNameTHREE | @gmail.com | @gmail.com  | 12345    | 12345           | false | true | true   | You must confirm that you have read and accepted our Terms and Conditions |
      | chrome  | 17/10/1989 | NameFOUR  | lastNameFOUR  | @gmail.com | @gmail.com  | 12345    | 12345           | true  | true | true   | THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND                 |
      | firefox | 17/10/1989 |           | lastNameONE   | @gmail.com | @gmail.com  | 12345    | 12345           | true  | true | true   | First Name is required                                                    |
      | firefox | 17/10/1989 | NameTWO   | lastNameTWO   | @gmail.com | @gmail.com  | 12345    | 12345678        | true  | true | true   | Password did not match                                                    |
      | firefox | 17/10/1989 | NameTHREE | lastNameTHREE | @gmail.com | @gmail.com  | 12345    | 12345           | false | true | true   | You must confirm that you have read and accepted our Terms and Conditions |
      | firefox | 17/10/1989 | NameFOUR  | lastNameFOUR  | @gmail.com | @gmail.com  | 12345    | 12345           | true  | true | true   | THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND                 |
