package commerc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUpBrowser(){
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com");
    }

    //
    // @AfterMethod
       public void closeBrowser(){

        driver.close();
    }
}
