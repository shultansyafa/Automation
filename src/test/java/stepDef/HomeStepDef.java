package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import runner.BaseTest;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @When("user adds the firts product to the cart")
    public void userAddsTheFirtsProductToTheCart() {
        homePage = new HomePage(driver);
        homePage.addingProduct();
    }

    @Then("user should see the product added to the cart")
    public void userShouldSeeTheProductAddedToTheCart() {
        homePage = new HomePage(driver);
        homePage.verifyProduct();
    }

    @And("user has added a product to the cart")
    public void userHasAddedAProductToTheCart() {
        homePage = new HomePage(driver);
        homePage.addingProduct();
    }

    @When("user clicks on the shopping cart icon")
    public void userClicksOnTheShoppingCartIcon() {
        homePage = new HomePage(driver);
        homePage.cartPage();
    }

    @Then("user should be redirected to the shopping cart page and see the added product")
    public void userShouldBeRedirectedToTheShoppingCartPageAndSeeTheAddedProduct() {
    }
}
