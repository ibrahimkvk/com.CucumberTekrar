package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorPage;

public class EditorStepdefinitions {

    EditorPage editorPage=new EditorPage();

    @When("Kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
        editorPage.newButonu.click();

    }
    @When("Kullanici firstName kutusuna {string} girer")
    public void kullanici_first_name_kutusuna_girer(String isim) {
        editorPage.firtNameButonu.sendKeys(isim);

    }
    @Then("Kullanici lastName kutusuna {string} girer")
    public void kullanici_last_name_kutusuna_girer(String soyisim) {
        editorPage.lastNameButonu.sendKeys(soyisim);


    }
    @And("Kullanici position kutusuna {string} girer")
    public void kullaniciPositionKutusunaGirer(String pozisyon) {

        editorPage.positionButonu.sendKeys(pozisyon);
    }


    @Then("Kullanici office kutusuna {string} girer")
    public void kullanici_office_kutusuna_girer(String office) {
        editorPage.officeButonu.sendKeys(office);


    }
    @When("Kullanici extension kutusuna {string} girer")
    public void kullanici_extension_kutusuna_girer(String eklenti) {
        editorPage.extensionButonu.sendKeys(eklenti);

    }
    @When("Kullanici start date kutusuna {string} girer")
    public void kullanici_start_date_kutusuna_girer(String tarih) {
        editorPage.startDateButonu.sendKeys(tarih);

    }
    @Then("Kullanici salary kutusuna {string} girer")
    public void kullanici_salary_kutusuna_girer(String maas) {
        editorPage.salaryButonu.sendKeys(maas);

    }

    @When("Kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
    editorPage.createButonu.click();
    }

    @Then("Kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String isim) {
        editorPage.searchBox.sendKeys(isim);
    }

    @When("isim bolumunde {string} oldugunun dogrular")
    public void isimBolumundeOldugununDogrular(String isim) {
        Assert.assertTrue(editorPage.birinciIsimSatiri.getText().contains(isim));
    }
}
