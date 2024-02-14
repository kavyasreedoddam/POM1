package utilities;


import org.openqa.selenium.WebDriver;

public class BaseClass {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}
