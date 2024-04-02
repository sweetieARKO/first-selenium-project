package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class cssSeletor2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https:www.ebay.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("bags");
        driver.findElement(By.cssSelector("#gh-btn")).click();
    js.executeScript("window.scrollBy(0,300)");

    }
}