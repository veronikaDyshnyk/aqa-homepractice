import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test(description = "[GUI[numOfTest] - Verify User is able to login]", priority = 1)
    public void test() {
        Selenide.sleep(5000);
    }


}
