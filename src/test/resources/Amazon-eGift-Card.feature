Feature: Amazon eGift Card Feature

  Scenario: As a customer, I see Newest eGift cards
    Given I am on eGift card page
    When I select Newest Arrivals sorting option
    Then I should able to see the Newest eGift card arrivals