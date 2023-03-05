package testFucntion;

import com.juaracoding.driverConnection.Driver;
import com.juaracoding.driverConnection.page.Login;
import com.juaracoding.driverConnection.page.Shopping;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestShopping {
    public static WebDriver driver;
    public Login login;
    public Shopping shopping;

    @BeforeClass
    public void setUp() {
        Driver.getInstance("chrome");
        driver = Driver.getDriver();
        driver.get("https://shop.demoqa.com/");
        login = new Login();
        login.tologinpage();
        shopping = new Shopping();
        login.login("sanjayatopan23","JC1@x111xzxx");
    }

    @Test
    public void testShop(){
        shopping.toHome();
        shopping.toItem();
        shopping.shopping();
        Assert.assertEquals(shopping.getTxtAdded(), "View cart");
//        WebElement selectColor = driver.findElement(By.id("pa_color"));
//        Select color = new Select(selectColor);
//
//        color.selectByVisibleText("Pink");
//        System.out.println("Test Select Pink Success");
//
//        WebElement selectSize = driver.findElement(By.id("pa_size"));
//        Select size = new Select(selectSize);
//
//        size.selectByVisibleText("36");
//        System.out.println("Test Select 36 Success");
//
//        System.out.println("Success Add To Chart");

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
