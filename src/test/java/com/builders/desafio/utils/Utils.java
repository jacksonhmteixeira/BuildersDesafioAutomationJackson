package com.builders.desafio.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
    private AppiumDriver driver;
    public Utils(AppiumDriver driver){
        this.driver = driver;
    }

    public void esperarElementoEstarVisivel(By identificacao){
        WebDriverWait wait = new WebDriverWait(this.driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(identificacao));
    }

    public void clicar(String identificacao, String tipoIdentificacao){
        switch (tipoIdentificacao){
            case "ByAccessibilityId":
                MobileElement elementoUm = (MobileElement) driver.findElementByAccessibilityId(identificacao);
                elementoUm.click();
                break;
            case "ByXpath":
                MobileElement elementoDois = (MobileElement) driver.findElementByXPath(identificacao);
                elementoDois.click();
                break;
            case "ByID":
                MobileElement elementoTres = (MobileElement) driver.findElementById(identificacao);
                elementoTres.click();
                break;
        }

        MobileElement el = (MobileElement) driver.findElementByAccessibilityId(identificacao);
        el.click();
    }

    public void preencherCampo(){

    }

    public void voltarTela(){
        driver.navigate().back();
    }
}
