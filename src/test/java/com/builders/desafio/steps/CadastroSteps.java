package com.builders.desafio.steps;

import com.builders.desafio.config.AppiumDriverConfig;
import com.builders.desafio.pageObject.CadastroPageObject;
import com.builders.desafio.pageObject.PaginaInicialPageObject;
import com.builders.desafio.pageObject.TemperaturaPageObject;
import com.builders.desafio.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastroSteps {

    private final AppiumDriver driver = AppiumDriverConfig.Instance().driver;
    private final Utils utils = new Utils(driver);
    private final PaginaInicialPageObject paginaInicialPageObject = new PaginaInicialPageObject(driver);
    private final CadastroPageObject cadastroPageObject = new CadastroPageObject(driver);
    private final TemperaturaPageObject temperaturaPageObject = new TemperaturaPageObject(driver);

    @Quando("clicar em cadastrar para preencher a aba {string}")
    public void clicar_em_cadastrar_para_preencher_a_aba_telefone(String telefone){
        this.paginaInicialPageObject.clicarBotaoCadastrar();
        this.cadastroPageObject.preencherCampoCelular(telefone);
    }

    @E("clicar no icone prosseguir")
    public void clicar_no_icone_prosseguir(){
        this.cadastroPageObject.clicarBotaoAvancar();
    }

    @Entao("o aplicativo deve seguir para o preenchimento do nome")
    public void o_aplicativo_deve_seguir_para_o_preenchimento_do_nome(){
        this.cadastroPageObject.verificarSeEstaNaAbaNome();

        //VOLTAR NA TELA INICIAL PARA FINALIZAR O CENARIO
        this.utils.voltarNaTelaAnterior(); //clicar em voltar para sair do teclado do android da aba nome
        this.cadastroPageObject.verificarSeEstaNaAbaNome();
        this.utils.voltarNaTelaAnterior(); //clicar para voltar para a aba celular
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarNaTelaAnterior(); //clicar para voltar para a tela inicial
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }

    @Quando("estiver na aba nome e preencher o campo com o {string} e prosseguir")
    public void estiver_na_aba_nome_e_preencher_o_campo_com_o_e_prosseguir(String nome) {
        this.cadastroPageObject.verificarSeEstaNaAbaNome();
        this.cadastroPageObject.preencherCampoNome(nome);
        this.cadastroPageObject.clicarBotaoAvancar();
    }

    @Entao("o eplicativo deve seguir para a tela de compartilhamento da localizacao")
    public void o_eplicativo_deve_seguir_para_a_tela_de_compartilhamento_da_localizacao() {
        this.cadastroPageObject.verificarSeEstaNaAbaCompartilharLocalizacao();

        //VOLTAR NA TELA INICIAL PARA FINALIZAR O CENARIO
        this.utils.voltarNaTelaAnterior(); //voltar para a aba nome
        this.cadastroPageObject.verificarSeEstaNaAbaNome();
        this.utils.voltarNaTelaAnterior(); //voltar para a aba celular
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarNaTelaAnterior(); //voltar para a tela inicial
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }

    @Dado("clicar em cadastrar para preencher a aba {string} e a aba {string}")
    public void clicar_em_cadastrar_para_preencher_a_aba_e_a_aba(String telefone, String nome) {
        this.paginaInicialPageObject.clicarBotaoCadastrar();
        this.cadastroPageObject.preencherCampoCelular(telefone);
        this.cadastroPageObject.clicarBotaoAvancar();
        this.cadastroPageObject.preencherCampoNome(nome);
    }

    @Quando("estiver na aba Localizacao e acionar a opcao Compartilhar Localizacao")
    public void estiver_na_aba_localizacao_e_acionar_a_opcao_compartilhar_localizacao() {
        this.cadastroPageObject.verificarSeEstaNaAbaCompartilharLocalizacao();
        this.cadastroPageObject.clicarEmCompartilharLocalizacao();
    }

    @E("clicar na opcao nao no modal")
    public void clicar_na_opcao_nao_no_modal() {
        this.cadastroPageObject.clicarNaOpcaoNaoNoModalCompartilharLocalizacao();
    }

    @Entao("o aplicativo permanece na tela de compartilhar localizacao")
    public void o_aplicativo_permanece_na_tela_de_compartilhar_localizacao() {
        this.cadastroPageObject.verificarSeEstaNaAbaCompartilharLocalizacao();

        //VOLTAR NA TELA INICIAL PARA FINALIZAR O CENARIO
        this.utils.voltarNaTelaAnterior();//voltar para a aba nome
        this.cadastroPageObject.verificarSeEstaNaAbaNome();
        this.utils.voltarNaTelaAnterior(); //voltar para a aba celular
        this.cadastroPageObject.verificarSeEstaNaAbaCelular();
        this.utils.voltarNaTelaAnterior(); //voltar para a tela inicial
        this.paginaInicialPageObject.verificarSeEstaNaTelaInicial();
    }

    @Quando("clicar na opcao sim no modal")
    public void clicar_na_opcao_sim_no_modal() {
        this.cadastroPageObject.clicarNaOpcaoSimNoModalCompartilharLocalizacao();
    }

    @Entao("o aplicativo direciona para a tela de temperatura apos o preenchimento")
    public void o_aplicativo_direciona_para_a_tela_de_temperatura_apos_o_preenchimento() {
        this.temperaturaPageObject.verificarSeEstaNaTelaDeTemperatura();

        //VOLTAR NA TELA INICIAL PARA FINALIZAR O CENARIO
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
