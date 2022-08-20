package com.builders.desafio.steps;

import com.builders.desafio.pageObject.CadastroPageObject;
import com.builders.desafio.pageObject.PaginaInicialPageObject;
import com.builders.desafio.pageObject.TemperaturaPageObject;
import com.builders.desafio.utils.Utils;
import io.appium.java_client.AppiumDriver;
import com.builders.desafio.config.AppiumDriverConfig;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class PaginaInicialSteps {

    private AppiumDriver driver;
    private Utils utils;
    private PaginaInicialPageObject paginaInicialPageObject;
    private CadastroPageObject cadastroPageObject;
    private TemperaturaPageObject temperaturaPageObject;

    @Dado("que estou na tela de aplicativos do Android no celular")
    public void que_estou_na_tela_de_aplicativos_do_android_no_celular() {
        this.driver = AppiumDriverConfig.Instance().driver;
        this.paginaInicialPageObject = new PaginaInicialPageObject(driver);
        this.cadastroPageObject = new CadastroPageObject(driver);
        this.temperaturaPageObject = new TemperaturaPageObject(driver);
        this.utils = new Utils(driver);
        Assert.assertTrue(true);
    }

    @Quando("clico no aplicativo challenge-qa")
    public void clico_no_aplicativo_challenge_qa() {
        Assert.assertTrue(true);
    }

    @Entao("o aplicativo apresenta a Tela Inicial com as opcoes CADASTRAR e ENTRAR")
    public void o_aplicativo_apresenta_a_tela_inicial_com_as_opções_cadastrar_e_entrar() {
        this.paginaInicialPageObject.clicarBotaoCadastrar();
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarTela(); //Para sair do teclado do android
        this.utils.voltarTela(); //Para voltar a tela inicial
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
        this.paginaInicialPageObject.clicarBotaoEntrar();
        this.temperaturaPageObject.verificarSeEstaNaTelaDeTemperatura(); //comportamento atual do aplicativo
        this.utils.voltarTela();
    }

    @Dado("que estou na tela inicial")
    public void que_estou_na_tela_inicial() {
        this.driver = AppiumDriverConfig.Instance().driver;
        this.paginaInicialPageObject = new PaginaInicialPageObject(driver);
        this.cadastroPageObject = new CadastroPageObject(driver);
        this.utils = new Utils(driver);
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }

    @Quando("clicar na opcao CADASTRAR")
    public void clicar_na_opcao_cadastrar() {
        this.paginaInicialPageObject.clicarBotaoCadastrar();
    }

    @Entao("o usuário direcionado para a tela de cadastro")
    public void o_usuário_direcionado_para_a_tela_de_cadastro() {
        this.cadastroPageObject = new CadastroPageObject(driver);
        this.utils = new Utils(driver);
        this.temperaturaPageObject = new TemperaturaPageObject(driver);
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarTela(); //para sair do teclado do android
        this.utils.voltarTela(); //para voltar a tela inicial
    }

    @Quando("clicar na opcao ENTRAR")
    public void clicar_na_opcao_entrar() {
        this.paginaInicialPageObject.clicarBotaoEntrar();
    }

    @Entao("o usuario direcionado para a tela de temperatura")
    public void o_usuario_direcionado_para_a_tela_de_temperatura() {
        this.temperaturaPageObject = new TemperaturaPageObject(driver);
        this.temperaturaPageObject.verificarSeEstaNaTelaDeTemperatura();
        this.utils.voltarTela();
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }
}
