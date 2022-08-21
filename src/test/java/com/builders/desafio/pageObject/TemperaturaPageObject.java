package com.builders.desafio.pageObject;

import com.builders.desafio.utils.Utils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class TemperaturaPageObject {

    private final AppiumDriver driver;
    private final Utils utils;
    private final By identificacaTelaTemperatura = By.xpath("//android.widget.TextView[@content-desc=\"Temperatura atual 28˚\"]");

    public TemperaturaPageObject(AppiumDriver driver){
        this.driver = driver;
        this.utils = new Utils(driver);
    }

    public void verificarSeEstaNaTelaDeTemperatura(){
        this.utils.esperarElementoEstarVisivel(this.identificacaTelaTemperatura);
    }
}
