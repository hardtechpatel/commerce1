package commerc;

import org.openqa.selenium.By;

public class CheckOutResultPage extends Utils {
    private By _CheckoutPge = By.xpath("//div[@class=\"page-title\"]");

    public void toVerifyUserShouldSeeTheCheckoutMessage(){
        assertURL("checkout");
        assertTextMessage("Checkout", _CheckoutPge);

    }
}
