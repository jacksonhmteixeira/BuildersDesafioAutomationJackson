package com.builders.desafio.pageObject;

import com.builders.desafio.utils.Utils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CadastroPageObject {

    private AppiumDriver driver;
    private Utils utils;
    private final By identificacaoCelularXpath = By.xpath("//android.widget.EditText[@content-desc=\"insira o numero de celular\"]");
    private final By identificacaoBotaoAvancarXpath = By.xpath("//android.view.ViewGroup[@content-desc=\"Botao Avancar\"]");
    private final By identificacaoCampoNomeXpath = By.xpath("//android.widget.EditText[@content-desc=\"Insira o nome completo\"]");
    private final By identificacaoCampoCompartilharLocalizacaoXpath = By.xpath("//android.view.ViewGroup[@content-desc=\"LOCALIZAÇÃO AUTOMÁTICA\"]");
    private final By identificacaoComandoSimXpath = By.xpath("//android.view.ViewGroup[@content-desc=\"Sim\"]");
    private final By identificacaoComandoNaoXpath = By.xpath("//android.view.ViewGroup[@content-desc=\"Não\"]");
    private final By identificacaoTituloNomeXpath = By.xpath("//android.widget.TextView[@content-desc=\"Nome Completo\"]");
    private final By identificacaoTituloCelularXpath = By.xpath("//android.widget.TextView[@content-desc=\"Celular\"]");
    private final By identificacaoTituloCompartilharLocalizacaoXpath = By.xpath("//android.widget.TextView[@content-desc=\"Localização\"]");

    public CadastroPageObject(AppiumDriver driver){
        this.driver = driver;
        this.utils = new Utils(driver);
    }

    public void preencherCampoCelular(String numeroCelular){
        this.utils.esperarElementoEstarVisivel(this.identificacaoCelularXpath);
        this.utils.preencherCampo(this.identificacaoCelularXpath, numeroCelular);
    }

    public void preencherCampoNome(String nome){
        this.utils.esperarElementoEstarVisivel(this.identificacaoCampoNomeXpath);
        this.utils.preencherCampo(this.identificacaoCampoNomeXpath, nome);
    }

    public void clicarEmCompartilharLocalizacao(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoCampoCompartilharLocalizacaoXpath);
        this.utils.clicarNoElemento(this.identificacaoCampoCompartilharLocalizacaoXpath);
    }

    public void clicarNaOpcaoNaoNoModalCompartilharLocalizacao(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoComandoNaoXpath);
        this.utils.clicarNoElemento(this.identificacaoComandoNaoXpath);
    }

    public void clicarNaOpcaoSimNoModalCompartilharLocalizacao(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoComandoSimXpath);
        this.utils.clicarNoElemento(this.identificacaoComandoSimXpath);
    }

    public void clicarBotaoAvancar(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoBotaoAvancarXpath);
        this.utils.clicarNoElemento(this.identificacaoBotaoAvancarXpath);
    }

    public void verificarSeEstaNaAbaCelular(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoTituloCelularXpath);
    }

    public void verificarSeEstaNaAbaNome(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoTituloNomeXpath);
    }

    public void verificarSeEstaNaAbaCompartilharLocalizacao(){
        this.utils.esperarElementoEstarVisivel(this.identificacaoTituloCompartilharLocalizacaoXpath);
    }
}
