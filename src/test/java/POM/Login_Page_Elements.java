package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Elements extends Base_POM {
    public Login_Page_Elements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[name=accept]")
    private WebElement acceptCookiesButton;

    @FindBy(css = "span[id=nav-link-accountList-nav-line-1]")
    private WebElement loginButton;

    @FindBy(css = "input[type=email]")
    private WebElement usernameInput;

    @FindBy(css = "input[id=continue]")
    private WebElement keepGoingButton;

    @FindBy(css = "input[type=password]")
    private WebElement passwordInput;

    @FindBy(css = "input[id=signInSubmit]")
    private WebElement signInSubmit;

    @FindBy(css = "span[class='nav-line-2 ']")
    private WebElement continueButton;


    public WebElement getAcceptCookiesButton() {return acceptCookiesButton;}
    public WebElement getLoginButton() {return loginButton;}
    public WebElement getUsernameInput() {return usernameInput;}
    public WebElement getKeepGoingButton() {return keepGoingButton;}
    public WebElement getPasswordInput() {return passwordInput; }
    public WebElement getSignInSubmit() {return signInSubmit;}
    public WebElement getContinueButton() {return continueButton;}

    public void loginFunction(String data1, String data2) {
        sleep();
        getAcceptCookiesButton().click();
        waitUntilVisibleAndClickable(getLoginButton());
        getLoginButton().click();
        getUsernameInput().sendKeys(data1);
        getKeepGoingButton().click();
        getPasswordInput().sendKeys(data2);
        getSignInSubmit().click();
    }

}
