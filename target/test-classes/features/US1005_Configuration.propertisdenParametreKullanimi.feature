@smoke
Feature: US1005 Kullanici configurayion.properties deki datalari kullanir

  # 3 senaryo olusturun amazon ,wisequarter vw walmart anasayfalarina gidin
  # ve gittiginizi test edin

  Scenario: TC06 Kullanici amazon ana sayfaya gider ve gittigini test eder

    When Kullanici "amazonUrl" ana sayfaya gider
    And  Kullanici "amazon" ana sayfaya gittigini test eder
    Then sayfayi kapatir

  Scenario: TC07 Kullanici wisequarter ana sayfaya gider ve gittigini test eder
    When Kullanici "wqUrl" ana sayfaya gider
    And  Kullanici "wisequarter" ana sayfaya gittigini test eder
    Then sayfayi kapatir

  Scenario: TC08 Kullanici walmart ana sayfaya gider ve gittigini test eder
    When Kullanici "walmartUrl" ana sayfaya gider
    And  Kullanici "walmart" ana sayfaya gittigini test eder
    Then sayfayi kapatir



