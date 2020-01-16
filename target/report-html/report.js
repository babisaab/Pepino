$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testefuncional.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de contas",
  "description": "Como um usuário \nEu gostaria de cadastrar contas\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "cadastro-de-contas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@funcionais"
    }
  ]
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Deve validar regras cadastro de contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 13,
  "name": "adiciono a conta \"\u003cconta\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "recebo a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas;",
  "rows": [
    {
      "cells": [
        "conta",
        "mensagem"
      ],
      "line": 17,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas;;1"
    },
    {
      "cells": [
        "Conta de Teste",
        "Conta adicionada com sucesso!"
      ],
      "line": 18,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas;;2"
    },
    {
      "cells": [
        "",
        "Informe o nome da conta"
      ],
      "line": 19,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas;;3"
    },
    {
      "cells": [
        "Conta mesmo nome",
        "Já existe uma conta com esse nome!"
      ],
      "line": 20,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas;;4"
    }
  ],
  "keyword": "Exemplos"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "InserirContasSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "duration": 7698098700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Deve validar regras cadastro de contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 3,
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "adiciono a conta \"Conta de Teste\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "recebo a mensagem \"Conta adicionada com sucesso!\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Conta de Teste",
      "offset": 18
    }
  ],
  "location": "InserirContasSteps.adicionoAConta(String)"
});
formatter.result({
  "duration": 705215100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta adicionada com sucesso!",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 30249400,
  "status": "passed"
});
formatter.after({
  "duration": 300463600,
  "status": "passed"
});
formatter.after({
  "duration": 663015800,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "InserirContasSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "duration": 7284429400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Deve validar regras cadastro de contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 3,
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "adiciono a conta \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "recebo a mensagem \"Informe o nome da conta\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 18
    }
  ],
  "location": "InserirContasSteps.adicionoAConta(String)"
});
formatter.result({
  "duration": 353563000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Informe o nome da conta",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 37377400,
  "status": "passed"
});
formatter.after({
  "duration": 326519600,
  "status": "passed"
});
formatter.after({
  "duration": 614764000,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "InserirContasSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "duration": 7282674000,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Deve validar regras cadastro de contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-de-contas;;4",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 3,
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "adiciono a conta \"Conta mesmo nome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "recebo a mensagem \"Já existe uma conta com esse nome!\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Conta mesmo nome",
      "offset": 18
    }
  ],
  "location": "InserirContasSteps.adicionoAConta(String)"
});
formatter.result({
  "duration": 429470500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Já existe uma conta com esse nome!",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 33442500,
  "status": "passed"
});
formatter.after({
  "duration": 286995800,
  "status": "passed"
});
formatter.after({
  "duration": 618966600,
  "status": "passed"
});
});