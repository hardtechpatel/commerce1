package commerc;

import org.openqa.selenium.By;

public class UnregisteredUser extends Utils {
    LoadProp loadProp = new LoadProp();


    private By _clickonproduct = By.xpath("//img[@alt=\"Picture of Build your own computer\"]");
    private By _enteremailfriend = By.xpath("//input[@value=\"Email a friend\"]");
    private By _emailfriend  = By.xpath("//input[@value='Email a friend']");
    private By _friendemail = By.xpath("//input[@id='FriendEmail']");
    private By _youremail = By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _entermessage = By.xpath("//textarea[@placeholder='Enter personal message (optional).']");
    private By _sendemail = By.xpath("//input[@value=\"Send email\"]");

    public void unRegisteredUserCanNotReferProductToFriend(){
        clickelements(_clickonproduct);
        clickelements(_enteremailfriend);
        entertext(_friendemail, loadProp.getproperty("FriendEmail"));
        entertext(_youremail, loadProp.getproperty("youremail"));
        entertext(_entermessage, loadProp.getproperty("personalmessage"));
        clickelements(_sendemail);
    }

}
