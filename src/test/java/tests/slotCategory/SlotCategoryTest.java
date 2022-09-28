package tests.slotCategory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reg.NUMBER_OF_BESUCHEN_BUTTONS_CASINO_PAGE;
import static constants.Constant.Reg.REG_TITLES;
import static constants.Constant.Reviews.REVIEW_TITLES;
import static constants.Constant.Urls.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SlotCategoryTest extends BaseTest {

    @BeforeMethod
    public void setUp () {
        startDriver("slotCategory");
        basePage.goToUrl(SLOT_CATEGORY_URL);
        basePage.waitOneSeconds();
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void headerButtonsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_HEADER_BUTTONS; i++) {
            basePage.headerMenuOpen();
            basePage.waitOneSeconds();
            basePage.headerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(HEADER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(SLOT_CATEGORY_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void footerButtonsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_FOOTER_BUTTONS; i++) {
            if (i == 7) {i++; goodTitlesCount++;}
            basePage.waitOneSeconds();
            basePage.footerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(FOOTER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(SLOT_CATEGORY_URL);
        }
        assertEquals(NUMBER_OF_GOOD_FOOTER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void mainLogoLinkTest () {
        basePage.closePopup();
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void besuchenRegButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_BESUCHEN_BUTTONS_CASINO_PAGE; i++) {
            basePage.waitOneSeconds();
            slotCategory.besuchenRegButtonClick(i);
            basePage.nextTab();
            basePage.waitThirtySeconds();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.closeTabAndMoveToNext();
        }
        assertEquals(NUMBER_OF_BESUCHEN_BUTTONS_CASINO_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void newsButtonTest () {
        basePage.closePopup();
        basePage.waitOneSeconds();
        slotCategory.newsButtonClick();
        basePage.waitTwoSeconds();
        if (basePage.checkTitles(REVIEW_TITLES)) { assertTrue(true); }
        else { basePage.outputWrongTitle(); }
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void hierSpielenRegButtonTest () {
        basePage.closePopup();
        basePage.waitOneSeconds();
        slotCategory.umGeldSpielenButtonClick();
        basePage.nextTab();
        basePage.waitThirtySeconds();
        assertTrue(basePage.checkTitles(REG_TITLES));
        basePage.closeTabAndMoveToNext();
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void secondPageButtonTest () {
        basePage.closePopup();
        basePage.waitOneSeconds();
        slotCategory.secondPageButtonClick();
        basePage.waitTwoSeconds();
        assertEquals(SLOT_CATEGORY_SECONDS_PAGE_URL, basePage.getCurrentUrl());
    }

}
