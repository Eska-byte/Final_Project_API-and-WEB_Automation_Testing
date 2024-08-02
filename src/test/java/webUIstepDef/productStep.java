package webUIstepDef;

import io.cucumber.java.en.And;
import pages.WEB.homePage;
import pages.WEB.productPage;

public class productStep {
    productPage ProductPage;
    public productStep(){
        this.ProductPage = new productPage();
    }

    @And("user will direct to product details")
    public void userWillDirectToProductDetails() {
        ProductPage.validateProductDetails();
    }

    @And("user click add to cart button")
    public void userClickAddToCartButton() {
        ProductPage.clickAddToCartButton();
    }

    @And("user back to home page")
    public void userBackToHomePage() {
        ProductPage.clickHomeNavigation();
    }

    @And("user click cart navigation on top menu")
    public void userClickCartNavigationOnTopMenu() {
        ProductPage.clickCartNavigation();
    }
}
