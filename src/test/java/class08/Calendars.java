package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Calendars extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://www.aa.com/homePage.do?locale=en_US";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //click on the cal
        WebElement calendar=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calendar.click();

        //select data  August 4 2023

        boolean monthFound=false;
        while (!monthFound) {
            WebElement month=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String currentMonth=month.getText();
            if (currentMonth.equals("August")) {
                System.out.println("You are on right month");
                List<WebElement> allDates= driver.findElements(By.xpath("//table/tbody/tr/td"));
                for(WebElement date:allDates){
                   String currentDate=date.getText();
                   if(currentDate.equals("4")){
                       date.click();
                   }
                }
                monthFound=true;

            }else{
               WebElement nxtBtn= driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
               nxtBtn.click();
        }

        }

    }
}
