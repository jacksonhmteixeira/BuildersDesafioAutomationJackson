# language: pt

Funcionalidade: [CADASTRO]

  @Cadastro
  Cenario: [CADASTRO] [CELULAR] [PREENCHENDO O NUMERO DO CELULAR]
    Dado que estou na tela de cadastro na aba celular
    Quando preencher o numero
    E clicar em prosseguir
    Entao o aplicativo deve seguir para a tela seguinte

  @Cadastro
  Cenario: [CADASTRO] [NOME] [PREENCHENDO O NOME]
    Dado que estou na tela de cadastro na aba nome
    Quando preencher o nome
    E clicar em prosseguir
    Entao o eplicativo deve seguir para a tela de compartilhamento da localizacao

  @Cadastro
  Cenario: [CADASTRO] [COMPARTILHAR LOCALIZACAO] [CLICAR EM NAO]
    Dado que estou na tela de cadastro na aba compartilhar localizacao
    Quando eu clicar em COMPARTILHAR LOCALIZACAO
    E logo apos clicar na opcao NAO
    Entao o aplicativo permanece na tela de compartilhar localizacao

  @Cadastro
  Cenario: [CADASTRO] [COMPARTILHAR LOCALIZACAO] [CLICAR EM SIM]
    Dado que estou na tela de cadastro na aba compartilhar localizacao
    Quando eu clicar em COMPARTILHAR LOCALIZACAO
    E logo apos clicar na opcao SIM
    Entao o aplicativo deve direcionar o usuario para a tela de temperatura
