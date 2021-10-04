#language:pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:02/10/2021
#version: 1.0


Funcionalidade: Login
	Como um aluno do site eadplataforma
	Quero fazer login
	Para ter acesso aos cursos
	
Contexto:
	Dado que estou na pagina home do site
	E clico Login
	

Esquema do Cenario: Login com sucesso
	E preencho e-mail "<email>"
  E preencho senha "<senha>"
	Quando seleciono entrar
	Entao valido mensagem final com sucesso "<msgFinal>"

	Exemplos:
	|email                   |senha    |msgFinal|
	|paloma.gpedro@gmail.com |Do0z322@ç|Home    |
	
	Esquema do Cenario: Login com insucesso
	E preencho e-mail "<email>"
  E preencho senha "<senha>"
	Quando seleciono entrar
	Entao valido mensagem final com sucesso "<msgFinal>"

	Exemplos:
	|email                   |senha |msgFinal                   |
	|paloma.gpedro@gmail.com |pwd123|Dados de acesso incorretos!|