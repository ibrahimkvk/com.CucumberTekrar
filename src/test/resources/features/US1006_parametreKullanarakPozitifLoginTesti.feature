@p1
Feature: US1006 Kullanici configuration dosyasindaki bilgilerle login olabilmeli
  Scenario: TC09 Kullanici dogru username ve password ile pozitif login test yapar

    Given Kullanici "qualitydemyUrl" ana sayfaya gider
    Then  Kullanici login butonuna tiklar
    And   Kullanici email butonuna "qdGecerliUsername"  girer
    Then  Kullanici password butonuna  "qdGecerliPassword" girer
    When  Kullanici cikan cookies i kabul eder
    When   6 saniye bekler
    And   Kullanici  ikinci login butonuna basar
    Given kullanici dogru bilgilerle login oldugunu test eder
    Then  sayfayi kapatir