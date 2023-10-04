package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(3000);
        WebElement email=driver.findElement(By.id("email"));
        if(email.isDisplayed()){
            if(email.isEnabled()){
                email.sendKeys("itsworking");
                String name=email.getAttribute("value");
                Thread.sleep(3000);
                email.clear();
                System.out.println(name);

            }
            else {
                System.out.println("user email is not enables");
            }
        }
        else{
            System.out.println("useremail is not displayed");
        }



    }

}
