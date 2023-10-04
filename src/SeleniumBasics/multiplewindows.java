package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows  {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parentHandle=driver.getWindowHandle();
        System.out.println(parentHandle);
        driver.findElement(By.id("newWindowBtn")).click();;





    }
}
