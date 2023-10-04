package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.security.model.SecurityState;


public class basics {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");


        driver.findElement(By.name("btnK")).click();
        
    }
}
