package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alert1Btn=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();
        Thread.sleep(3000);
        Alert confirmationAlert=driver.switchTo().alert();
        confirmationAlert.accept();

       WebElement alert2Btn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()'] "));
       alert2Btn.click();
       Thread.sleep(3000);
       Alert confirmationAlert2=driver.switchTo().alert();
       confirmationAlert2.dismiss();

       WebElement alert3Btn= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
       alert3Btn.click();
       Thread.sleep(3000);

       Alert confirmationAlert3=driver.switchTo().alert();
       confirmationAlert3.sendKeys("Lesia");
       confirmationAlert3.accept();





    }
}
