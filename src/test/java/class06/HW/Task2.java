package class06.HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement Btn=driver.findElement(By.xpath("//button[@id='save']"));
        Btn.click();

        WebElement firstName=driver.findElement(By.xpath("//*[contains(text(), 'First Name')]"));
        System.out.println(firstName.getText());








    }
}
