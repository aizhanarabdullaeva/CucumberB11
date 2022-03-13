package pages.etsyPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverHelper;

public class etsyHomePage {
    public etsyHomePage(){
        PageFactory.initElements(DriverHelper.getDriver(),this);
    }
@FindBy(id = "global-enhancements-search-query")
    private WebElement searchBox;


    public void searchBoxSendKeys(String searchElement){
        searchBox.sendKeys(searchElement, Keys.ENTER);
    }
}
