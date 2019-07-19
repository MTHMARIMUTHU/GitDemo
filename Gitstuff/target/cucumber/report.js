$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and Place order for Veg",
  "description": "",
  "id": "search-and-place-order-for-veg",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for items and Validate results",
  "description": "",
  "id": "search-and-place-order-for-veg;search-for-items-and-validate-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@autoTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on Greencart landpage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user serach for \"Cucumber\" Veg",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_is_on_greencart_landpage()"
});
formatter.result({
  "duration": 11080616575,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 17
    }
  ],
  "location": "Search.user_serach_for_something_veg(String)"
});
formatter.result({
  "duration": 435807823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "Search.something_results_are_displayed(String)"
});
formatter.result({
  "duration": 49191637,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinations.Search.something_results_are_displayed(Search.java:37)\r\n\tat ✽.Then \"Cucumber\" results are displayed(Search.feature:6)\r\n",
  "status": "failed"
});
});