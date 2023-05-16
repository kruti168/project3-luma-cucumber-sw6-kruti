package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ProductBottomPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductBottomPage.class.getName());

    public ProductBottomPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement cronusYogaPantClickOnSize32;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement cronusYogaPantClickColourBlack;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement clickOnShoppingCart;


    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyText;

    //Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    public void productNameCronusYogaPantCLickOnSize32()
    {
        Reporter.log("Mouse Hover on product name Cronus Yoga Pant and click on size 32."+ "<br>");
        clickOnElement(cronusYogaPantClickOnSize32);
        log.info("Mouse Hover on product name Cronus Yoga Pant and click on size 32.:"+ "<br>");
    }

    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    public void productNameCronusYogaPantClickOnColourBlack()
    {
        Reporter.log("Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black."+ "<br>");
        clickOnElement(cronusYogaPantClickColourBlack);
        log.info("Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black."+ "<br>");
    }

    // Click on ‘shopping cart’ Link into message
    public void shoppingCartLink()
    {
        Reporter.log("Click on ‘shopping cart’ Link into message"+ "<br>");
        clickOnElement(clickOnShoppingCart);
        log.info("Click on ‘shopping cart’ Link into message"+ "<br>");
    }


    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    public void verifyTextMessage()
    {
        Reporter.log("Verify the text You added Cronus Yoga Pant to your shopping cart." + verifyText.toString()+ "<br>");
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = getTextFromElement(verifyText);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the text You added Cronus Yoga Pant to your shopping cart." + verifyText.toString()+ "<br>");
    }
}
