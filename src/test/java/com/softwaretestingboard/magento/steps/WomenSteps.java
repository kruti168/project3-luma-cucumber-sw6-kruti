package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomenSteps {

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^I  hovering mouse on women menu$")
    public void iHoveringMouseOnWomenMenu() {
        new HomePage().mouseHoverWomenMenu();

    }

    @And("^I  hovering mouse on Tops$")
    public void iHoveringMouseOnTops() {

        new HomePage().mouseHoverOnTop();
    }

    @And("^I click on jackets option$")
    public void iClickOnJacketsOption() throws InterruptedException{
        Thread.sleep(1000);
        new WomenPage().clickOnJacket();
    }


    @Then("^Verify the products name display in alphabetical order after sorting product name$")
    public void verifyTheProductsNameDisplayInAlphabeticalOrderAfterSortingProductName() {
        new WomenPage().sortByProduct();
    }

    @Then("^Verify the  price filter low to high after sorting price filter$")
    public void verifyThePriceFilterLowToHighAfterSortingPriceFilter() {

       new WomenPage().sortByPriceFilter();
    }
}
