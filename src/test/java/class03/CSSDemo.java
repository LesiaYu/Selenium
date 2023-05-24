package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createNewAccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement fname=driver.findElement(By.cssSelector("input[name='firstname']"));
        fname.sendKeys("Lesia");

        WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Yuliana");


        WebElement closePop=driver.findElement(By.cssSelector("img[src$='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']"));
        closePop.click();


    }
}
