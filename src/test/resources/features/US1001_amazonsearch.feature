Feature: Kullanici amazonda test yapar

  Scenario:TC01 Kullanici amazonda nutella aratir

    Given Kullanici amazon ana sayfaya gider
    When  Kullanici aramakutusuna nutella yazip aratir
    And   Arama sonuclarinin nutella icerdigini test eder
    Then  sayfayi kapatir
