package pages.contactUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ContactUsPage extends BasePage {

    public ContactUsPage (WebDriver driver) {super(driver);}

    private final By nameInput = By.xpath("//input[@id='author']");
    private final By emailInput= By.xpath("//input[@id='email']");
    private final By commentIInput = By.xpath("//textarea[@id='comment']");
    private final By submitButton = By.xpath("//button[@class='c-btn c-btn--send c-form__btn']");
    private final By submitMessage = By.xpath("//div[@id='form-message']");

    public ContactUsPage enterName (String name) {
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }

    public ContactUsPage enterEmail (String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public ContactUsPage enterComment (String comment) {
        driver.findElement(commentIInput).sendKeys(comment);
        return this;
    }

    public ContactUsPage submitButtonClick () {
        driver.findElement(submitButton).click();
        return this;
    }

    public Boolean submitMessageVisibleCheck () {
        return elementVisibleCheck(submitMessage);
    }

}
