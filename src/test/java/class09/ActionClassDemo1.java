package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://www.amazon.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //find the element
        WebElement signIn=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));

        //Actions class
        Actions action=new Actions(driver);
        //perform the desried action
        action.moveToElement(signIn);
    }


}
