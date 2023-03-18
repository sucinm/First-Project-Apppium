package org.example;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {

    public static void main(String[] args) {
        WebDriverWait wait = new WebDriverWait(getDriver(), BasePage.TIMEOUT);

        MobileElement linkRegister = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.loginmodule.learning:id/textViewLinkRegister")));
        linkRegister.click();

        MobileElement inputName = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.loginmodule.learning:id/textInputEditTextName")));
        inputName.sendKeys("suci");

        MobileElement inputEmail = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.loginmodule.learning:id/textInputEditTextEmail")));
        inputEmail.sendKeys("suci@gmail.com");

        MobileElement inputPassword = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.loginmodule.learning:id/textInputEditTextPassword")));
        inputPassword.sendKeys("Suci!234");

        MobileElement inputConfirmPassword = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword")));
        inputConfirmPassword.sendKeys("Suci!234");

        MobileElement buttonRegister = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.loginmodule.learning:id/appCompatButtonRegister")));
        buttonRegister.click();

        MobileElement successAlert = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.loginmodule.learning:id/snackbar_text")));
    }
}