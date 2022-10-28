

Feature: Etsy Search Functionality


  @ahmet
  Scenario: Validation title of Etsy Search Hat
    When User searches for 'Hat'
    Then User validates the title is 'Hat - Etsy'
    Then Sort them as lower price

  @mehmet
  Scenario: Validation title of Etsy Search Key
    When User searches for 'Key'
    Then User validates the title is 'Key - Etsy'
    Then Sort them as lower price

  Scenario: Validation title of Etsy Search Pin
    When User searches for 'Pin'
    Then User validates the title is 'Pin - Etsy'
    Then Sort them as lower price