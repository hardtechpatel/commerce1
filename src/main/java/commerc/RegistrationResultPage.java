package commerc;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {
    private By _registerSuccessfulMessage = By.cssSelector("div.result");

    public void toVerifyUserSeeRegisterMassege(){
        assertURL("registerresult");
        assertTextMessage("Your registration completed", _registerSuccessfulMessage);

    }
}
