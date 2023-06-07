package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTables extends CommonMethods {
    public static void main(String[] args) {

        String url="http://hrm.syntax//input[@name='txtUsername']techs.net/humanresources/symfony/web/index.php/dashboard";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");

        WebElement pass=driver.findElement(By.name("txtPassword"));      //find the login btn
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();

        WebElement pimBtn=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        // print the row number that has id 56247A
        List <WebElement> allIDs=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for(int i=0; i<allIDs.size(); i++){
           String id= allIDs.get(i).getText();
           if(id.equals("56764A")){
               System.out.println("the id is on row number "+ (i+1));
               WebElement row=driver.findElement(By.xpath("//table/tbody/tr["+ (i + 1)+"]"));
               System.out.println(row.getText());

           }
        }

    }
}
