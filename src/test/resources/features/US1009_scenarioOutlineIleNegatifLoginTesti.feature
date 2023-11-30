@p1
Feature: US1009 yanlis username ve password ile negatif login testi

  Scenario Outline:TC14 Negatif login testi yapabilmeli

    Given Kullanici "qualitydemyUrl" ana sayfaya gider
    Then Kullanici cikan cookies i kabul eder
    And  Kullanici login butonuna tiklar
    Then Kullanici email butonuna "<gecersizUsername>"  yazar
    When Kullanici password butonuna  "<gecersizPassword>" yazar
    And  Kullanici login butonuna basar
    When kullanici yanlis bilgilerle login olamadigini test eder
    Then sayfayi kapatir
    Examples:
      | gecersizUsername | gecersizPassword |
      |  abcd@gmail.com  | Az.786786        |
      |  efgh@gmail.com  | Bz.786786        |
      |  klmn@gmail.com  | Cz.786786        |
      |  prst@gmail.com  | Dz.786786        |
      |  vyzt@gmail.com  | ez.786786        |

