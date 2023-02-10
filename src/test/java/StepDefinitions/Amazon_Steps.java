package StepDefinitions;
import POM.Dialog_Content_Elements;
import POM.Navigation_Bar_Elements;
import io.cucumber.java.en.Given;
import org.testng.annotations.Test;

public class Amazon_Steps {

    Navigation_Bar_Elements nb = new Navigation_Bar_Elements();
    Dialog_Content_Elements dc = new Dialog_Content_Elements();

    @Test(priority = 1)
    @Given("User search books")
    public void userSearchBooks() {
        nb.sleep();
        nb.clickFunction(nb.getSearchBox());
        nb.sendKeysFunction(nb.getSearchBox(),"1984");
        nb.clickFunction(nb.getSearchButton());
        dc.clickFunction(dc.getClick1984Book());
        dc.clickFunction(dc.getAddtoCart());

        nb.clickFunction(nb.getSearchBox());
        nb.clearFunction(nb.getSearchBox());
        nb.sendKeysFunction(nb.getSearchBox(),"Dava");
        nb.clickFunction(nb.getSearchButton());
        dc.clickFunction(dc.getDavaBook());
        dc.clickFunction(dc.getAddtoCart());

        nb.clickFunction(nb.getSearchBox());
        nb.clearFunction(nb.getSearchBox());
        nb.sendKeysFunction(nb.getSearchBox(),"Insanlar");
        nb.clickFunction(nb.getSearchButton());
        dc.clickFunction(dc.getInsanlarBook());
        dc.clickFunction(dc.getAddtoCart());

        nb.clickFunction(nb.getSearchBox());
        nb.clearFunction(nb.getSearchBox());
        nb.sendKeysFunction(nb.getSearchBox(),"Sefiller");
        nb.clickFunction(nb.getSearchButton());
        dc.clickFunction(dc.getSefilBook());
        dc.clickFunction(dc.getAddtoCart());

        nb.clickFunction(nb.getSearchBox());
        nb.clearFunction(nb.getSearchBox());
        nb.sendKeysFunction(nb.getSearchBox(),"Anayurt Oteli");
        nb.clickFunction(nb.getSearchButton());
        dc.clickFunction(dc.getAnayurtBook());
        dc.clickFunction(dc.getAddtoCart());

        nb.clickFunction(nb.getSearchBox());
        nb.clearFunction(nb.getSearchBox());
        nb.sendKeysFunction(nb.getSearchBox(),"Simyacı");
        nb.clickFunction(nb.getSearchButton());
        dc.clickFunction(dc.getSımyacıBook());
        dc.clickFunction(dc.getAddtoCart());

    }

    @Test(priority = 2)
    @Given("User delete Books List")
    public void userDeleteBooksList() {

        nb.clickFunction(nb.getGoToBasket());
        dc.clickFunction(dc.getDelete1Button());
        nb.sleep();



        dc.clickFunction(dc.getDelete1Button());
        nb.sleep();



        dc.clickFunction(dc.getDelete1Button());
        nb.sleep();


        dc.clickFunction(dc.getDelete1Button());
        nb.sleep();


        dc.clickFunction(dc.getDelete1Button());
        nb.sleep();

    }

}
