package pages.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverHelper;

public class CreateGroupOrderPage {
    public  CreateGroupOrderPage(){
        PageFactory.initElements(DriverHelper.getDriver(),this);
    }
    @FindBy(name = "InviteNote")
    private WebElement inviteNoteBox;

    @FindBy(id = "InviteList")
    private WebElement inviteListBox;


    @FindBy(id = "addressPreview")
    private WebElement officeAddress;

    @FindBy(id = "createGroupOrder")
    private WebElement createGroupOrderButton;

    @FindBy(tagName = "h1")
    private WebElement title;

    @FindBy(xpath = "//label[.='Total Participants:']//following-sibling::div")
    private WebElement numberOfParticipants;



    public boolean validationOfUrl(WebDriver driver){
        return driver.getCurrentUrl().contains("GroupOrders");
    }
    public void inviteNoteSendKeys(String invitationNote){
        inviteNoteBox.sendKeys(invitationNote);

    }
    public void inviteListSendKeys(String inviteList){
        inviteListBox.sendKeys(inviteList);
    }

    public boolean validationOfAddress(String OfficeAddress){
        return officeAddress.getText().trim().contains(OfficeAddress);
    }
public void clickCreateGroupOrderButton(){
        createGroupOrderButton.click();
}
public String validationOfTitle() throws InterruptedException {
        Thread.sleep(1000);
        return title.getText().trim();
}
public int validationOfNumberOfParticipants(){
        return Integer.parseInt(numberOfParticipants.getText().trim());
}
}
