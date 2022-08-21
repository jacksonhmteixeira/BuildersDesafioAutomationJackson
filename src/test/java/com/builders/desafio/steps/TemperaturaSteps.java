package com.builders.desafio.steps;

import com.builders.desafio.config.AppiumDriverConfig;
import com.builders.desafio.pageObject.CadastroPageObject;
import com.builders.desafio.pageObject.PaginaInicialPageObject;
import com.builders.desafio.pageObject.TemperaturaPageObject;
import com.builders.desafio.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TemperaturaSteps {

    private final AppiumDriver driver = AppiumDriverConfig.Instance().driver;
    private final Utils utils = new Utils(driver);
    private final PaginaInicialPageObject paginaInicialPageObject = new PaginaInicialPageObject(driver);
    private final CadastroPageObject cadastroPageObject = new CadastroPageObject(driver);
    private final TemperaturaPageObject temperaturaPageObject = new TemperaturaPageObject(driver);

    @Quando("preencher toda a tela de cadastro")
    public void preencher_toda_a_tela_de_cadastro() {
        this.paginaInicialPageObject.clicarBotaoCadastrar();
        this.cadastroPageObject.preencherCampoCelular("99 9 99999999");
        this.cadastroPageObject.clicarBotaoAvancar();
        this.cadastroPageObject.preencherCampoNome("Primeiro Nome");
        this.cadastroPageObject.clicarBotaoAvancar();
        this.cadastroPageObject.clicarEmCompartilharLocalizacao();
        this.cadastroPageObject.clicarNaOpcaoSimNoModalCompartilharLocalizacao();

    }

    @Entao("o aplicativo deve apresentar a tela de temperatura")
    public void o_aplicativo_deve_apresentar_a_tela_de_temperatura() {
        this.temperaturaPageObject.verificarSeEstaNaTelaDeTemperatura();
        this.utils.voltarNaTelaAnterior(); //voltar para a tela de localizacao
        this.cadastroPageObject.verificarSeEstaNaAbaCompartilharLocalizacao();
        this.utils.voltarNaTelaAnterior(); //voltar para a aba nome
        this.cadastroPageObject.verificarSeEstaNaAbaNome();
        this.utils.voltarNaTelaAnterior(); //voltar para a aba celular
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarNaTelaAnterior(); //voltar para a tela inicial
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }
}
