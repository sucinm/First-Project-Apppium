package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
    public static void main(String[] args) {
        WebDriverWait wait = new WebDriverWait(getDriver(), BasePage.TIMEOUT);
        MobileElement inputEmail = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.loginmodule.learning:id/textInputEditTextEmail")));
        inputEmail.sendKeys("suci@gmail.com");

        MobileElement inputPassword = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.loginmodule.learning:id/textInputEditTextPassword")));
        inputPassword.sendKeys("Suci!234");

        MobileElement buttonLogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.loginmodule.learning:id/appCompatButtonLogin")));
        buttonLogin.click();
    }
}
