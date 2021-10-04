#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:03/10/2021
#version: 1.0

Funcionalidade: redirecionamento dos links do Header
  Como um aluno do site eadplataforma
  Quero clicar nos links do hearder
  Para que seja redirecionado para página correta
  
Contexto:
	Dado que estou na pagina home do site
	
Esquema do Cenário: redirecionamento dos links do Header
  E clico Login
  E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E seleciono entrar
  Quando clico no "<menu>"
  Entao valido mensagem final com sucesso "<msgFinal>"
 

  Exemplos:
 |email                  |senha    |menu  |msgFinal|
 |paloma.gpedro@gmail.com|Do0z322@ç|Cursos|Home    |
 