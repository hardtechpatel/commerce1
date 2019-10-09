package commerc;

import org.openqa.selenium.By;

public class ReferProducToFriend extends Utils{
    LoadProp loadProp = new LoadProp();



    private By _countinueButton = By.xpath("//input[@value=\"Continue\"]");
    private By _clickonproduct = By.xpath("//h2//a[@href=\"/apple-macbook-pro-13-inch\"]");
    private By _emailfriend  = By.xpath("//input[@value='Email a friend']");
    private By _friendemail = By.xpath("//input[@id='FriendEmail']");
    private By _entermessage = By.xpath("//textarea[@placeholder='Enter personal message (optional).']");
    private By _sendemail = By.xpath("//input[@value=\"Send email\"]");


    //private static String timestamp = creatTimeStamp();



    public void referProductToFriendAndCheck(){

        clickelements(_countinueButton);
        clickelements(_clickonproduct);
        clickelements(_emailfriend);
        entertext(_friendemail, loadProp.getproperty("FriendEmail"));
        entertext(_entermessage, loadProp.getproperty("personalmessage"));
        clickelements(_sendemail);


    }

}
