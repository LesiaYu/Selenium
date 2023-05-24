package class03.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement firstName=driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Lesia");

        WebElement lastName=driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("Yushush");

        WebElement Email=driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']"));
        Email.sendKeys("lesiau2057@gmail.com");

        WebElement phone=driver.findElement(By.cssSelector("input[name^='phone']"));
        phone.sendKeys("(654)9988115");

        WebElement address= driver.findElement(By.cssSelector("input[name^='addr']"));
        address.sendKeys("Molodizna");

        WebElement city= driver.findElement(By.cssSelector("input[name*='city']"));
        city.sendKeys("Zbarazh");

        WebElement state= driver.findElement(By.xpath("//option[text()='Texas']"));
        state.click();

        WebElement zip=driver.findElement(By.cssSelector("input[name$='zip']"));
        zip.sendKeys("47302");

        WebElement web=driver.findElement(By.cssSelector("input[name$='website']"));
        web.sendKeys("dsahh.com");

        WebElement hosting=driver.findElement(By.xpath("//input[@value='yes']"));
        hosting.click();

        WebElement text=driver.findElement(By.xpath("//textarea[@name='comment']"));
        text.sendKeys("Hello world!");

        WebElement send=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        send.click();

        Thread.sleep(2000);
        driver.quit();




    }
}
