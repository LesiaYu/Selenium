package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TaskHW1 extends CommonMethods {
    public static void main(String[] args) {

               //from the table choose any ID
        //and print out the row number of that id
        //
        //please make sure that ur code is dynamic enough to cater if another row gets delted , it still prints the row correctly

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement name=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        name.sendKeys("Admin");
        WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();

        WebElement pimBtn=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        List<WebElement> allId= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < allId.size(); i++) {
           String ID= allId.get(i).getText();
           if (ID.equals("10816935")){
               System.out.println("row number is "+(i+1));
               WebElement allRow=driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]"));
               System.out.println(allRow.getText());
           }

        }


    }
}
