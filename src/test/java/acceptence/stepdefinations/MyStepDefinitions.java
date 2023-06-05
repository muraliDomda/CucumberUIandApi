package acceptence.stepdefinations;

import acceptence.context.TestContext;
import acceptence.domainobjects.BillingDetails;
import org.openqa.selenium.WebDriver;

public class MyStepDefinitions {
    private final WebDriver driver;
    private BillingDetails billingDetails;

    public MyStepDefinitions(TestContext context){
        driver = context.driver;
    }
}
