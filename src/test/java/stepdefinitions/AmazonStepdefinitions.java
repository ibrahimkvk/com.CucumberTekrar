package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {


    @Given("Kullanici amazon ana sayfaya gider")
    public void kullanici_amazon_ana_sayfaya_gider() {
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("Kullanici aramakutusuna nutella yazip aratir")
    public void kullanici_aramakutusuna_nutella_yazip_aratir() {
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }
    @When("Arama sonuclarinin nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        AmazonPage amazonPage=new AmazonPage();
        String actualSonucYazisi=amazonPage.amazonSonucElementi.getText();
        String expectedKelime="Nutella";
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();


    }

    @And("Kullanici aramakutusuna java yazip aratir")
    public void kullaniciAramakutusunaJavaYazipAratir() {
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);

    }

    @When("Arama sonuclarinin java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        AmazonPage amazonPage=new AmazonPage();
        String actualSonucYazisi=amazonPage.amazonSonucElementi.getText();
        String expectedKelime="Java";
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
    }
    @Given("Kullanici aramakutusuna samsung yazip aratir")
    public void kullanici_aramakutusuna_samsung_yazip_aratir() {
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("samsung" + Keys.ENTER);


    }
    @When("Arama sonuclarinin samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        AmazonPage amazonPage=new AmazonPage();
        String actualSonucYazisi=amazonPage.amazonSonucElementi.getText();
        String expectedKelime="samsung";
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

    }

    @And("Kullanici aramakutusuna {string} yazip aratir")
    public void kullaniciAramakutusunaYazipAratir(String aranacakKelime) {
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);
    }

    @When("Arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime) {
        AmazonPage amazonPage=new AmazonPage();
        String actualSonucYazisi=amazonPage.amazonSonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(arananKelime));
    }

    @When("Kullanici {string} ana sayfaya gider")
    public void kullaniciAnaSayfayaGider(String hedefURl) {
        Driver.getDriver().get(ConfigReader.getProperty(hedefURl));
    }

    @And("Kullanici {string} ana sayfaya gittigini test eder")
    public void kullaniciAnaSayfayaGittiginiTestEder(String hedefUrl) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(hedefUrl));
    }

    @Then("acilan tum sayfalari kapatir")
    public void acilanTumSayfalariKapatir() {
        Driver.getDriver().quit();
    }
}
