package Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.facebook.com/signup");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        WebElement email = driver.findElement(By.name("reg_email__"));
        WebElement emailConfirmation = driver.findElement(By.name("reg_email_confirmation__"));
        WebElement password = driver.findElement(By.id("password_step_input"));
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select select = new Select(month);
        WebElement day = driver.findElement(By.name("birthday_day"));
        Select select1 = new Select(day);
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select select2 = new Select(year);
        WebElement sex = driver.findElement(By.name("sex"));
        WebElement button = driver.findElement(By.name("websubmit"));
        sendKeys(driver, firstname, 10, "Abigail");
        sendKeys(driver, lastname, 100, "Arko");
        sendKeys(driver, email, 30, "arkoabigail@gmail.com");
        sendKeys(driver,emailConfirmation, 50, "arkoabigail@gmail.com");
        sendKeys(driver,password, 10, "Abigail&215Arko");
        select.selectByValue("6");
        select1.selectByVisibleText("8");
        select2.selectByIndex(34);  // Changed from deselectByIndex to selectByIndex
        sex.click();
        System.out.println(sex.isSelected());
        button.click();


    }
    public static void sendKeys(WebDriver driver, WebElement element, int i, String value)
    {
        Duration timeout = Duration.ofSeconds(200);
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    public static void clickOn(WebDriver driver, WebElement element,  String value)
    {
        Duration timeout = Duration.ofSeconds(200);
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
}
