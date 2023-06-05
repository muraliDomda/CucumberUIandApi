package acceptence.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber/Cucumber.json","html:target/cucumber/cucumber.html"},
        glue = {"acceptence"},
        features = "src/test/resources/acceptence"
)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
