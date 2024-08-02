package pages.WEB;

import helpers.WEB.webUtility;
import org.openqa.selenium.By;

public class productPage extends webUtility {
    By productTitle = By.xpath("//h2[@class='name']");
    By productImage = By.xpath("//div[@class='product-image']");
    By productPrice = By.xpath("//h3[@class='price-container']");
    By productDescription = By.id("more-information");
    By addToCart_button = By.xpath("//*[text()='Add to cart']");
    By homepageNavigation = By.xpath("//a[text()='Home ']");
    By cartNavigatiom = By.id("cartur");


    public void validateProductDetails(){
        driver.findElement(productTitle).isDisplayed();
        driver.findElement(productImage).isDisplayed();
        driver.findElement(productPrice).isDisplayed();
        driver.findElement(productDescription).isDisplayed();
    }
    public void clickAddToCartButton(){
        driver.findElement(addToCart_button).click();
    }
    public void clickHomeNavigation(){
        driver.findElement(homepageNavigation).click();
    }
    public void clickCartNavigation(){
        driver.findElement(cartNavigatiom).click();
    }
}
