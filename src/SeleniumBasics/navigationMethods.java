package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationMethods {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("hyr tutorials");
        driver.findElement(By.name("q")).submit();
        driver.navigate().to("https://www.facebook.com/login/");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(30000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.quit();;


    }
}
