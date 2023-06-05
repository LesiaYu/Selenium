package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {

    public static void main(String[] args) {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement createNewAccountBtn= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccountBtn.click();

        WebElement firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
        sendText("abracadabra", firstname);

        WebElement days=driver.findElement(By.xpath("//select[@id='day']"));
        dropdowns(days,"8");



    }
}
