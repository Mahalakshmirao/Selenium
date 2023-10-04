package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 class Fb{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://browsers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Test Case Steps
        driver.get("https://example.com");
        WebElement link = driver.findElement(By.linkText("More information..."));
        link.click();

        String expectedUrl = "https://www.iana.org/domains/example";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test Case 3 Passed! Navigated to the expected URL.");
        } else {
            System.out.println("Test Case 3 Failed! Expected URL: " + expectedUrl + " Actual URL: " + actualUrl);
        }

        driver.quit();
    }
}
