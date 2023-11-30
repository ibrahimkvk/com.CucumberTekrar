package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualitilydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefnitions {

    QualitilydemyPage qualitilydemyPage=new QualitilydemyPage();

    @Then("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        qualitilydemyPage.loginButonu.click();
    }

    @Then("Kullanici email butonuna {string}  girer")
    public void kullanici_email_butonuna_girer(String gercerliusername) {
        qualitilydemyPage.loginEmailButonu.sendKeys(ConfigReader.getProperty(gercerliusername));
    }


    @Then("Kullanici password butonuna  {string} girer")
    public void kullanici_password_butonuna_girer(String gecerlipassword) {
        qualitilydemyPage.loginPasswordButonu.sendKeys(ConfigReader.getProperty(gecerlipassword));
    }


    @Then("Kullanici login butonuna basar")
    public void kullanici_login_butonuna_basar() {
        qualitilydemyPage.LoginGirisButonu.click();
    }

    @Given("kullanici dogru bilgilerle login oldugunu test eder")
    public void kullanici_dogru_bilgilerle_login_oldugunu_test_eder() {
        Assert.assertTrue(qualitilydemyPage.basariliGirisElementi.isDisplayed());
    }

    @When("Kullanici cikan cookies i kabul eder")
    public void kullaniciCikanCookiesIKabulEder() {
        qualitilydemyPage.cookiesKabul.click();
    }

    @And("Kullanici  ikinci login butonuna basar")
    public void kullaniciIkinciLoginButonunaBasar() {
        qualitilydemyPage.LoginGirisButonu.click();
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }
    }

    @Given("kullanici yanlis bilgilerle login olamadigini test eder")
    public void kullaniciYanlisBilgilerleLoginOlamadiginiTestEder() {
        Assert.assertTrue(qualitilydemyPage.loginEmailButonu.isDisplayed());
    }

    @Then("Kullanici email butonuna {string}  yazar")
    public void kullaniciEmailButonunaYazar(String yanlisUsername) {
        qualitilydemyPage.loginEmailButonu.sendKeys(yanlisUsername);
    }

    @When("Kullanici password butonuna  {string} yazar")
    public void kullaniciPasswordButonunaYazar(String yanlisPassword) {
        qualitilydemyPage.loginPasswordButonu.sendKeys(yanlisPassword);
    }
}