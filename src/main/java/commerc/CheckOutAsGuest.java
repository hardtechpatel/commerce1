package commerc;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckOutAsGuest extends Utils {
    LoadProp loadProp = new LoadProp();


     private By _clickonproduct = By.xpath("//img[@alt=\"Picture of Build your own computer\"]");
     private By _clickHDD = By.xpath("//label[@for=\"product_attribute_3_6\"]");
     private By _clickonaddtocart = By.xpath("//input[@id=\"add-to-cart-button-1\"]");
     private By _clickoncart = By.xpath("//span[@class=\"cart-label\"]");
     private By _clickterms = By.xpath("//label[@for=\"termsofservice\"]");
     private By _clickoncheckout = By.id("checkout");
     private By _clickguest = By.xpath("//input[@class=\"button-1 checkout-as-guest-button\"]");
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


     public void guestUserShouldAbleToBuyProduct(){
         clickelements(_clickonproduct);
         clickelements(_clickHDD);
         clickelements(_clickonaddtocart);
         clickelements(_clickoncart);
         clickelements(_clickterms);
         clickelements(_clickoncheckout);
         clickelements(_clickguest);
         entertext(_firstname, loadProp.getproperty("hari"));
         entertext(_lastname, loadProp.getproperty("ram"));
         entertext(_email, loadProp.getproperty("email12"));
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
