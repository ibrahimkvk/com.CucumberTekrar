

Feature: Kullanici bastaki ortak adimlar icin background kullanir

  Background: tum senaryolar icin ortak ilk adim
    Given Kullanici amazon ana sayfaya gider

  Scenario: TC1003 Kullanici parametreli method ile nutella aratir

    And   Kullanici aramakutusuna "nutella" yazip aratir
    When  Arama sonuclarinin "nutella" icerdigini test eder
    Then  sayfayi kapatir


  Scenario: TC1004 Kullanici parametreli method ile Java aratir

    And   Kullanici aramakutusuna "java" yazip aratir
    When  Arama sonuclarinin "java" icerdigini test eder
    Then  sayfayi kapatir


  Scenario: TC1005 Kullanici parametreli method ile samsung aratir

    And   Kullanici aramakutusuna "samsung" yazip aratir
    When  Arama sonuclarinin "samsung" icerdigini test eder
    Then  sayfayi kapatir