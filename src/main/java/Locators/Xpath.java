package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com/");
        driver.findElement(By.xpath("//a[@id='mbr-forgot-link']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abigail.arko@amalitech.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}