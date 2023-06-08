package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablesDynamic3 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement name = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        name.sendKeys("Admin");
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();




       boolean found=false;
       while (!found){
                                //get all the ids
           List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
                                //iterate through the ids
        for (int i = 0; i < allIds.size(); i++) {
            String id = allIds.get(i).getText();
            if (id.equals("53481A")) {
                System.out.println("click on the checkbox on row number " + (i + 1));
                WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkbox.click();
                                 //to break the while loop
                found=true;
                                 //to break the for loop
                break;
            }
        }
        if(!found){
            //click next page
            WebElement nextBtn=driver.findElement(By.xpath("//a[text()='Next']"));
            nextBtn.click();
        }

        }
    }
}
