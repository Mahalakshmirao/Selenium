package SeleniumBasics;
import java.util.*;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(3000);

        WebElement courseElement=driver.findElement(By.id("course"));
        Select courseNameDropDown=new Select(courseElement);
        List<WebElement> courseNameDropDownOptions=courseNameDropDown.getOptions();
        for(WebElement option:courseNameDropDownOptions){
            System.out.println(option.getText());
        }
        courseNameDropDown.selectByIndex(1);  
        Thread.sleep(3000);
        courseNameDropDown.selectByValue("net");
        Thread.sleep(3000);
        courseNameDropDown.selectByVisibleText("Javascript");
        Thread.sleep(3000);


//multidropdowns

        WebElement ideElement=driver.findElement(By.id("ide"));
        Select ideDropDown=new Select(ideElement);
        List<WebElement> ideDropDownOptions=ideDropDown.getOptions();
        for(WebElement opiton:ideDropDownOptions){
            System.out.println(opiton.getText());
        }
        ideDropDown.selectByIndex(0);
        Thread.sleep(3000);
        ideDropDown.selectByValue("ij");
        Thread.sleep(3000);
        ideDropDown.deselectByIndex(0);
        Thread.sleep(3000);
        ideDropDown.selectByIndex(3);
        Thread.sleep(3000);
        List<WebElement> selectedOptions=ideDropDown.getAllSelectedOptions();
        for(WebElement selectedOption:selectedOptions){
            System.out.println(selectedOption.getText());

        }




    }
}
