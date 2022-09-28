package pages.casino;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class CasinoPage extends BasePage {

    public CasinoPage(WebDriver driver) {super(driver);}

    private final By hierSpielenRegButton = By.xpath("//a[contains(@class,'c-btn c-btn--primary c-btn--lg c-banner-casino__btn')]");
    private final By imGeldSpielenRegButtonButton = By.xpath("//a[contains(@class,'c-btn c-btn--primary c-btn--lg')]");
    private final By newsButton = By.xpath("(//a[@class='c-last-articles__item'])[3]");
    private final By alleCasinosButton = By.xpath("//a[@class='c-btn c-btn--more c-btn--full']");

    public CasinoPage besuchenRegButtonClick (int numButton) {
        By besuchenRegButton = By.xpath("(//a[contains(@title,'Besuchen')])[" + numButton + "]");
        driver.findElement(besuchenRegButton).click();
        return this;
    }

    public CasinoPage hierSpielenRegButtonClick () {
        driver.findElement(hierSpielenRegButton).click();
        return this;
    }

    public CasinoPage imGeldSpielenRegButtonButtonClick () {
        driver.findElement(imGeldSpielenRegButtonButton).click();
        return this;
    }

    public CasinoPage newsButtonClick () {
        driver.findElement(newsButton).click();
        return this;
    }

    public CasinoPage alleCasinosButtonClick () {
        driver.findElement(alleCasinosButton).click();
        return this;
    }

}
