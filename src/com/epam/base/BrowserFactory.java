package com.epam.base;

import com.epam.enums.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
    public BrowserFactory() {
    }

    private WebDriver webDriver;

    public WebDriver getDriver() {
        switch (ReadProperties.getProperty(Property.BROWSER)) {
            case "Chrome": {
                webDriver = new ChromeDriver();
                break;
            }
            case "FF": {
                System.setProperty("webdriver.gecko.driver",
                        "C:\\Users\\Stepan\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                webDriver = new FirefoxDriver(capabilities);
                break;
            }
            case "IE": {
                webDriver = new InternetExplorerDriver();
                break;
            }
        }
        return webDriver;
    }
}

