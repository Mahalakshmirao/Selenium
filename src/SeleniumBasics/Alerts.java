package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.id("alertBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());

        //confirm box
        driver.findElement(By.id("confirmBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("confirmBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(30000);


        //promptbox
        driver.findElement(By.id("promptBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("hyr tutorials");
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());

        Thread.sleep(3000);

        driver.findElement(By.id("promtBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("output")).getText());







    }
}
