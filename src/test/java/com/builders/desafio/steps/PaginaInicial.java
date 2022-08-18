package com.builders.desafio.steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.cucumber.java.pt.Dado;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class PaginaInicial {

    @Dado("que estou na tela inicial")
    public void dado_que_estou_na_tela_inicial() throws MalformedURLException{
        File apk = new File("/Users/jacksonhmt/Documents/REPOSITORIOS/BuildersDesafioAutomationJackson/apk/challenge-qa-0.0.1.apk");

        DesiredCapabilities configuracoes = new DesiredCapabilities();
        configuracoes.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        URL urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AppiumDriver(urlConexao,configuracoes);
    }
}
