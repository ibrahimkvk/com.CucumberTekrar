
@p2
Feature: US1011 Kullanici herokuapp sayfasinda butonlarin gorunur oldugunu test eder

  Scenario:TC16 Kullanici bekeyerek butonlarin gorunur oldugunu saglar
    # Yeni bir test methodu olusturalim
    # https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    #1) “Add Element” butona basin
    #2) “Delete” butonu gorunur oluncaya kadar bekleyin
    #3) “Delete” butonunun gorunur oldugunu test edin
    #4) Delete butonuna basarak butonu silin
    #5) Delete butonunun gorunmedigini test edin

  * Kullanici "herokuappUrl" ana sayfaya gider
  * Kullanici Add Element butonuna basar
  * Delete butonu gorunur oluncaya kadar bekler
  * Delete butonunun gorunur oldugunu test eder
  * Delete butonuna basarak butonu siler
  * Delete butonunun gorunmedigini test eder
  * sayfayi kapatir