Feature: Login - Checkout

  @web
  Scenario: signup with valid username and password (positive)
    Given user is on home page
    And user click signup navigation on top menu
    And user create username in username textbox
    And user create password in password textbox
    And user click signup button
    Then user will see alert message "Sign up successful."

  @web
  Scenario: signup without create password (negative)
    Given user is on home page
    And user click signup navigation on top menu
    And user create username in username textbox
    And user click signup button
    Then user will see alert message "Please fill out Username and Password."

  @web
  Scenario: signup with existing account (negative)
    Given user is on home page
    And user click signup navigation on top menu
    And user input username textbox with "abc"
    And user create password in password textbox
    And user click signup button
    Then user will see alert message "This user already exist."

  @web
  Scenario: login and logout with valid username and password (positive)
    Given user is on home page
    And user click signup navigation on top menu
    And user create username in username textbox
    And user create password in password textbox
    And user click signup button
    Then user will see alert message "Sign up successful."
    And user click login navigation on top menu
    And user input username in username textbox
    And user input password in password textbox
    And user click login button
    Then user will see user name visible on navigation menu
    And user click logout navigation on top menu
    Then user will see login and signup navigation back to on top menu

  @web
  Scenario: login without input password (negative)
    Given user is on home page
    And user click login navigation on top menu
    And user input username in username textbox
    And user click login button
    Then user will see alert message "Please fill out Username and Password."

  @web
  Scenario: login with unregistered username and password (negative)
    Given user is on home page
    And user click login navigation on top menu
    And user input username in username textbox
    And user input password in password textbox
    And user click login button
    Then user will see alert message "User does not exist."

  @web
  Scenario: login with wrong password (negative)
    Given user is on home page
    And user click signup navigation on top menu
    And user create username in username textbox
    And user create password in password textbox
    And user click signup button
    Then user will see alert message "Sign up successful."
    And user click login navigation on top menu
    And user input username in username textbox
    And user input password textbox with "xxx"
    And user click login button
    Then user will see alert message "Wrong password."

  @web
  Scenario: add item from phones categories into the cart (positive)
    Given user is on home page
    And user select "Phones" category
    And user will see list of products
    And user click product title of item "s7"
    And user will direct to product details
    And user click add to cart button
    Then user will see alert message "Product added"

  @web
  Scenario: add item from laptops categories into the cart (positive)
    Given user is on home page
    And user select "Laptops" category
    And user will see list of products
    And user click product title of item "Dell i7"
    And user will direct to product details
    And user click add to cart button
    Then user will see alert message "Product added"

  @web
  Scenario: add item from monitors categories into the cart (positive)
    Given user is on home page
    And user select "Monitors" category
    And user will see list of products
    And user click product title of item "ASUS"
    And user will direct to product details
    And user click add to cart button
    Then user will see alert message "Product added"

  @web
  Scenario: remove item from cart (positive)
    Given user is on home page
    And user click product title of item "Sony vaio i5"
    And user back to home page
    And user go to the next page
    And user click product title of item "MacBook air"
    And user click add to cart button
    Then user will see alert message "Product added"
    And user click cart navigation on top menu
    And user remove item from cart

  @web
  Scenario: checkout item from cart (positive)
    Given user is on home page
    And user click product title of item "Nokia"
    And user click add to cart button
    Then user will see alert message "Product added"
    And user click cart navigation on top menu
    Then user will see order details
    And user click place order button
    And user input name in place order
    And user input credit card number
    And user click purchase button
    And user will see purchase details

  @web
  Scenario: checkout item without filling name and/or credit card number (negative)
    Given user is on home page
    And user click product title of item "Iphone 6"
    And user click add to cart button
    Then user will see alert message "Product added"
    And user click cart navigation on top menu
    And user click place order button
    And user input credit card number
    And user click purchase button
    Then user will see alert message "Please fill out Name and Creditcard."
