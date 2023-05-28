package class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement days=driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select sel=new Select(days);

        sel.selectByIndex(3);
        Thread.sleep(2000);

        sel.selectByValue("Thursday");
        Thread.sleep(2000);

        sel.selectByVisibleText("Friday");
        driver.close();







    }
}
