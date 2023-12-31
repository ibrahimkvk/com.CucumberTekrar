package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {
    public HerokuappPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//button[text()='Add Element']")
    public WebElement addButonu;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteButonu;
}
