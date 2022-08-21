# language: pt

Funcionalidade: [CADASTRO]

  @004 @Cadastro
  Esquema do Cenario: : [CADASTRO] [CELULAR] [VALORES VALIDOS]
    Dado que o usuario esta na tela inicial
    Quando clicar em cadastrar para preencher a aba '<telefone>'
    E clicar no icone prosseguir
    Entao o aplicativo deve seguir para o preenchimento do nome

    Exemplos:
      |telefone           |
      |62987878787        |

  @005 @Cadastro
  Esquema do Cenario: : [CADASTRO] [NOME] [VALORES VALIDOS]
    Dado que o usuario esta na tela inicial
    E clicar em cadastrar para preencher a aba '<telefone>'
    E clicar no icone prosseguir
    Quando estiver na aba nome e preencher o campo com o '<nome>' e prosseguir
    Entao o eplicativo deve seguir para a tela de compartilhamento da localizacao

    Exemplos:
      |telefone    | nome                |
      |62987878787 | Jackson Teixeira    |

  @006 @Cadastro
  Esquema do Cenario: : [CADASTRO] [COMPARTILHAR LOCALIZACAO] [CLICAR EM NAO]
    Dado que o usuario esta na tela inicial
    E clicar em cadastrar para preencher a aba '<telefone>' e a aba '<nome>'
    E clicar no icone prosseguir
    Quando estiver na aba Localizacao e acionar a opcao Compartilhar Localizacao
    E clicar na opcao nao no modal
    Entao o aplicativo permanece na tela de compartilhar localizacao

  Exemplos:
    |telefone      | nome                |
    |62987878787   | Jackson Teixeira    |

  @007 @Cadastro
  Esquema do Cenario: : [CADASTRO] [COMPARTILHAR LOCALIZACAO] [CLICAR EM SIM]
    Dado que o usuario esta na tela inicial
    E clicar em cadastrar para preencher a aba '<telefone>' e a aba '<nome>'
    E clicar no icone prosseguir
    Quando estiver na aba Localizacao e acionar a opcao Compartilhar Localizacao
    E clicar na opcao sim no modal
    Entao o aplicativo direciona para a tela de temperatura apos o preenchimento

    Exemplos:
      | telefone    | nome                |
      | 62987878787 | Jackson Teixeira    |