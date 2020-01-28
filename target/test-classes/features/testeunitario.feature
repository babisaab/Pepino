# language: pt

@unitarios
Funcionalidade: Alugar um filme
 Como um usu�rio
 Eu quero cadastrar aluguel de filmes
 Para controlar pre�os e datas de entrega
 
 Cen�rio: Deve alugar um filme com sucesso
 
 Dado um filme
 | estoque |    2  |
 | pre�o   |    3  |
 | tipo    | comum |
 Quando alugar 
 Ent�o o pre�o do aluguel ser� R$ 3
 E a data de entrega ser� em 1 dia
 E o estoque do filme ser� 1 unidade
 
 Cen�rio: N�o deve alugar filme sem estoque
 
 Dado um filme com estoque de 0 unidades
 Quando alugar
 Ent�o n�o ser� poss�vel por falta de estoque
 
 Esquema do Cen�rio: deve dar condi��es conforme tipo de aluguel
 Dado um filme com estoque de 2 unidades
 E que o pre�o do aluguel seja R$ <preco>
 E que o tipo de aluguel seja <tipo>
 Quando alugar
 Ent�o o pre�o do aluguel ser� R$ <valor>
 E a data de entrega ser� em <qtdDias> dias
 E a pontua��o recebida ser� de <pontuacao> pontos
 
 
 Exemplos:
 | preco | tipo      | valor | qtdDias  | pontuacao |
 |   4   | extendido |   8   |     3    |     2     |
 |   4   |   comum   |   4   |     1    |     1     |
 |   5   | semanal   |  15   |     7    |     3     |

 