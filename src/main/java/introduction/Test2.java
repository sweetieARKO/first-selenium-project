package introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&prevRID=QA0892ZE0CEYA0099EG1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Abigail Dadzie");
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Dazieabigail@gmail.com");
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Abigail124Dadzie");
        driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Abigail124Dadzie");
       driver.findElement(By.xpath("span[@id='auth-continue-announce']")).click();

        driver.close();
        String at ="Welcome";
        String et = "Welcome";
        System.out.println("Test Successful");

    }

}

