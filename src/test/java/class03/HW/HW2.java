package class03.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        WebElement cl=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        cl.click();

        WebElement isNotEmpty=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        isNotEmpty.click();
        Thread.sleep(2000);

        driver.quit();

    }
}
