package com.builders.desafio.pageObject;

import com.builders.desafio.utils.Utils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PaginaInicialPageObject {

    private AppiumDriver driver;
    private Utils utils;
    private final By identificacaoCadastrarXpath = By.xpath("//android.view.ViewGroup[@content-desc=\"Cadastrar\"]");
    private final By identificacaoEntrarXpath = By.xpath("//android.view.ViewGroup[@content-desc=\"Entrar\"]");

    public PaginaInicialPageObject(AppiumDriver driver){
        this.driver = driver;
        this.utils = new Utils(driver);
    }

    public void clicarBotaoCadastrar(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoCadastrarXpath);
        this.utils.clicarNoElemento(this.identificacaoCadastrarXpath);
    }

    public void clicarBotaoEntrar(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoEntrarXpath);
        this.utils.clicarNoElemento(this.identificacaoEntrarXpath);
    }

    public void verificarSeEstaNaTelaInicial(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoCadastrarXpath);
        this.utils.esperarElementoEstarVisivel(this.identificacaoEntrarXpath);
    }
}
