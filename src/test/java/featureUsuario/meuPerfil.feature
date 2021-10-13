#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:11/10/2021
#version: 1.0

Funcionalidade: redirecionamento dos links Meu Perfil
  Como um aluno do site eadplataforma
  Quero clicar nos links do meu perfol
  Para que seja redirecionado para página correta
  
Contexto:
	Dado que estou na pagina home do site
	E clico Login
	E preencho e-mail "paloma.gpedro@hotmail.com"
  E preencho senha "pwd2212"
  E seleciono entrar
  E clico no meu Perfil
 
Esquema do Cenário: redirecionamento do link da logo
  E seleciono no meus cursos
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Contatos|
 
Esquema do Cenário: redirecionamento do link Curso
  E clico no Curso
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Home    |
 

 Esquema do Cenário: redirecionamento do link Forum
  E clico no Forum
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  | Home   |
 
 Esquema do Cenário: redirecionamento do link Carrinho
  E clico no Carrinho
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal|
 |Home    |
 
 Esquema do Cenário: redirecionamento do link Notificacao
  E clico no notificacao
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Home     |


 