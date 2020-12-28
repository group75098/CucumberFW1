import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",
        plugin = {
                "jason:target/cucumber.jason"
        },
        glue = "stepDef"
)


public class TestRunner extends AbstractTestNGCucumberTests {




}
