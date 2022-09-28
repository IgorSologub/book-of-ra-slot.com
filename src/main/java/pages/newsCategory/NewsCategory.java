package pages.newsCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;
import pages.slotCategory.SlotCategory;

public class NewsCategory extends BasePage {

    public NewsCategory(WebDriver driver) {super(driver);}

    private final By newsButton = By.xpath("(//a[@class='c-last-articles__item'])[3]");
    private final By alleCasinosButton = By.xpath("//a[@class='c-btn c-btn--more c-btn--full']");

    public NewsCategory newsButtonClick () {
        driver.findElement(newsButton).click();
        return this;
    }

    public NewsCategory alleCasinosButtonClick () {
        driver.findElement(alleCasinosButton).click();
        return this;
    }

}
