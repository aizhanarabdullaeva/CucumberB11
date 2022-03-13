package pages.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.DriverHelper;

public class OrderPage {
    public OrderPage(){
        PageFactory.initElements(DriverHelper.getDriver(),this);
    }

    @FindBy(id="ConfirmAddressID")
   private WebElement deliveryOptions;

    @FindBy(xpath = "//label[@class=\"custom-control-label\"]")
  private  WebElement groupOrderBox;

@FindBy(id = "getAddressNextButton")
    private WebElement nextButton;






public void getDeliveryOption(String option){
    BrowserUtils.SelectBy(deliveryOptions,option,"text");

}
public void clickGroupOrder(){
    groupOrderBox.click();
}
public void clickNextButton(){
    nextButton.click();
}

}
