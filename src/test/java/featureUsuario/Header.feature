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
	E clico Login
 
Esquema do Cenário: redirecionamento do link Curso
  E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E seleciono entrar
  E clico no Curso
<<<<<<< HEAD
=======
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |email                    |senha    |msgFinal|
 |paloma.gpedro@hotmail.com|pwd2212  |Home    |
 

 Esquema do Cenário: redirecionamento do link Forum
  E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E seleciono entrar
  E clico no Forum
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |email                    |senha    |msgFinal|
 |paloma.gpedro@hotmail.com|pwd2212	 | Home   |
 
 Esquema do Cenário: redirecionamento do link Carrinho
 	E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E seleciono entrar
  E clico no Carrinho
>>>>>>> master
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |email                    |senha    |msgFinal|
<<<<<<< HEAD
 |paloma.gpedro@hotmail.com|pwd2212  |Home    |
 

 Esquema do Cenário: redirecionamento do link Forum
  E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E seleciono entrar
  E clico no Forum
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |email                    |senha    |msgFinal|
 |paloma.gpedro@hotmail.com|pwd2212	 | Home   |
 
 Esquema do Cenário: redirecionamento do link Carrinho
 	E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E seleciono entrar
  E clico no Carrinho
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |email                    |senha    |msgFinal|
 |paloma.gpedro@hotmail.com|pwd2212	 |CARRINHO|
 

 Esquema do Cenário: redirecionamento do link Notificacao
  E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E seleciono entrar
  E clico no notificacao
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |email                    |senha    |msgFinal |
 |paloma.gpedro@hotmail.com|pwd2212	 |Home     |
 
=======
 |paloma.gpedro@hotmail.com|pwd2212	 |CARRINHO|
 

 Esquema do Cenário: redirecionamento do link Notificacao
  E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E seleciono entrar
  E clico no notificacao
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |email                    |senha    |msgFinal |
 |paloma.gpedro@hotmail.com|pwd2212	 |Home     |
>>>>>>> master
 