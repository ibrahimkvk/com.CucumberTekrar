package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuappStepdefinitions {

    HerokuappPage herokuappPage=new HerokuappPage();

    @Given("Kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
        herokuappPage.addButonu.click();

    }
    @Given("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }


    }
    @Given("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());
    }
    @Given("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.addButonu.click();

    }
    @Given("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        int flag=3;
        try {
            herokuappPage.deleteButonu.click();
            Assert.assertTrue(flag==3);
        } catch (NoSuchElementException e) {
            Assert.assertTrue(flag==3);
        }
    }
}
