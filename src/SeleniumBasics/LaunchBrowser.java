package SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/search?q=java+tutorials&oq=java+tutorials+&aqs=chrome..69i57.5906j0j4&sourceid=chrome&ie=UTF-8");

    }
}
