package commerc;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegestrationPage regestrationPage = new RegestrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ReferProducToFriend referProducToFriend = new ReferProducToFriend();
    CheckOutAsGuest checkOutAsGuest = new CheckOutAsGuest();
    CheckOutResultPage checkOutResultPage = new CheckOutResultPage();
    UnregisteredUser unregisteredUser = new UnregisteredUser();
    BuyProductSuccessfully buyProductSuccessfully = new BuyProductSuccessfully();

    @Test
    public void UserShouldBeAbleToRegisterSuccessfully(){
        homePage.clickOnRegistrationButton();
        //regestrationPage.userShouldRegisterSuccesfully();
        regestrationPage.userShoulsAbleToEnterRegisterationDetail();
        registrationResultPage.toVerifyUserSeeRegisterMassege();
    }
    @Test
    public void userShouldBeAbleToReferProductToFriend(){
        homePage.clickOnRegistrationButton();
        //regestrationPage.userShouldRegisterSuccesfully();
        regestrationPage.userShoulsAbleToEnterRegisterationDetail();
        registrationResultPage.toVerifyUserSeeRegisterMassege();
        referProducToFriend.referProductToFriendAndCheck();
    }
    @Test
    public void guestUserShouldBuyProduct(){
        checkOutAsGuest.guestUserShouldAbleToBuyProduct();
      //  checkOutResultPage.toVerifyUserShouldSeeTheCheckoutMessage();
    }
    @Test
    public void unregisteredUserShouldNotBuyProduct(){
        unregisteredUser.unRegisteredUserCanNotReferProductToFriend();
    }
    @Test
    public void userShouldBeAbleToBuyProductSuccessfully(){
        homePage.clickOnRegistrationButton();
        //regestrationPage.userShouldRegisterSuccesfully();
        regestrationPage.userShoulsAbleToEnterRegisterationDetail();
        registrationResultPage.toVerifyUserSeeRegisterMassege();
        buyProductSuccessfully.registeruserboughtandroidproduct();
    }
}
