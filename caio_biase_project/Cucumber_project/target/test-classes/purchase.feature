#Author: caiobiase@example.com
#language: en

Feature: Purchase
  As an Ecommerce Website Visitor
  I want to choose a product
  So that I can see its value and then buy it

  
  Scenario Outline: Select a product to buy
    Given I have a product list
    When I click on the chosen product
    And I click to buy now with one-click
    Then I type "<name>" and "<value>" and "<email>"
    And I click to submit
    Then Close the Browser
    
Examples: 

|name  |value        |email             |
|biase|5592995071697|caiobiase@example.com|
