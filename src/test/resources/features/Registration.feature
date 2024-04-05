Feature: User Registration

  Scenario Template: Registering new user
    Given User is on the registration page
    When User enters "<date>" of birth
    When User enters "<name>" and "<lastName>"
    When User enters mail "<mail>" and "<confirmMail>"
    When User enters password "<password>" and "<confirmPassword>"
    When User accepts therms "<terms>", "<age>", and "<ethics>"
    #And User sees the registration success message

    Examples:
      | date       | name      | lastName      | mail          | confirmMail   | password | confirmPassword | terms | age  | ethics |
    | 17/10/1984 |           | lastNameONE   | 111@gmail.com | 111@gmail.com | 12345    | 12345           | true  | true | true   |
     #| 17/10/1984 | NameTWO   | lastNameTWO   | 111@gmail.com | 111@gmail.com | 12345    | 12345678        | true  | true | true   |
     # | 17/10/1984 | NameTHREE | lastNameTHREE | 111@gmail.com | 111@gmail.com | 12345    | 12345           | false | true | true   |
     #| 17/10/1984 | NameFOUR  | lastNameFOUR  | 111@gmail.com | 111@gmail.com | 12345    | 12345           | true  | true | true   |
