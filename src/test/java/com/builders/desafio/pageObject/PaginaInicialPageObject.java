package com.builders.desafio.pageObject;


import com.builders.desafio.utils.Utils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PaginaInicialPageObject {

    private AppiumDriver driver;
    private Utils utils;
    private final By identificacaoCadastrarXpath = By.xpath("//android.view.ViewGroup[@content-desc=\"Cadastrar\"]");
    private final By identificacaoEntrarXpath = By.xpath("//android.view.ViewGroup[@content-desc=\"Entrar\"]");
    private final String identificacaoCadastrarAccessibilityId = "Cadastrar";
    private final String identificacaoEntrarAccessibilityId = "Entrar";
    public PaginaInicialPageObject(AppiumDriver driver){
        this.driver = driver;
        this.utils = new Utils(driver);
    }

    public void clicarBotaoCadastrar(){
        this.utils.esperarElementoVisivel(this.identificacaoCadastrarXpath);
        this.utils.clicar(this.identificacaoCadastrarAccessibilityId, "ByAccessibilityId");
    }

    public void clicarBotaoEntrar(){
        this.utils.esperarElementoVisivel(this.identificacaoEntrarXpath);
        this.utils.clicar(this.identificacaoEntrarAccessibilityId, "ByAccessibilityId");
    }
}
