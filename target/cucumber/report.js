$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Packname\login.feature');
formatter.feature({
  "line": 1,
  "name": "Function of the site",
  "description": "",
  "id": "function-of-the-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login button exists",
  "description": "",
  "id": "function-of-the-site;login-button-exists",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@loginPage"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open guru99 website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid data",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 6
    },
    {
      "cells": [
        "Pavithra@gmail.com",
        "pass123"
      ],
      "line": 7
    },
    {
      "cells": [
        "Viveka@gmail.com",
        "pass456"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Successful Login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.open_guru99()"
});
formatter.result({
  "duration": 6019340600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enter_data(DataTable)"
});
formatter.result({
  "duration": 5069919600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.successful_login()"
});
formatter.result({
  "duration": 14829000,
  "status": "passed"
});
});