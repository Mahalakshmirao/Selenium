package SeleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annot
// annotations.Test;

public class TestCases {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        Thread.sleep(2000);
        driver.findElement(By.id("login_field")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.name("commit")).click();



        driver.quit();
    }
}








