package org.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class NewTest {

    @Test()
    public void newtest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\VOIS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Change resolution to 1024x768

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "1024x768");
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        WebElement txtbox_username =
                driver.findElement(By.id("email_create"));
        Random rand = new Random();
        int x =
                rand.nextInt((999 - 0) + 1) + 1;
        System.out.println(x);
        String Mail = "te2st" + x + "@hotmail.com";
        System.out.println(Mail);
        txtbox_username.sendKeys(Mail);
        driver.findElement(By.name("SubmitCreate")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement radio_button1 = driver.findElement(By.name("id_gender"));
        radio_button1.click();
        WebElement txtbox_firstname = driver.findElement(By.id("customer_firstname"));
        txtbox_firstname.sendKeys("Test");
        WebElement txtbox_lastname = driver.findElement(By.id("customer_lastname"));
        txtbox_lastname.sendKeys("Ahmed");
        WebElement txtbox_email = driver.findElement(By.id("email"));
        WebElement txtbox_password = driver.findElement(By.id("passwd"));
        txtbox_password.sendKeys("password");
        Select object_select = new Select(driver.findElement(By.id("days")));
        object_select.selectByIndex(1);
        Select object_select2 = new Select(driver.findElement(By.id("months")));
        object_select2.selectByIndex(1);
        Select object_select3 = new Select(driver.findElement(By.id("years")));
        object_select3.selectByIndex(6);
        WebElement txtbox_address = driver.findElement(By.id("address1"));
        txtbox_address.sendKeys("Nasr City,Abbas el akkad");
        WebElement txtbox_city = driver.findElement(By.id("city"));
        txtbox_city.sendKeys("Cairo");
        Select object_select4 = new Select(driver.findElement(By.id("id_state")));
        object_select4.selectByIndex(1);
        WebElement txtbox_postcode = driver.findElement(By.id("postcode"));
        txtbox_postcode.sendKeys("11765");
        Select object_select5 = new Select(driver.findElement(By.id("id_country")));
        object_select5.selectByIndex(1);
        WebElement txtbox_number = driver.findElement(By.id("phone_mobile"));
        txtbox_number.sendKeys("01126415864");
        WebElement txtbox_allias = driver.findElement(By.id("alias"));
        txtbox_allias.sendKeys("My address");
        driver.findElement(By.name("submitAccount")).click();
        driver.findElement(By.className("logout")).click();
// Second step
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement txtbox_login =
                driver.findElement(By.id("email"));
        txtbox_login.sendKeys(Mail);
        WebElement txtbox_loginpw =
                driver.findElement(By.id("passwd"));
        txtbox_loginpw.sendKeys("password");
        driver.findElement(By.name("SubmitLogin")).click();
// Third step
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.className("sf-with-ul")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span\n")).click();
        // Forth step
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img\n")).click();
// Fifth step
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span\n")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span\n")).click();
  // Sixth step
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
   // Seventh step
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span\n")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();


    }


}
