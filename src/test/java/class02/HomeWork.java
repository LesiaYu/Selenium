package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createNew=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[5]/a"));
        createNew.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.xpath( "//input[@name='firstname']"));
        firstName.sendKeys("Lesia");
        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Yushchyshyn");
        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("lesiau2057@gmail.com");
        WebElement emailRe=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        emailRe.sendKeys("lesiau2057@gmail.com");

        WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("2066Fa");
        WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        month.sendKeys("May");
        WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        day.sendKeys("20");
        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        year.sendKeys("1987");
        WebElement gen=driver.findElement(By.xpath("//label[text()='Female']"));
        gen.click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();







    }
}
