package tests;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTests extends CommonAPI {
    @Test
    public void iFrameTests() {
        driver.switchTo().frame(1);
        driver.get(driver.getCurrentUrl());
        //driver.switchTo().frame("iframe2");
        sleepFor(5);
        //-frameID,         //FrameName         //FrameIndex
        WebElement element = getElementByLinkText("Sortable");
        Assert.assertEquals(element.getText(), "Sortablgge", "toolsQA interactions sortable assertion failed");
    }
}
