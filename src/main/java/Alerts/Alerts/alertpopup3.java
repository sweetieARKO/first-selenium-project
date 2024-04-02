package Alerts.Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup3 {

        public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
            driver.findElement(By.id("password")).sendKeys("abigail124Ark&O");
            driver.findElement(By.xpath("//input[@name='proceed']")).click();
            Alert alert = driver.switchTo().alert();
            alert.getText();
            System.out.println(alert.getText());
            Thread.sleep(3000);
            alert.accept();
        }
    }

