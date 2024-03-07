package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePage {

    By addingProductToTheCart = By.id("add-to-cart-sauce-labs-backpack");

    By navigateToTheShoppingCartPage = By.cssSelector(".shopping_cart_link");

    By verifyTheProductIsAddedToTheCart = By.cssSelector(".shopping_cart_badge");

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    By cartItem = By.cssSelector(".cart_item");

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void validateOnHomePage(){
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void addingProduct(){
        driver.findElement(addingProductToTheCart).click();
    }

    public void verifyProduct(){
        WebElement verify = driver.findElement(verifyTheProductIsAddedToTheCart);
        assert verify.getText().equals("1");
    }

    public void cartPage(){
        driver.findElement(navigateToTheShoppingCartPage).click();
        assert driver.getCurrentUrl().equals("https://www.saucedemo.com/cart.html");
        WebElement item = driver.findElement(cartItem);
    }
}
