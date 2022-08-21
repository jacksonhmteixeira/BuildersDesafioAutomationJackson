package com.builders.desafio.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement ;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    private final AppiumDriver driver;

    public Utils(AppiumDriver driver){
        this.driver = driver;
    }

    public void esperarElementoEstarVisivel(By identificacao){
        WebDriverWait esperarElemento = new WebDriverWait(this.driver, 30);
        esperarElemento.until(ExpectedConditions.visibilityOfElementLocated(identificacao));
    }

    public void clicarNoElemento(By identificacao){
        MobileElement elementoEncontrado = (MobileElement) driver.findElement(identificacao);
        elementoEncontrado.click();
    }

    public void preencherCampo(By identificacao, String texto){
        MobileElement elementoUm = (MobileElement) driver.findElement(identificacao);
        elementoUm.setValue(texto);
    }

    public void voltarNaTelaAnterior(){
        driver.navigate().back();
    }
}
