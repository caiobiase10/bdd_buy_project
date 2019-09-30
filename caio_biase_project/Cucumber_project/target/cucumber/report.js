$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/tayan/Documents/pasta_inmetrics/caio_project/Cucumber_project/src/test/resources/purchase.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: caiobiase@example.com"
    },
    {
      "line": 2,
      "value": "#language: en"
    }
  ],
  "line": 4,
  "name": "Purchase",
  "description": "As an Ecommerce Website Visitor\r\nI want to choose a product\r\nSo that I can see its value and then buy it",
  "id": "purchase",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Select a product to buy",
  "description": "",
  "id": "purchase;select-a-product-to-buy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I have a product list",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on the chosen product",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click to buy now with one-click",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I type \"\u003cname\u003e\" and \"\u003cvalue\u003e\" and \"\u003cemail\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click to submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "purchase;select-a-product-to-buy;",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "email"
      ],
      "line": 20,
      "id": "purchase;select-a-product-to-buy;;1"
    },
    {
      "cells": [
        "biase",
        "5592995071697",
        "caiobiase@example.com"
      ],
      "line": 21,
      "id": "purchase;select-a-product-to-buy;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Select a product to buy",
  "description": "",
  "id": "purchase;select-a-product-to-buy;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I have a product list",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on the chosen product",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click to buy now with one-click",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I type \"biase\" and \"5592995071697\" and \"caiobiase@example.com\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click to submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_to_buy.go_to_homepage_webcomerce()"
});
formatter.result({
  "duration": 41513202239,
  "status": "passed"
});
formatter.match({
  "location": "Steps_to_buy.user_choose_a_product()"
});
formatter.result({
  "duration": 15473979325,
  "status": "passed"
});
formatter.match({
  "location": "Steps_to_buy.user_clicks_on_to_buy_one_click_now()"
});
formatter.result({
  "duration": 303190732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "biase",
      "offset": 8
    },
    {
      "val": "5592995071697",
      "offset": 20
    },
    {
      "val": "caiobiase@example.com",
      "offset": 40
    }
  ],
  "location": "Steps_to_buy.user_enters_name_numberphone_and_email(String,String,String)"
});
formatter.result({
  "duration": 4481912429,
  "status": "passed"
});
formatter.match({
  "location": "Steps_to_buy.user_clicks_on_submit()"
});
formatter.result({
  "duration": 394170616,
  "status": "passed"
});
formatter.match({
  "location": "Steps_to_buy.close_the_Browser()"
});
formatter.result({
  "duration": 3105187286,
  "status": "passed"
});
});