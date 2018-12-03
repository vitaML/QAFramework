package com.epam.base;

import com.epam.enums.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;

public class BrowserFactory {

    private static final Logger LOG = new Log(BrowserFactory.class).getLogger();

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
                ClassLoader classLoader = getClass().getClassLoader();
                System.setProperty("webdriver.gecko.driver",
                        classLoader.getResource("drivers/geckodriver.exe").getPath());
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                webDriver = new FirefoxDriver(capabilities);
                break;
            }
            case "IE": {
                webDriver = new InternetExplorerDriver();
                break;
            }
            default: {
                LOG.error("WebDriver was not initialized.");
                System.exit(1);
            }
        }
        return webDriver;
    }
}

