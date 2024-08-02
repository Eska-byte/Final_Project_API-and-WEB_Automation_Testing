package pages.WEB;

import helpers.WEB.webUtility;
import org.openqa.selenium.By;

public class cartPage extends webUtility {
    String name = randomName();
    String CCnumber = randomCCnumber();

    By deleteButton = By.xpath("//*[text()='Delete']");
    By orderDetails = By.xpath("//*[@class='table-responsive']");
    By placeOrderButton = By.xpath("//*[text()='Place Order']");
    By nameTextbox = By.id("name");
    By creditCardTextbox = By.id("card");
    By purchaseButton = By.xpath("//*[@onclick='purchaseOrder()']");
    By purchaseDetails = By.xpath("//*[@class='sweet-alert  showSweetAlert visible']");

    public void clickDeleteButton(){
        driver.findElement(deleteButton).click();
    }
    public void validateOrderDetails(){
        driver.findElement(orderDetails).isDisplayed();
    }
    public void clickPlaceOrderButton(){
        driver.findElement(placeOrderButton).click();
    }
    public void inputName(){
        driver.findElement(nameTextbox).sendKeys(name);
    }
    public void inputCreditCardNumber(){
        driver.findElement(creditCardTextbox).sendKeys(CCnumber);
    }
    public void clickPurchaseButton(){
        driver.findElement(purchaseButton).click();
    }
    public void validatePurchaseDetails(){
        driver.findElement(purchaseDetails).isDisplayed();
    }
}
