import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest extends BaseTest {

    @Test()
    public void test() {

        $(new By.ByXPath("//input[@id='twotabsearchtextbox']")).append("user");
        ElementsCollection list = $$(By.xpath(" //div[@id=\"reactApp\"]//child::div[@class=\"b5zgse-0 kxVzkh\"]//child::div[contains(@class, \"d4xojt-0\")]"));
        Selenide.sleep(5000);
    }

    /*
    search by xpath:
    //input[@id="twotabsearchtextbox"]
    //span[text()='.co.uk']
    //div[@class="nav-left"]//child::div
    //div[@id="reactApp"]//child::div[@class="b5zgse-0 kxVzkh"]//child::div[@class="d4xojt-0 cVccdj"]
    //div[@id="reactApp"]//child::div[@class="b5zgse-0 kxVzkh"]//child::div[contains(@class, "d4xojt-0")]
    or if short
    //div[contains(@class, "d4xojt-0")]
amazon is bad example as the is no collections but should look like this
//div[@id="reactApp"]//child::div[contains(@class, "d4xojt-0")]//parent::div
 //div[@id="reactApp"]//child::div[contains(@class, "d4xojt-0")]//following-sibling::div
 //div[@id="reactApp"]//child::div[contains(@class, "d4xojt-0")]//parent::div
//div[contains(@class, "d4xojt-0")]//ancestor::div





example to different page
//li[contains(@class, "octopus")][3]
//li[contains(@class, "octopus")]//ancestor::ul
//span[contains(@class, "seeMore")]
//input[@placeholder="Search Amazon.co.uk"]
//input[@placeholder="Search Amazon.co.uk" and @type="text"]


     */


}
/*
homework for second lecture -
find different elements on page:
dropdown,elem on site
(following, following sibling, parent, ancestor )
*/
