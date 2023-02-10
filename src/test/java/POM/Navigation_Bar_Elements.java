package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation_Bar_Elements extends Base_POM {

    public Navigation_Bar_Elements(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(css = "input[id=twotabsearchtextbox]")
    private WebElement searchBox;

    @FindBy(css = "input[id=nav-search-submit-button]")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='nav-cart-count-container']")
    private WebElement goToBasket;


    public WebElement getSearchBox() {return searchBox;}
    public WebElement getSearchButton() {return searchButton;}
    public WebElement getGoToBasket() {return goToBasket;}


}
