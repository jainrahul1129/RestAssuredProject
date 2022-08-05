Feature: End to End flow to verify authentication for a ecommerce site

  @loginAmazon
  Scenario Outline: Authentication check with valid data

    Given user has launched the url for <ecomm>
    When user has entered credentials
    Then user has successfully authenticated

    Examples:
    | ecomm  |
    | Amazon |