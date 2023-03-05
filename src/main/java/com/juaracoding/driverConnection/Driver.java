package com.juaracoding.driverConnection;

import com.juaracoding.driverConnection.property.DriverProperty;
import com.juaracoding.driverConnection.property.DriverPropertyImpl;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static Driver instance = null;
    private static WebDriver driver;

    private Driver (String driver){
        instantiate(driver);
    }

    public WebDriver instantiate(String property){
        DriverProperty driverProperty = DriverPropertyImpl.chooseProperty(property);
        driver = driverProperty.setProperty();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
    public static Driver getInstance(String driver) {
        if (instance == null) {
            instance = new Driver(driver);
        }
        return instance;
    }

    public static WebDriver getDriver(){
        return driver;
    }
    public static void closeObjectInstance(){
        instance = null;
        driver.quit();
    }

}
