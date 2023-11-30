package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {
    public EditorPage() {
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonu;

    @FindBy(id="DTE_Field_first_name")
    public WebElement firtNameButonu;

    @FindBy(id="DTE_Field_last_name")
    public WebElement lastNameButonu;

    @FindBy(id="DTE_Field_position")
    public WebElement positionButonu;

    @FindBy(id="DTE_Field_office")
    public WebElement officeButonu;

    @FindBy(id="DTE_Field_extn")
    public WebElement extensionButonu;

    @FindBy(id="DTE_Field_start_date")
    public WebElement startDateButonu;

    @FindBy(id="DTE_Field_salary")
    public WebElement salaryButonu;

    @FindBy( xpath = "//button[text()='Create']")
    public WebElement createButonu;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement birinciIsimSatiri;


}
