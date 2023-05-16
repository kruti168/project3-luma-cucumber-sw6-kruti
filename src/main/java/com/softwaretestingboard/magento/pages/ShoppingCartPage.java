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

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping Cart']")
    WebElement verifyShopping;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyCronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyProductSize32;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColourBlack;

    // Verify the text ‘Shopping Cart.'
    public void verifyShoppingCart()
    {
        Reporter.log("Verify the text ‘Shopping Cart.'" + verifyShopping.toString()+ "<br>");
        String expectedMessage = "Shopping Cart";
        String actualMessage = getTextFromElement(verifyShopping);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the text ‘Shopping Cart.'" + verifyShopping.toString()+ "<br>");
    }

    // Verify the product name ‘Cronus Yoga Pant’
    public void verifyProductNameCronusYogaPant()
    {
        Reporter.log("Verify the product name ‘Cronus Yoga Pant’" + verifyCronusYogaPant.toString()+ "<br>");
        String expectedMessage = "Cronus Yoga Pant";
        String actualMessage = getTextFromElement(verifyCronusYogaPant);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the product name ‘Cronus Yoga Pant’" + verifyCronusYogaPant.toString()+ "<br>");
    }

    // Verify the product size ‘32’
    public void verifyProductSize32()
    {
        Reporter.log("Verify the product size ‘32’" + verifyProductSize32.toString()+ "<br>");
        String expectedMessage = "32";
        String actualMessage = getTextFromElement(verifyProductSize32);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the product size ‘32’" + verifyProductSize32.toString()+ "<br>");
    }

    // Verify the product colour ‘Black’
    public void verifyProductColourBlack()
    {
        Reporter.log("Verify the product colour ‘Black’" + verifyProductColourBlack.toString()+ "<br>");
        String expectedMessage = "Black";
        String actualMessage = getTextFromElement(verifyProductColourBlack);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify the product colour ‘Black’" + verifyProductColourBlack.toString()+ "<br>");
    }

}
