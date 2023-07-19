package mytestpack;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException { 
    	Random rd = new Random();
    	String emailRD = "email_"+rd.nextInt();


        System.setProperty("webdriver.chrome.driver", "/home/magenest/Downloads/chromedriver_linux64 (2)/chromedriver");   
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver  driver = new ChromeDriver(options);      
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	driver.get("https://opensource-demo.orangehrmlive.com/"); 
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
        //step 1: nhập username vào txtbox U
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
        //step 2:
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
        //Step#: click
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//        driver.switchTo().alert().accept();
       String expU = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
    // pass: 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
driver.close();
        

        

    }
}