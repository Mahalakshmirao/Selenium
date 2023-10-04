package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

public class pageload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Instant startTime= Instant.now();
        driver.get("https://www.google.com/search?q=hi&oq=hi&aqs=chrome..69i57.3209j0j15&sourceid=chrome&ie=UTF-8");
        Instant endTime=Instant.now();
        Duration duration=Duration.between(startTime,endTime);
        System.out.println(duration.toMillis());
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
