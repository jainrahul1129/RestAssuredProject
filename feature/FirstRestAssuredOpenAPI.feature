Feature: first API test case with CRUD operations

  @openAPI
  Scenario: Verification of open API
    Given verify user is able to fetch account details
    When  user enter the resource details
    Then  user will see a response with account details