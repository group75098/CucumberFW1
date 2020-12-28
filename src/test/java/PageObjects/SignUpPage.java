package PageObjects;


import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseUtil {

    public SignUpPage (WebDriver driver){
            PageFactory.initElements(driver, this);
            BaseUtil.driver = driver;
        }
        public void goToSignupPage(){
            String getCurrentUrl = driver.getCurrentUrl();
            System.out.println (getCurrentUrl);
            String signUpPage = getCurrentUrl+"home/signup";
            System.out.println (signUpPage);
            driver.get(signUpPage);
        }

    public void test2(){

    }


}


