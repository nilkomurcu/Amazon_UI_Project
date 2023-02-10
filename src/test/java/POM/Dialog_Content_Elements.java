package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dialog_Content_Elements extends Base_POM {

    public Dialog_Content_Elements() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "(//img[@alt='1984'])[1]")
    private WebElement click1984Book;

    @FindBy(css = "img[alt='Dava: Modern Klasikler Serisi']")
    private WebElement davaBook;

    @FindBy(css = "img[alt='İnsanlar']")
    private WebElement insanlarBook;

    @FindBy(css = " img[alt='Sefiller (Ciltli)']")
    private WebElement sefilBook;

    @FindBy(css = "img[alt='Anayurt Oteli']")
    private WebElement anayurtBook;

    @FindBy(css = "img[alt='Simyacı']")
    private WebElement sımyacıBook;

    @FindBy(xpath = "//input[@name='submit.add-to-cart']")
    private WebElement addtoCart;

    @FindBy(xpath = "(//span[contains (@data-action, 'add-to-list-popover')])[1]")
    private WebElement addList;

    @FindBy(xpath = "(//input[@value='Sil'])[1]")
    private WebElement delete1Button;

    public WebElement getClick1984Book() { return click1984Book; }
    public WebElement getDavaBook() {return davaBook;}
    public WebElement getInsanlarBook() {return insanlarBook;}
    public WebElement getSefilBook() {return sefilBook;}
    public WebElement getAnayurtBook() {return anayurtBook;}
    public WebElement getSımyacıBook() {return sımyacıBook;}
    public WebElement getAddtoCart() {return addtoCart;}
    public WebElement getDelete1Button() {return delete1Button;}
}
