package pages.slotCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.casino.CasinoPage;

public class SlotCategory extends BasePage {

    public SlotCategory(WebDriver driver) {super(driver);}

    private final By newsButton = By.xpath("(//a[@class='c-last-articles__item'])[3]");
    private final By secondPageButton = By.xpath("(//a[@class='c-pagination__link'])[1]");
    private final By umGeldSpielenButton = By.xpath("//a[contains(@class,'c-btn c-btn--primary c-btn--lg c-banner__btn')]");

    public SlotCategory besuchenRegButtonClick (int numButton) {
        By besuchenRegButton = By.xpath("(//a[contains(@title,'Besuchen')])[" + numButton + "]");
        driver.findElement(besuchenRegButton).click();
        return this;
    }

    public SlotCategory newsButtonClick () {
        driver.findElement(newsButton).click();
        return this;
    }

    public SlotCategory secondPageButtonClick () {
        driver.findElement(secondPageButton).click();
        return this;
    }

    public SlotCategory umGeldSpielenButtonClick () {
        driver.findElement(umGeldSpielenButton).click();
        return this;
    }

}
