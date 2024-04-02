package Listerners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListener;

public class MyTestListener implements WebDriverListener {
    public static void afterChangeValueOf(WebElement element, WebDriver driver) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

    }

    public static void afterClickOn(WebElement element, WebDriver driver) {
        // Implement your logic after a click on an element
    }

    public static void afterFindBy(By by, WebElement element, WebDriver driver) {
        // Implement your logic after finding an element
    }

    public void afterNavigateBack(WebDriver driver) {
        // Implement your logic after navigating back
    }

    public void afterNavigateForward(String url, WebDriver driver) {
        // Implement your logic after navigating forward
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        // Implement your logic after navigating to a new URL
        System.out.println("Hay I have navigated to url: " + url + "The title is:" + driver.getTitle());
    }

    public void beforeChangeOfValue(WebElement element, WebDriver driver) {
        // Implement your logic before changing the value of an element
    }

    public void onException(Throwable throwable, WebDriver driver) {
        // Implement your logic before changing the value of an element
        System.out.println("Hey, I encountered an exception"+throwable.getMessage());
    }
}

