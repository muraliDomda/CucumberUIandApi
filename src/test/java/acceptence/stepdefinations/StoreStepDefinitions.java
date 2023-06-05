package acceptence.stepdefinations;

import acceptence.apis.CartApi;
import acceptence.constants.EndPoint;
import acceptence.context.TestContext;
import acceptence.domainobjects.Product;
import acceptence.pages.PageFactoryManager;
import acceptence.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StoreStepDefinitions {
    private final StorePage storePage;
    private final TestContext context;

    public StoreStepDefinitions(TestContext context){
        this.context = context;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @Given("I'm on the Store Page")
    public void iMOnTheStorePage() {
        storePage.load(EndPoint.STORE.url);
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product) {
        storePage.addToCart(product.getName());
    }

    @And("I have a product in the cart")
    public void iHaveAProductInTheCart() {
//        storePage.addToCart("Blue Shoes");
        CartApi cartApi = new CartApi(context.cookies.getCookies());
        cartApi.addToCart(1215, 1);
        context.cookies.setCookies(cartApi.getCookies());
        context.cookies.injectCookiesToBrowser(context.driver);
    }
}
