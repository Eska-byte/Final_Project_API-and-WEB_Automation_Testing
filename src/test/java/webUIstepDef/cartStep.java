package webUIstepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.WEB.cartPage;
import pages.WEB.homePage;

public class cartStep {
    cartPage CartPage;
    public cartStep(){
        this.CartPage = new cartPage();
    }

    @And("user remove item from cart")
    public void userRemoveItemFromCart() {
        CartPage.clickDeleteButton();
    }

    @Then("user will see order details")
    public void userWillSeeOrderDetails() {
        CartPage.validateOrderDetails();
    }

    @And("user click place order button")
    public void userClickPlaceOrderButton() {
        CartPage.clickPlaceOrderButton();
    }

    @And("user input name in place order")
    public void userInputNameInPlaceOrder() {
        CartPage.inputName();
    }

    @And("user input credit card number")
    public void userInputCreditCardNumber() {
        CartPage.inputCreditCardNumber();
    }

    @And("user click purchase button")
    public void userClickPurchaseButton() {
        CartPage.clickPurchaseButton();
    }

    @And("user will see purchase details")
    public void userWillSeePurchaseDetails() {
        CartPage.validatePurchaseDetails();
    }
}
