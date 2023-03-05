package com.juaracoding.driverConnection.property;

public class DriverPropertyImpl {
    public static DriverProperty chooseProperty(String property){
        switch (property){
            case "chrome":
                return new Chrome();
            case "firefox":
                return new Firefox();
            default:
                return null;
        }
    }
}
