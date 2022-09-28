package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import pages.base.BasePage;
import pages.casino.CasinoPage;
import pages.casinoCategory.CasinoCategory;
import pages.contactUs.ContactUsPage;
import pages.main.MainPage;
import pages.newsCategory.NewsCategory;
import pages.slotCategory.SlotCategory;

public class BaseTest {

    public BasePage basePage;
    public MainPage mainPage;
    public ContactUsPage contactUsPage;
    public CasinoPage casinoPage;
    public CasinoCategory casinoCategory;
    public NewsCategory newsCategory;
    public SlotCategory slotCategory;


    public void startDriver (String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "main" :
            case "findHookup" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "casinoCategory" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
            case "casino" :
                driver = CommonActions.createDriver("CHROME", 640, 360);
                break;
            case "slotCategory" :
                driver = CommonActions.createDriver("CHROME", 768, 1024);
                break;
            case "newsCategory" :
                driver = CommonActions.createDriver("CHROME", 1024, 768);
                break;
            case "contactUs" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "sugarDaddies" :
                driver = CommonActions.createDriver("CHROME", 1024, 768);
                break;
            case "hookupApps" :
                driver = CommonActions.createDriver("CHROME", 375, 667);
                break;
            case "localHookup" :
                driver = CommonActions.createDriver("CHROME", 667, 375);
                break;
            case "slot" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
        }
        basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
        contactUsPage = new ContactUsPage(driver);
        casinoPage = new CasinoPage(driver);
        casinoCategory = new CasinoCategory(driver);
        newsCategory = new NewsCategory(driver);
        slotCategory = new SlotCategory(driver);

    }

    @AfterMethod
    public void clearCookiesAndExit () {
        basePage.clearCookiesAndLocalStorageAndClose();
    }
}
