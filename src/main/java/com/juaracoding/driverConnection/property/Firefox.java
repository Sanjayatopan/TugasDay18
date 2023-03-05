package com.juaracoding.driverConnection.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverProperty{
    @Override
    public WebDriver setProperty() {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
