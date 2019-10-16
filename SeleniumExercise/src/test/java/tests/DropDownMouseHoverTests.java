package tests;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMouseHoverTests extends CommonAPI {
    @Test(enabled = false)
    public void testDropDown() {
        WebElement element = getElement("//select[@id='gh-cat']");
        Select select = new Select(element);
        select.selectByIndex(3);
        sleepFor(5);
    }

    @Test(enabled = false)
    public void testMouseHover() {
        WebElement element = getElementByLinkText("Fashion");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Jewelry");
        sleepFor(5);
    }

    @Test(enabled = false)
    public void scrollToView() {
        WebElement element = getElementByLinkText("eBay for Charity");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        sleepFor(10);
    }

    @Test
    public void testScrolling() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        sleepFor(10);

    }
}
