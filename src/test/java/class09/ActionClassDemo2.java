package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //when the element is inside the element we need to  switch frame
        driver.switchTo().frame(0);
        WebElement dragAble=driver.findElement(By.id("draggable"));
        WebElement dropAble=driver.findElement(By.id("droppable"));


        Actions action=new Actions(driver);
        action.dragAndDrop(dragAble,dropAble).perform();


    }
}
