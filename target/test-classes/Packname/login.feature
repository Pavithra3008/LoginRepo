Feature: Function of the site
@loginPage
Scenario: Login button exists
Given I open guru99 website
When User enters valid data 
| Fields | Values |
| Pavithra@gmail.com | pass123 |
| Viveka@gmail.com | pass456 |
Then Successful Login