package testPackage;

import org.base.BaseTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class SecondTest extends BaseTest {

//    public void setUpDownloadFile(){
//        Configuration.reportsFolder = "downloads";
//        Configuration.fileDownload = FileDownloadMode.FOLDER;
//    }

public static String getFilePathByName(String fileName){

return new File("src/main/resources/files/" + fileName).getAbsolutePath();
}
    @Test
    public void test2() throws FileNotFoundException {
//        $(By.xpath("//input[@placeholder=\"Username\"]")).append("standard_user");//put something in
//        $(By.xpath("//input[@placeholder=\"Password\"]")).append("secret_sauce");
//        $(By.xpath("//input[@placeholder=\"Username\"]")).clear();//clear what is in
//        $(By.xpath("//input[@type=\"submit\"]")).click();
//        $(By.xpath("xpath")).doubleClick();
//        $(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).append("java");
//        Selenide.actions().sendKeys(Keys.ENTER).perform();
//        $(By.xpath("//select[@class=\"product_sort_container\"]")).click();
//        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
//        Selenide.actions().keyDown($(By.xpath("xpath from elem")),Keys.SHIFT).perform();//can choose few elems
//        Selenide.actions().keyUp($(By.xpath("to what elem")),Keys.SHIFT).perform();//can choose few elems

//        Selenide.actions().dragAndDrop($(By.xpath("source element")), $(By.xpath("target elem")));

//        $(By.xpath("xpath to dropdown menu")).hover();//we will see if dropdown menu works
//        String text = $(By.xpath("(//div[@class=\"inventory_item_name\"])[1]")).text();


//        ElementsCollection elements = $$(By.xpath("(//div[@class=\"inventory_item_name\"])[1]"));
//        for (SelenideElement element : elements) {
//            System.out.println(element);
//        }//we can see if collection !not empty







        //downloading of files
//        $(By.xpath("(//h3[@class=\"block-document__title\"]//a)[1]")).scrollIntoView(true);
//        Selenide.sleep(2000);
//
//        try {
//            File download = $(By.xpath("(//h3[@class=\"block-document__title\"]//a)[1]")).download();
//            String path = download.getPath();
//            //        download.getName();
//
//            FileUtils.deleteDirectory(new File("downloads"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //how to upload file
//        $(By.xpath("//input[1]")).uploadFile(new File(getFilePathByName("annual-enterprise-survey-2021-financial-year-provisional-csv.csv")));

//        Selenide.sleep(5000);


    }


}
//homework for lecture
