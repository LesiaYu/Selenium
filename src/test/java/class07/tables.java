package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class tables extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //get the whole table
        WebElement wholeTable=driver.findElement(By.xpath("//table[@id='customers']"));
        String allText=wholeTable.getText();
        System.out.println(allText);

        //System.out.println(allText.contains("Google"));
        System.out.println("******************************************");

        //print all rows of the table
        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
        for(WebElement row:allRows){
            String rowText=row.getText();
            System.out.println(rowText);
        }

        System.out.println("***********************");
        //print the row that contains company Google
        List<WebElement> allRows1=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
        for(WebElement row:allRows1){
            String rowText1=row.getText();
            if(rowText1.contains("Google")){
                System.out.println(rowText1);
            }
                }

        System.out.println("************************************************");

         //allRows.get(2).getText  -----> only 3-d rows
        //column level access --> print each every data in table
       List <WebElement>allCellData=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td"));
        for(WebElement cell:allCellData){
            String cellData=cell.getText();
            System.out.println(cellData);
        }

    }
}
