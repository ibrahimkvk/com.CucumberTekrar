@p2
Feature: US1007 Kullanici yanlis bilgilerle giris yapamaz

  Scenario: TC10 Kullanici dogru username ve yanlis password ile negatif login testi

    Given Kullanici "qualitydemyUrl" ana sayfaya gider
    When  Kullanici cikan cookies i kabul eder
    Then  Kullanici login butonuna tiklar
    And   Kullanici email butonuna "qdGecerliUsername"  girer
    Then  Kullanici password butonuna  "qdGecersizPassword" girer
    And   Kullanici  ikinci login butonuna basar
    Given kullanici yanlis bilgilerle login olamadigini test eder
    Then  sayfayi kapatir

  Scenario: TC11 Kullanici yanlis username ve dogru password ile negatif login testi

    Given Kullanici "qualitydemyUrl" ana sayfaya gider
    When  Kullanici cikan cookies i kabul eder
    Then  Kullanici login butonuna tiklar
    And   Kullanici email butonuna "qdGecersizUsername"  girer
    Then  Kullanici password butonuna  "qdGecerliPassword" girer
    And   Kullanici  ikinci login butonuna basar
    Given kullanici yanlis bilgilerle login olamadigini test eder
    Then  sayfayi kapatir

  Scenario:TC12 Kullanici yanlis username ve yanlis password ile negatif login testi

    Given Kullanici "qualitydemyUrl" ana sayfaya gider
    When  Kullanici cikan cookies i kabul eder
    Then  Kullanici login butonuna tiklar
    And   Kullanici email butonuna "qdGecersizUsername"  girer
    Then  Kullanici password butonuna  "qdGecersizPassword" girer
    And   Kullanici  ikinci login butonuna basar
    Given kullanici yanlis bilgilerle login olamadigini test eder
    Then  sayfayi kapatir