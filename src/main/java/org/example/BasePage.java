package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static AndroidDriver<AndroidElement> driver;
    public static final Integer TIMEOUT = 15;
    public static AndroidDriver<?> getDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "com.loginmodule.learning");
        desiredCapabilities.setCapability("appActivity", ".activities.LoginActivity");

        try {
            driver = new AndroidDriver<>(new URL(Objects.requireNonNull("http://0.0.0.0:4723/wd/hub")), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch(MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
