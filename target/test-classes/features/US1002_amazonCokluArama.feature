
@smoke
Feature: US1001 Kullanici amazon ana sayfada birden fazla urun aratir


  Scenario: TC02 Kullanici amazonda urunleri aratip test edebilmeli

    Given Kullanici amazon ana sayfaya gider
    And   Kullanici aramakutusuna nutella yazip aratir
    When  Arama sonuclarinin nutella icerdigini test eder
    Then  sayfayi kapatir

    Given Kullanici amazon ana sayfaya gider
    And   Kullanici aramakutusuna java yazip aratir
    When  Arama sonuclarinin java icerdigini test eder
    Then  sayfayi kapatir

    Given Kullanici amazon ana sayfaya gider
    And   Kullanici aramakutusuna samsung yazip aratir
    When  Arama sonuclarinin samsung icerdigini test eder
    Then  sayfayi kapatir

