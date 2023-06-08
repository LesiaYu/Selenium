package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement name=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        name.sendKeys("Admin");
        WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();

        WebElement RecrBtn=driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        RecrBtn.click();
        WebElement dateApl=driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        dateApl.click();
        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(month);
        select.selectByVisibleText("Aug");

        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(year);
        select1.selectByValue("2032");

        List<WebElement> dates=driver.findElements(By.xpath("(//table/tbody)[2]/tr/td"));
        for(WebElement date:dates){
            String d=date.getText();
            if(d.equals("20")){
                date.click();
            }
        }
    }
}
