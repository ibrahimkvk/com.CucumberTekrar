@smoke
Feature: US1008 Kullanici Scenario Outline  ile birden fazla arama yapar

  Scenario Outline: TC13 kullanici birden fazla arama yapabilir

    Given Kullanici "amazonUrl" ana sayfaya gider
    Then Kullanici aramakutusuna "<arananUrun>" yazip aratir
    And Arama sonuclarinin "<arananUrun>" icerdigini test eder
    When sayfayi kapatir
    Examples:
      |arananUrun |
      |  nutella  |
      |  java     |
      |  oppo     |
      |  xmi      |

