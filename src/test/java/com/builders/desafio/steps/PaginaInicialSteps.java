package com.builders.desafio.steps;

import com.builders.desafio.pageObject.PaginaInicialPageObject;
import io.appium.java_client.AppiumDriver;
import com.builders.desafio.config.AppiumDriverConfig;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


public class PaginaInicialSteps {

    private AppiumDriver driver;
    private PaginaInicialPageObject paginaInicialPageObject;

    @Dado("que estou na tela de aplicativos do Android no celular")
    public void que_estou_na_tela_de_aplicativos_do_android_no_celular() {
        Assert.assertTrue(true);
    }

    @Quando("clico no aplicativo challenge-qa")
    public void clico_no_aplicativo_challenge_qa() {
        this.driver = AppiumDriverConfig.Instance().driver;
        this.paginaInicialPageObject = new PaginaInicialPageObject(driver);
        Assert.assertTrue(true);
    }

    @Então("o aplicativo apresenta a Tela Inicial com as opções “CADASTRAR” e “ENTRAR”")
    public void o_aplicativo_apresenta_a_tela_inicial_com_as_opções_cadastrar_e_entrar() {
        this.paginaInicialPageObject.clicarBotaoCadastrar();
        this.driver.navigate().back(); //clicar a primeira vez para sair do teclado
        this.driver.navigate().back(); //clicar a segunda vez para voltar a tela
        this.paginaInicialPageObject.clicarBotaoEntrar();
        this.driver.navigate().back();
        this.driver.navigate().back(); //clicar duas vezes para sair da tela
    }
}
