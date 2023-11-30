package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitilydemyPage {
    public QualitilydemyPage() {
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginButonu;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement loginEmailButonu;

    @FindBy(id="login-password")
    public WebElement loginPasswordButonu;

    @FindBy(xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement LoginGirisButonu;

    @FindBy(xpath = "//a[text()='My courses']")
    public WebElement basariliGirisElementi;

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement cookiesKabul;
}
