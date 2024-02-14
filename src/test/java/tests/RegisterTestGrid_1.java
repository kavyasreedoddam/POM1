package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


public class RegisterTestGrid_1 {
	
	private WebDriver driver;

    @SuppressWarnings("deprecation")
	@Test(priority=1)
    public void setUp() throws MalformedURLException {
        String nodeURL = "  http://192.168.1.3:4444";

        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL(nodeURL), options);
    }

    @Test(priority=2)
    public void testRegistration() {
    	//System.setProperty("webdriver.chrome.driver", "C:\\ZSelenium Jars and drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement genderFemaleRadio = driver.findElement(By.cssSelector("input[type='radio'][id='gender-female']"));
        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
        WebElement lastNameInput = driver.findElement(By.id("LastName"));
        WebElement emailInput = driver.findElement(By.id("Email"));
        WebElement passwordInput = driver.findElement(By.id("Password"));
        WebElement confirmPasswordInput = driver.findElement(By.id("ConfirmPassword"));
        WebElement registerButton = driver.findElement(By.id("register-button"));
        
        genderFemaleRadio.click();
        firstNameInput.sendKeys("kavya");
        lastNameInput.sendKeys("sree");
        emailInput.sendKeys("kavyasree@gmail.com");
        passwordInput.sendKeys("Kavyadk");
        confirmPasswordInput.sendKeys("Kavyadk");
        registerButton.click();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            //driver.quit();
        }
    }
}