package pages.casinoCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class CasinoCategory extends BasePage {

    public CasinoCategory(WebDriver driver) {super(driver);}

    private final By newsButton = By.xpath("(//a[@class='c-last-articles__item'])[3]");
    private final By secondPageButton = By.xpath("(//a[@class='c-pagination__link'])[1]");

    public CasinoCategory besuchenRegButtonClick (int numButton) {
        By besuchenRegButton = By.xpath("(//a[contains(@title,'Besuchen')])[" + numButton + "]");
        driver.findElement(besuchenRegButton).click();
        return this;
    }

    public CasinoCategory rezensionButtonClick (int numButton) {
        By rezensionButton = By.xpath("(//a[@class='c-tb-casinos__link'])[" + numButton + "]");
        driver.findElement(rezensionButton).click();
        return this;
    }

    public CasinoCategory newsButtonClick () {
        driver.findElement(newsButton).click();
        return this;
    }

    public CasinoCategory secondPageButtonClick () {
        driver.findElement(secondPageButton).click();
        return this;
    }

}
