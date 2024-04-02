package Alerts.Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("alert1")).click();
        Alert alert = driver.switchTo().alert();
        String txtOnAlert = alert.getText();
        System.out.println(txtOnAlert);
        Thread.sleep(3000);
        alert.accept();


    }
}