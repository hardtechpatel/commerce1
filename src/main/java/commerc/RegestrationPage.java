package commerc;

import org.openqa.selenium.By;

public class RegestrationPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _firstName = By.xpath("//input[@data-val-required=\"First name is required.\"]");
    private By _lastName = By.xpath("//input[@name='LastName']");
    private By _email = By.name("Email");
    private By _PassWord = By.xpath("//input[@id='Password']");
    private By _ConfirmPassword =By.xpath("//input[@name='ConfirmPassword']")   ;
    private By _registerbutton = By.xpath("//input[@id=\"register-button\"]");

    //public void userShouldRegisterSuccesfully(){

        //assertURL("Register");
    //}

    public void userShoulsAbleToEnterRegisterationDetail(){
        entertext(_firstName,loadProp.getproperty("Firstname"));
        entertext(_lastName, loadProp.getproperty("lastName"));
        entertext(By.name("Email"), "rajesh" + randomdate() + "@test.com");
        entertext(_PassWord, loadProp.getproperty("PassWord"));
        entertext(_ConfirmPassword, loadProp.getproperty("ConfirmPassword"));
        clickelements(_registerbutton);
    }
}
