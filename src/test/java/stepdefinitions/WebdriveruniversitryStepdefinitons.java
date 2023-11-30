package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebdriveruniversityPage;
import utilities.Driver;

import java.util.List;
import java.util.Set;

public class WebdriveruniversitryStepdefinitons {
   WebdriveruniversityPage webdriveruniversityPage=new WebdriveruniversityPage();

    String birinciSayfaWhd="";
    Faker faker=new Faker();

    @Then("Login Portal a kadar asagi inilir")
    public void login_portal_a_kadar_asagi_inilir() {
       // JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
       // jse.executeScript("arguments[0].scrollIntoView(true);",webdriveruniversityPage.loginPortalButonu);
       Actions actions=new Actions(Driver.getDriver());
       actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("login portal a tiklanir")
    public void login_portal_a_tiklanir() {
        birinciSayfaWhd=Driver.getDriver().getWindowHandle();
        webdriveruniversityPage.loginPortalButonu.click();
    }
    @When("Diger window a gecilir")
    public void diger_window_a_gecilir() {

        String ikiciSayfaWhd="";
        Set<String> tumWhd=Driver.getDriver().getWindowHandles();
        for (String eachwhd:tumWhd
             ) {
            if(!eachwhd.equals(birinciSayfaWhd)) {
                ikiciSayfaWhd=eachwhd;
            }
        }
        Driver.getDriver().switchTo().window(ikiciSayfaWhd);

    }
    @When("Username ve password kutularina deger yazdirilir")
    public void username_ve_password_kutularina_deger_yazdirilir() {
        webdriveruniversityPage.usernameButonu.sendKeys(faker.name().username());
        webdriveruniversityPage.passwordButonu.sendKeys(faker.internet().password());
    }

    @When("Login butonuna basilir")
    public void login_butonuna_basilir() {
        webdriveruniversityPage.loginButonu.click();

    }

    @When("Popup'ta cikan yazinin validation failed oldugunu test edilir")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_edilir() {
        String alertYazisi=Driver.getDriver().switchTo().alert().getText();
        String expectedYazisi="validation failed";
        Assert.assertEquals(expectedYazisi,alertYazisi);
    }
    @When("Ok diyerek Popup'i kapatilir")
    public void ok_diyerek_popup_i_kapatilir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @When("Ilk sayfaya geri donulur")
    public void ilk_sayfaya_geri_donulur() {
        Driver.getDriver().switchTo().window(birinciSayfaWhd);
    }
    @Then("Ilk sayfaya donuldugunu test edilir")
    public void ilk_sayfaya_donuldugunu_test_edilir() {
        Assert.assertTrue(webdriveruniversityPage.loginPortalButonu.isDisplayed());


    }

}
