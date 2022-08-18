package com.builders.desafio.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
public class AppiumDriverConfig {

    public final AppiumDriver driver;
    private static AppiumDriverConfig _instance;


    public static AppiumDriverConfig Instance(){
        if(AppiumDriverConfig._instance == null){
            AppiumDriverConfig._instance = new AppiumDriverConfig();
        }
        return AppiumDriverConfig._instance;
    }

    private AppiumDriverConfig(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("deviceName", "teste1-jackson");
        capabilities.setCapability("app", "\\Users\\jacksonhmt\\Documents\\REPOSITORIOS\\BuildersDesafioAutomationJackson\\apk\\challenge-qa-0.0.1.apk");

        URL urlConexao = null;
        try {
            urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new AppiumDriver(urlConexao, capabilities);
    }
}
