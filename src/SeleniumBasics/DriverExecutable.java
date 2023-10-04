package SeleniumBasics;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverExecutable {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.id("email")));
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.name("pass")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.className("_9axz")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.linkText("Forgotten account?")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.partialLinkText("Sign")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.tagName("img")));
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.cssSelector("button[value='1']")));
       Thread.sleep(3000);
       driver.quit();

    }
        public static void highlight(WebDriver driver, WebElement element) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
        }




    }

