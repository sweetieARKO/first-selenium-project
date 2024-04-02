package ExpectionHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowException {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        try {
            driver.findElement(By.name("fake")).click();
        }
        catch (NoSuchElementException e) {
            System.out.println("Element not found");
            System.out.println("Hello");

            throw (e);
        }
        System.out.println("Hello");
    }

}
