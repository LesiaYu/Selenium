package class06.HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement Btn=driver.findElement(By.xpath("//button[@id='startButton']"));
        Btn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement textMes=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.textToBePresentInElement(textMes, "Welcome Syntax Technologies"));
        System.out.println(textMes.getText());

    }
}
