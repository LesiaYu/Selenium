package class01.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Lesia");
        driver.findElement(By.name("customer.lastName")).sendKeys("Yushchyshyn");
        driver.findElement(By.id("customer.address.street")).sendKeys("Olgy");
        driver.findElement(By.name("customer.address.city")).sendKeys("Zbarazh");
        driver.findElement(By.id("customer.address.state")).sendKeys("Ukraine");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("47302");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+380976285424");
        driver.findElement(By.id("customer.ssn")).sendKeys("7654320");
        driver.findElement(By.name("customer.username")).sendKeys("Lesiau2057");
        driver.findElement(By.id("customer.password")).sendKeys("20051987liuy");
        driver.findElement(By.id("repeatedPassword")).sendKeys("20051987liuy");
        Thread.sleep(3000);

        driver.quit();



    }
}
