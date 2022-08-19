# language: pt

Funcionalidade: [TELA INICIAL]

  @TelaInicial
  Cenario: [TELA INICIAL] [VERIFICANDO TELA INICIAL]
    Dado que estou na tela de aplicativos do Android no celular
    Quando clico no aplicativo challenge-qa
    Entao o aplicativo apresenta a Tela Inicial com as opcoes CADASTRAR e ENTRAR

  @TelaInicial
  Cenario: [TELA INICIAL] [DIRECIONAMENTO DO BOTAO CADASTRAR]
    Dado que estou na tela inicial
    Quando clicar na opcao CADASTRAR
    Entao o usuário direcionado para a tela de cadastro

  @TelaInicial
  Cenario: [TELA INICIAL] [DIRECIONAMENTO DO BOTAO ENTRAR]
    Dado que estou na tela inicial
    Quando clicar na opcao ENTRAR
    Entao o usuario direcionado para a tela de temperatura
