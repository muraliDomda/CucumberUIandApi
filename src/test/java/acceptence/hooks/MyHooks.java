package acceptence.hooks;

import acceptence.context.TestContext;
import acceptence.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MyHooks {
    private WebDriver driver;
    private final TestContext context;

    public MyHooks(TestContext context){
        this.context = context;
    }

    @Before
    public void before(Scenario scenario){
        System.out.println("BEFORE: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver = DriverFactory.initializeDriver(System.getProperty("browser", "chrome"));
        context.driver = driver;
    }

    @After
    public void after(Scenario scenario) throws InterruptedException {
        System.out.println("AFTER: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());

        try{
            driver.close();
        }
       catch(Exception e){

       }
        Thread.sleep(3000);
    }
}
