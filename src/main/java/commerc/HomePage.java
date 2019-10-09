package commerc;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.util.Properties;

public class HomePage extends Utils {

    String text = "Pappu";
    private By _registerLink = By.xpath("//a[@class=\"ico-register\"]");

    public void clickOnRegistrationButton(){

        clickelements(_registerLink);
    }



}
