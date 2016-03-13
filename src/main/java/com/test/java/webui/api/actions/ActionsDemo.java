package com.test.java.webui.api.actions;

import com.test.java.webui.api.base.AbstractLocalHtml;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by beigui on 2016/3/11.
 * 功能：当鼠标双击的时候触发了字体变化的事件， doubleClick模拟了真实的双击动作，验证了字体属性
 */
public class ActionsDemo extends AbstractLocalHtml{
    @Test
    public void doubleClickTest() {
        launchLocalHtml("DoubleClickDemo.html");
        WebElement message = driver.findElement(By.id("message"));
        Assert.assertEquals("14px", message.getCssValue("font-size"));
        Actions builder = new Actions(driver);
        builder.doubleClick(message).build().perform();
        Assert.assertEquals("20px", message.getCssValue("font-size"));
    }
}
