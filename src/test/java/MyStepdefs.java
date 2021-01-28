import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;
import pages.HomePage;
import pages.EGiftCardPage;
import pages.ProductPage;
import utils.SharedDriver;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    @Inject
    private SharedDriver driver;

    @Inject
    HomePage homePage;

    @Inject
    ProductPage productPage;

    @Inject
    EGiftCardPage eGiftCardPage;

    @Given("^I am on eGift card page$")
    public void iAmOnEGiftCardPage() {
        homePage.goToEGiftCardPage();
    }

    @When("I select Newest Arrivals sorting option")
    public void iSelectNewestArrivalsSortingOption() {
        eGiftCardPage.selectNewestArrivals();
    }

    @Then("I should able to see the Newest eGift card arrivals")
    public void iShouldAbleToSeeTheNewestEGiftCardArrivals() {
        eGiftCardPage.selectFirstProduct();
        HashMap<String,String> productDetails =  productPage.getProductDetails();

        assertEquals(productDetails.get("MODEL_NUMBER"), "307_US_Email");

    }

}
