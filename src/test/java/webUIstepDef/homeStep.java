package webUIstepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WEB.homePage;

public class homeStep {
    homePage HomePage;
    public homeStep(){
        this.HomePage = new homePage();
    }

    @Given("user is on home page")
    public void userIsOnHomePage() {
        HomePage.goToHomePage();
    }

    @And("user click signup navigation on top menu")
    public void userClickSignupNavigationOnTopMenu() {
        HomePage.clickSignupNavigation();
    }

    @And("user create username in username textbox")
    public void userCreateUsernameInUsernameTextbox() {
        HomePage.createUsername();
    }

    @And("user create password in password textbox")
    public void userCreatePasswordInPasswordTextbox() {
        HomePage.createPassword();
    }

    @And("user click signup button")
    public void userClickSignupButton() {
        HomePage.clickSignupButton();
    }

    @Then("user will see alert message {string}")
    public void userWillSeeAlertMessage(String message) {
        HomePage.validateAlertMessage(message);
    }

    @And("user input username textbox with {string}")
    public void userInputUsernameTextboxWith(String text) {
        HomePage.inputExistUser(text);
    }

    @And("user click login navigation on top menu")
    public void userClickLoginNavigationOnTopMenu() {
        HomePage.clickLoginNavigation();
    }

    @And("user input username in username textbox")
    public void userInputUsernameInUsernameTextbox() {
        HomePage.inputUsername();
    }

    @And("user input password in password textbox")
    public void userInputPasswordInPasswordTextbox() {
        HomePage.inputPassword();
    }

    @And("user click login button")
    public void userClickLoginButton() {
        HomePage.clickLoginButton();
    }

    @Then("user will see user name visible on navigation menu")
    public void userWillSeeUserNameVisibleOnNavigationMenu() {
        HomePage.validateLoginStatus();
    }

    @And("user click logout navigation on top menu")
    public void userClickLogoutNavigationOnTopMenu() {
        HomePage.clickLogoutButton();
    }

    @Then("user will see login and signup navigation back to on top menu")
    public void userWillSeeLoginAndSignupNavigationBackToOnTopMenu() {
        HomePage.validateLogoutStatus();
    }

    @And("user input password textbox with {string}")
    public void userInputPasswordTextboxWith(String text) {
        HomePage.inputWrongPassword(text);
    }

    @And("user select {string} category")
    public void userSelectCategory(String text) {
        HomePage.chooseCategory(text);
    }

    @And("user will see list of products")
    public void userWillSeeListOfProducts() {
        HomePage.validateProductList();
    }

    @And("user click product title of item {string}")
    public void userClickProductTitleOfItem(String text) {
        HomePage.clickProductTitle(text);
    }

    @And("user go to the next page")
    public void userGoToTheNextPage() {
        HomePage.clickNextButton();
    }


}
