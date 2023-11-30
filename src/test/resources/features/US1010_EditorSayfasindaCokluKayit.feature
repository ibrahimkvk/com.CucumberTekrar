
Feature: US1010 Kullanici editor sayfasinda coklu kayit yapabilir

  Scenario Outline: TC15 Kullanici editor sayfasinda coklu kayit yapabilmeli

    Given Kullanici "editorUrl" ana sayfaya gider
    When  Kullanici new butonuna tiklar
    And   Kullanici firstName kutusuna "<firstname>" girer
    Then  Kullanici lastName kutusuna "<lastname>" girer
    And   Kullanici position kutusuna "<position>" girer
    Then  Kullanici office kutusuna "<office>" girer
    When  Kullanici extension kutusuna "<extension>" girer
    And   Kullanici start date kutusuna "<startDate>" girer
    Then  Kullanici salary kutusuna "<salary>" girer
    When  Kullanici create butonuna basar
    Then  Kullanici "<firstname>" ile arama yapar
    When  isim bolumunde "<firstname>" oldugunun dogrular
    And   5 saniye bekler
    Then  sayfayi kapatir
    Examples:
      |firstname  |lastname   |   position    |  office   |  extension   |  startDate   |salary    |
      |  Salih    |  Toprak   |   Enginer     | Taksim    |  free        |  2020-07-23  | 200000   |
      |  Nuh      |  Maden    |   SDET        | Firuzaga  |  fulltime    |  2020-12-23  | 200000   |
      |  Mehmet   |  Cebi     |   Teacher     | Taksim    |  free        |  2020-07-23  | 200000   |
      |  Ibrahim  |  Dostani  |   Businesman  | Uskudar   |  free        |  2023-12-12  | 3000000  |
      |  Yakup    |  Acibadem |   Team leader | Firuzaga  |  fulltime    |  2000-01-10  | 4000000  |
      |  Mahmut   |  Karacam  |   QA          | Pendik    |  fulltime    |  2021-02-14  | 543000   |
      |  Ayhan    |  Aslan    |    QA         | Besiktas  |  fulltime    |  2012-02-14  | 1230000  |




