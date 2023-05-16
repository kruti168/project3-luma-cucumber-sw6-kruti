package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ProductBottomPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenSteps {

    @When("^I should hoovering mouse on men menu$")
    public void iShouldHooveringMouseOnMenMenu()
    {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("^I should hoovering  mouse on Bottoms$")
    public void iShouldHooveringMouseOnBottoms()
    {
        new HomePage().mouseHoverOnBottom();
    }

    @And("^I click on Pants$")
    public void iClickOnPants()
    {
        new MenPage().clickPants();
    }

    @And("^I should click on Add to Cart button$")
    public void iShouldClickOnAddToCartButton()
    {
        new MenPage().CronusYogaPantClickAddToCartButton();
    }

    @Then("^Verify the text Verify the text ‘You added Cronus Yoga Pant to your shopping cart\\.’$")
    public void verifyTheTextVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart()
    {
        new ProductBottomPage().verifyTextMessage();
    }

    @And("^I should add product successfully to shopping cart$")
    public void iShouldAddProductSuccessfullyToShoppingCart()
    {
        new ProductBottomPage().shoppingCartLink();
    }

    @And("^Verify the text Shopping Cart,Product Name, Product Size, Product Colour$")
    public void verifyTheTextShoppingCartProductNameProductSizeProductColour()
    {
        new ShoppingCartPage().verifyShoppingCart();
        new ShoppingCartPage().verifyProductNameCronusYogaPant();
        new ShoppingCartPage().verifyProductSize32();
        new ShoppingCartPage().verifyProductColourBlack();
    }

    @And("^I should click on size (\\d+)$")
    public void iShouldClickOnSize(int arg0)
    {
        new ProductBottomPage().productNameCronusYogaPantCLickOnSize32();
    }

    @And("^I should click on colour Black$")
    public void iShouldClickOnColourBlack()
    {
        new ProductBottomPage().productNameCronusYogaPantClickOnColourBlack();
    }}
