package org.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class NewTest {

    @Test()
    public void newtest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\vois\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/");
        WebElement txtbox_Search =
                driver.findElement(By.id("twotabsearchtextbox"));
              txtbox_Search.sendKeys("MOBILE");
              driver.findElement(By.id("nav-search-submit-button")).click();

             WebElement low_price =
                driver.findElement(By.id("low-price"));
        low_price.sendKeys("3500");
        WebElement high_price =
                driver.findElement(By.id("high-price"));
        high_price.sendKeys("5000");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.xpath("//*[@id=\"brandsRefinements\"]/ul/li[8]/span/div/a/span")).click();

        driver.findElement(By.xpath("//*[@id=\"p_89/HTC\"]/span/a/div/label/i")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.className("a-price-whole")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[3]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[2]/span/input")).click();


        }
    }




































