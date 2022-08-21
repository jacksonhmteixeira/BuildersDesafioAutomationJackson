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

    private final AppiumDriver driver = AppiumDriverConfig.Instance().driver;
    private final Utils utils = new Utils(driver);
    private final PaginaInicialPageObject paginaInicialPageObject = new PaginaInicialPageObject(driver);
    private final CadastroPageObject cadastroPageObject = new CadastroPageObject(driver);
    private final TemperaturaPageObject temperaturaPageObject = new TemperaturaPageObject(driver);

    @Dado("que o usuario esta na tela de aplicativos do Android no celular")
    public void que_estou_na_tela_de_aplicativos_do_android_no_celular() {
        Assert.assertTrue(true);
    }

    @Quando("clicar no aplicativo challenge-qa")
    public void clico_no_aplicativo_challenge_qa() {
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }

    @Entao("o aplicativo apresenta a Tela Inicial com as opcoes CADASTRAR e ENTRAR")
    public void o_aplicativo_apresenta_a_tela_inicial_com_as_opcoes_cadastrar_e_entrar() {
        this.paginaInicialPageObject.clicarBotaoCadastrar();
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarNaTelaAnterior(); //Para sair do teclado do android
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarNaTelaAnterior(); //Para voltar a tela inicial
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
        this.paginaInicialPageObject.clicarBotaoEntrar();

        // Atualmente no sistema, quando o usuario clicar em ENTRAR,
        // o sistema apresenta a tela de temperatura
        this.temperaturaPageObject.verificarSeEstaNaTelaDeTemperatura();
        this.utils.voltarNaTelaAnterior();
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }

    @Dado("que o usuario esta na tela inicial")
    public void que_estou_na_tela_inicial() {
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }

    @Quando("clicar na opcao CADASTRAR")
    public void clicar_na_opcao_cadastrar() {
        this.paginaInicialPageObject.clicarBotaoCadastrar();
    }

    @Entao("o aplicativo direciona para a tela de cadastro")
    public void o_aplicativo_direciona_para_a_tela_de_cadastro() {
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarNaTelaAnterior(); //para sair do teclado do android
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarNaTelaAnterior(); //para voltar a tela inicial
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }

    @Quando("clicar na opcao ENTRAR")
    public void clicar_na_opcao_entrar() {
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
        this.paginaInicialPageObject.clicarBotaoEntrar();
    }

    @Entao("o aplicativo direciona para a tela de temperatura")
    public void o_aplicativo_direciona_para_a_tela_de_temperatura() {
        this.temperaturaPageObject.verificarSeEstaNaTelaDeTemperatura();
        this.utils.voltarNaTelaAnterior(); //voltar para a tela inicial
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }
}
