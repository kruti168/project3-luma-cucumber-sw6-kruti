package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GearSteps {

    @When("^I should hoovering mouse on gear menu$")
    public void iShouldHooveringMouseOnGearMenu()
    {
        new HomePage().mouseHoveOnGearMenu();
    }

    @And("^I click on bags$")
    public void iClickOnBags()
    {
        new GearPage().clickOnBags();
    }

    @And("^I click on product name 'Overnight Duffle'$")
    public void iClickOnProductNameOvernightDuffle()
    {
        new GearPage().productNameOvernightDuffle();
    }

    @And("^Verify text OvernightDuffle$")
    public void verifyTextOvernightDuffle()
    {
        new GearPage().verifyTextOvernightDuffle();
    }

    @And("^I should change Qty (\\d+)$")
    public void iShouldChangeQty(int arg0)
    {
        new GearPage().changeQty3();
    }

    @And("^I should click on product name Overnight Duffle Add to Cart button$")
    public void iShouldClickOnProductNameOvernightDuffleAddToCartButton()
    {
        new GearPage().addToCart();
    }

    @And("^I should click on shopping cart link into message$")
    public void iShouldClickOnShoppingCartLinkIntoMessage()
    {
        new GearPage().shoppingCartLinkMessage();
    }

    @And("^Verify the text You added Overnight Duffle to your shopping cart$")
    public void verifyTheTextYouAddedOvernightDuffleToYourShoppingCart()
    {
        new GearPage().verifyTextShoppingCart();
    }




    @And("^Verify the product price ‘\\$(\\d+)\\.(\\d+)’$")
    public void verifyTheProductPrice$(int arg0, int arg1)
    {
        new GearPage().productPrice$135();
    }

    @And("^Change Qty to ‘(\\d+)’$")
    public void changeQtyTo(int arg0)
    {
        new GearPage().changeQty5();
    }

    @Then("^verify the product price '(\\d+)\\.(\\d+)'$")
    public void verifyTheProductPrice(int arg0, int arg1)
    {
        new GearPage().productPrice$225();
    }

    @And("^I should update product successfully to shopping cart$")
    public void iShouldUpdateProductSuccessfullyToShoppingCart()
    {
        new GearPage().updateShoppingCartButton();
    }
}
