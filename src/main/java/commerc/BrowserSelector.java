package commerc;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends Utils {
    LoadProp loadProp = new LoadProp();

    public void setUpBrowser(){
        String browser = loadProp.getproperty("Browser");
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecho.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Internet Explorer")){
            System.setProperty("webdriver.internet explorer.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else {
            System.out.println("Browser name is empty or type the wrong: "+ browser);
        }
    }

}
