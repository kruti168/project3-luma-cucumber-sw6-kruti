package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MenPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage()
    {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement clickOnPants;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]")
    WebElement clickOnAddToCart;

    //Click on Pants
    public void clickPants()
    {
        Reporter.log("Click on Pants"+ "<br>");
        clickOnElement(clickOnPants);
        log.info("Click on Pants : "+ "<br>");
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;


    public void productNameCronusYogaPantCLickOnSize32()
    {
        Reporter.log("Mouse Hover on product name Cronus Yoga Pant and click on size 32."+ "<br>");
        mouseHoverToElement1(cronusYogaPant);
        log.info("Mouse Hover on product name Cronus Yoga Pant and click on size 32.:"+ "<br>");
    }

    //Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    public void  CronusYogaPantClickAddToCartButton()
    {
        Reporter.log("Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button."+ "<br>");
        mouseHoverToElementAndClick1(clickOnAddToCart);
        log.info("Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button."+ "<br>");
    }
}
