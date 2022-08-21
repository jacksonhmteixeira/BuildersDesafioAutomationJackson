# language: pt

Funcionalidade: [TELA INICIAL]
  @001 @PaginaInicial
  Cenario: [TELA INICIAL] [VERIFICANDO TELA INICIAL]
    Dado que o usuario esta na tela de aplicativos do Android no celular
    Quando clicar no aplicativo challenge-qa
    Entao o aplicativo apresenta a Tela Inicial com as opcoes CADASTRAR e ENTRAR

  @002 @PaginaInicial
  Cenario: [TELA INICIAL] [DIRECIONAMENTO DO BOTAO CADASTRAR]
    Dado que o usuario esta na tela inicial
    Quando clicar na opcao CADASTRAR
    Entao o aplicativo direciona para a tela de cadastro

  @003 @PaginaInicial
  Cenario: [TELA INICIAL] [DIRECIONAMENTO DO BOTAO ENTRAR]
    Dado que o usuario esta na tela inicial
    Quando clicar na opcao ENTRAR
    Entao o aplicativo direciona para a tela de temperatura
