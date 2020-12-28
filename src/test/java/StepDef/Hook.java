package StepDef;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends BaseUtil {
    static String defaultBrowser = "ch";
    static String defaultEnv = "qa";
    static String url;
    static String baseUrl = System.getProperty("env");
    static String browserType = System.getProperty("browser");
    @Before
    public void openBrowser() {
        if (Strings.isNullOrEmpty(browserType)) {
            browserType = defaultBrowser;
        }
        if (Strings.isNullOrEmpty(baseUrl)) {
            baseUrl = defaultEnv;
        }
        driver = initDriver(browserType);
        switch (baseUrl) {
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                break;
            case "prod":
                url = "http://prod.taltektc.com";
                break;
        }
        driver.get(url);
    }
    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName()); //stick it in the report
            }
        } finally {
            System.out.println("closing the browser");
            driver.quit();

        }
    }

}