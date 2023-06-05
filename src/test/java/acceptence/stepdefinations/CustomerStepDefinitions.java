package acceptence.stepdefinations;

import acceptence.constants.MyConstants;
import acceptence.context.TestContext;
import acceptence.domainobjects.BillingDetails;
import acceptence.pages.PageFactoryManager;
import acceptence.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CustomerStepDefinitions {
    private final TestContext context;
    private final StorePage storePage;

    public CustomerStepDefinitions(TestContext context){
        this.context = context;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @And("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
    }

    @Given("I'm a guest customer")
    public void iMAGuestCustomer() {
        storePage.load(MyConstants.STORE);
    }
}
