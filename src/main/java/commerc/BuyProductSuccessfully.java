package commerc;

import org.openqa.selenium.By;

public class BuyProductSuccessfully extends Utils {
    LoadProp loadProp = new LoadProp();
    RegestrationPage regestrationPage = new RegestrationPage();

    private By _clickcontinuebutton = By.xpath("//img[@alt=\"nopCommerce demo store\"]");
    private By _selectandroidproduct = By.xpath("//img[@alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]");
    private By _addproducttocart = By.xpath("//input[@id=\"add-to-cart-button-18\"]");
    private By _shoppingcart = By.linkText("Shopping cart");
    private By _ticktermsandcond = By.xpath("//input[@name=\"termsofservice\"]");
    private By _clickcheckout = By.xpath("//button[@name=\"checkout\"]");
    private By _firstname = By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]");
    private By _lastname = By.id("BillingNewAddress_LastName");
    private By _email = By.id("BillingNewAddress_Email");
    private By _selectcountry = By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]");
    private By _enterCity = By.id("BillingNewAddress_City");
    private By _doorNumber = By.id("BillingNewAddress_Address1");
    private By _streetName = By.id("BillingNewAddress_Address2");
    private By _ZipCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _MobileNumber = By.id("BillingNewAddress_PhoneNumber");
    private By _countinue = By.id("billing-buttons-container");
    private By _continuebutton = By.xpath("//input[@onclick=\"ShippingMethod.save()\"]");
    private By _ChoosePaymentMathod = By.xpath("//input[@id=\"paymentmethod_1\"]");
    private By _continueagain = By.xpath("//input[@onclick=\"PaymentMethod.save()\"]");
    private By _creditcard = By.xpath("//select[@name=\"CreditCardType\"]");
    private By _entercustomername = By.xpath("//input[@name=\"CardholderName\"]");
    private By _entercarddetail = By.xpath("//input[@name=\"CardNumber\"]");
    private By _selectMonth = By.xpath("//select[@id=\"ExpireMonth\"]");
    private By _selectYear = By.xpath("//select[@name=\"ExpireYear\"]");
    private By _cardcode = By.xpath("//input[@name=\"CardCode\"]");
    private By _continuelast = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _confirm = By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]");


    public void registeruserboughtandroidproduct(){

        clickelements(_clickcontinuebutton);
        clickelements(_selectandroidproduct);
        clickelements(_addproducttocart);
        clickelements(_shoppingcart);
        clickelements(_ticktermsandcond);
        clickelements(_clickcheckout);
        entertext(_firstname, loadProp.getproperty("Firstname"));
        entertext(_lastname, loadProp.getproperty("lastName"));
        //entertext(_email, "rajesh" + randomdate() + "@test.com");
        selectbyvisibletext(_selectcountry,"United Kingdom");
        entertext(_enterCity, loadProp.getproperty("enterCity"));
        entertext(_doorNumber, loadProp.getproperty("doorNumber"));
        entertext(_streetName, loadProp.getproperty("streetName"));
        entertext(_ZipCode, loadProp.getproperty("ZipCode"));
        entertext(_MobileNumber, loadProp.getproperty("MobileNumber"));
        clickelements(_countinue);
        clickelements(_continuebutton);
        clickelements(_ChoosePaymentMathod);
        clickelements(_continueagain);
        selectbyvisibletext(_creditcard, "Master card");
        entertext(_entercustomername, loadProp.getproperty("entercustomername"));
        entertext(_entercarddetail, loadProp.getproperty("entercarddetail"));
        selectbyvisibletext(_selectMonth, "09");
        selectbyvisibletext(_selectYear, "2020");
        entertext(_cardcode, loadProp.getproperty("cardcode"));
        clickelements(_continuelast);
        clickelements(_confirm);

    }
}

