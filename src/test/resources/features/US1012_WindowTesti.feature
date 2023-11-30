
@p2
Feature: US1012 Window testi

  Scenario: TC17 Kullanici yeni acilan window u acabilmeli

    # 1."http://webdriveruniversity.com/" adresine gidin
    # 2."Login Portal" a kadar asagi inin
    # 3."Login Portal" a tiklayin
    # 4.Diger window'a gecin
    # 5."username" ve "password" kutularina deger yazdirin
    # 6."login" butonuna basin
    # 7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
    # 8.Ok diyerek Popup'i kapatin
    # 9.Ilk sayfaya geri donun
    # 10.Ilk sayfaya donuldugunu test edin

  Given Kullanici "webdriveruniversityUrl" ana sayfaya gider
  Then  Login Portal a kadar asagi inilir
  And   login portal a tiklanir
  When  Diger window a gecilir
  And   Username ve password kutularina deger yazdirilir
  When  Login butonuna basilir
  And   Popup'ta cikan yazinin validation failed oldugunu test edilir
  When  Ok diyerek Popup'i kapatilir
  And   Ilk sayfaya geri donulur
  Then  Ilk sayfaya donuldugunu test edilir
  Then  acilan tum sayfalari kapatir




