package testFucntion;

import com.juaracoding.driverConnection.Driver;
import com.juaracoding.driverConnection.page.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestLogin {
    public static WebDriver driver;
    public Login login;


    @BeforeClass
    public void setUp() {
        Driver.getInstance("chrome");
        driver = Driver.getDriver();
        driver.get("https://shop.demoqa.com/my-account/");
        login = new Login();
    }

//    @Test(priority = 2)
//    public void testValidLogin(){
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL,"a");
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.DELETE);
//        delay(2);
//        login.tologinpage();
//        login.login("renpu-27", "@Renaldo27");
//        Assert.assertEquals(login.getTxtDashboard(),"Dashboard");
//    }
//
//    @Test (priority = 1)
//    public void testInvalidLogin(){
//        login.tologinpage();
//        login.login("renpu-27", "hehehe");
//        Assert.assertEquals(login.getTxtError(),"Lost your password");
//    }

    @Test
    public void testLogin(){
        driver.findElement(By.id("username")).sendKeys("sanjayatopan23");
        driver.findElement(By.id("password")).sendKeys("JC1@x111xzxx");
        login.tologinpage();
        driver.findElement(By.id("customer_login")).click();
        System.out.println("Berhasil Login");
    }

    @AfterClass
    public void quitBrowser(){
        delay(3);
        Driver.closeObjectInstance();
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
