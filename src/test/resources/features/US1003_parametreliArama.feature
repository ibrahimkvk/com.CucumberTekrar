@p1
Feature: US1003 Kullanici parametre olarak girilen degeri aratir

  Scenario: TC1003 Kullanici parametreli method ile nutella aratir

    Given Kullanici amazon ana sayfaya gider
    And   Kullanici aramakutusuna "nutella" yazip aratir
    When  Arama sonuclarinin "nutella" icerdigini test eder
    Then  sayfayi kapatir

  Scenario: TC1004 Kullanici parametreli method ile Java aratir

    Given Kullanici amazon ana sayfaya gider
    And   Kullanici aramakutusuna "java" yazip aratir
    When  Arama sonuclarinin "java" icerdigini test eder
    Then  sayfayi kapatir

  Scenario: TC1005 Kullanici parametreli method ile samsung aratir

    Given Kullanici amazon ana sayfaya gider
    And   Kullanici aramakutusuna "samsung" yazip aratir
    When  Arama sonuclarinin "samsung" icerdigini test eder
    Then  sayfayi kapatir

