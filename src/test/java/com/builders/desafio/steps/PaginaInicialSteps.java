package com.builders.desafio.steps;

import com.builders.desafio.pageObject.PaginaInicialPageObject;
import io.appium.java_client.AppiumDriver;
import com.builders.desafio.config.AppiumDriverConfig;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
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

    @Entao("o aplicativo apresenta a Tela Inicial com as opcoes CADASTRAR e ENTRAR")
    public void o_aplicativo_apresenta_a_tela_inicial_com_as_opções_cadastrar_e_entrar() {
        this.paginaInicialPageObject.clicarBotaoCadastrar();
        this.driver.navigate().back(); //clicar a primeira vez para sair do teclado
        this.driver.navigate().back(); //clicar a segunda vez para voltar a tela
        this.paginaInicialPageObject.clicarBotaoEntrar();
        this.driver.navigate().back();
        this.driver.navigate().back(); //clicar duas vezes para sair da tela
    }
    @Dado("que estou na tela inicial")
    public void que_estou_na_tela_inicial() {

    }

    @Quando("clicar na opcao CADASTRAR")
    public void clicar_na_opcao_cadastrar() {

    }

    @Entao("o usuário direcionado para a tela de cadastro")
    public void o_usuário_direcionado_para_a_tela_de_cadastro() {

    }

    @Quando("clicar na opcao ENTRAR")
    public void clicar_na_opcao_entrar() {

    }

    @Entao("o usuario direcionado para a tela de temperatura")
    public void o_usuario_direcionado_para_a_tela_de_temperatura() {

    }
}
