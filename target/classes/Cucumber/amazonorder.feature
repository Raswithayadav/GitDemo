
@tag
Feature: Purchase the order from ecommerce website
Background:
I landed on ecommerce page

 @tag2
  Scenario Outline: Postive test of submitting the order
    Given   Logged in with username <Email> and password <password>
    When    I have searched the product <productname>
    And    I add product to the cart and select the quantity
    Then    Checkout the product and fill the details then signout

    Examples: 
      | Email                   | password          | productname                              |
      | raswithayadav@gmail.com |     Raswitha@2001 | Puma Mens Shuffle One8 V2 Better Sneaker |
      
