package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());

    public WomenPage()
    {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement clickOnJacket;

    public void clickOnJacket()
    {
        Reporter.log("Click On Jacket");
        clickOnElement(clickOnJacket);
        log.info("Click on jackets");
    }

    public void sortByProduct() {
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Product Name");

        // After Sorting value
        jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();

        //waitUntilVisibilityOfElementLocated(By.xpath("//strong[@class='product name product-item-name']//a"),10);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order

        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);

    }
    public void sortByPriceFilter() {
        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }

        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Price");

        // waitUntilVisibilityOfElementLocated(By.xpath("//li[@class='item product product-item']"),10);

        // After Sorting Products by Price
        jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();

        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }
}
