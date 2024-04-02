package Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FleuntWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
        //Fluent Wait
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        WebElement content=fluentWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//h4[text()='Hello World'"));
            }

        });
        System.out.println(content.getText());

    }
}