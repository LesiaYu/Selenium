package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);
        Thread.sleep(2000);

        driver.switchTo().frame(0);
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(animal);
        sel.selectByVisibleText("Baby Cat");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement text=driver.findElement(By.xpath("//input"));
        text.sendKeys("hello word");
        Thread.sleep(2000);
        driver.quit();




    }
}
