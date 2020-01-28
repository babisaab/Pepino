# language: pt

@funcionais
Funcionalidade: Cadastro de contas
Como um usu�rio 
Eu gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Contexto: 
Dado que desejo adicionar uma conta

Esquema do Cen�rio: Deve validar regras cadastro de contas
	Quando adiciono a conta "<conta>"
	Ent�o recebo a mensagem "<mensagem>"
	
Exemplos:	
	|     conta        |         mensagem                  |
	| Conta de Teste   | Conta adicionada com sucesso!     |
	|                  | Informe o nome da conta           |
	| Conta mesmo nome | J� existe uma conta com esse nome!|


