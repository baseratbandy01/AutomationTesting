$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/82009/eclipse-workspace/BDDFrameWorkcucumberTest/src/main/java/cucumberFeature/contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Contacts",
  "description": "",
  "id": "free-crm-create-contacts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Create a new contact Test",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user move on contact tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters contact deatils \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 12,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-test;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Tom",
        "Peter",
        "Manger"
      ],
      "line": 13,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-test;;2"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "David",
        "Dsouza",
        "Director"
      ],
      "line": 14,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Free CRM Create a new contact Test",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user move on contact tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters contact deatils \"Tom\" and \"Peter\" and \"Manger\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactStepWithMApDefinitation.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 3157720373,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepWithMApDefinitation.title_of_login_page_is_free_crm()"
});
formatter.result({
  "duration": 2208857980,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ContactStepWithMApDefinitation.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ContactStepWithMApDefinitation.user_move_on_contact_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Free CRM Create a new contact Test",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-test;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user move on contact tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters contact deatils \"David\" and \"Dsouza\" and \"Director\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactStepWithMApDefinitation.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 2233149309,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepWithMApDefinitation.title_of_login_page_is_free_crm()"
});
formatter.result({
  "duration": 2693137833,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ContactStepWithMApDefinitation.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ContactStepWithMApDefinitation.user_move_on_contact_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});