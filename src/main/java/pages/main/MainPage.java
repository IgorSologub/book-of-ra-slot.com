package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {super(driver);}

    private final By euroBonusOhneEinzahlungButton = By.xpath("//a[contains(@class,'c-btn c-btn--primary c-game-info__btn is-hide-to-sm')]");
    private final By umGeldSpielenButton = By.xpath("//a[contains(@class,'c-btn c-btn--primary c-btn--lg c-banner__btn')]");
    private final By newsButton = By.xpath("(//a[@class='c-last-articles__item'])[3]");
    private final By alleCasinosButton = By.xpath("//a[@class='c-btn c-btn--more c-btn--full']");

    public MainPage besuchenRegButtonClick (int numButton) {
        By besuchenRegButton = By.xpath("(//a[contains(@title,'Besuchen')])[" + numButton + "]");
        driver.findElement(besuchenRegButton).click();
        return this;
    }

    public MainPage rezensionButtonClick (int numButton) {
        By rezensionButton = By.xpath("(//a[@class='c-tb-casinos__link'])[" + numButton + "]");
        driver.findElement(rezensionButton).click();
        return this;
    }

    public MainPage euroBonusOhneEinzahlungButtonClick () {
        driver.findElement(euroBonusOhneEinzahlungButton).click();
        return this;
    }

    public MainPage umGeldSpielenButtonClick () {
        driver.findElement(umGeldSpielenButton).click();
        return this;
    }

    public MainPage newsButtonClick () {
        driver.findElement(newsButton).click();
        return this;
    }

    public MainPage alleCasinosButtonClick () {
        driver.findElement(alleCasinosButton).click();
        return this;
    }

}
