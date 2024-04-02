package introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(4000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
        Thread.sleep(4000);
        driver.findElement(By.id("nav-search-submit-button")).click();
       driver.navigate().to("http://eduraka.co/blog");
       Thread.sleep(4000);
       driver.navigate().back();
       Thread.sleep(200);
       driver.quit();

            }
}