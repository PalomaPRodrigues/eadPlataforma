#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:02/10/2021
#version: 1.0

Funcionalidade: Cadastro com sucesso
  Como um aluno do site eadplataforma
  Quero me cadastrar
  Para acessar os cursos

Esquema do Cenário: Cadastro insucesso
  Dado que estou na pagina home do site
  E clico cadastro
  E preencho nome "<nome>"
  E preencho telefone "<telefone>"
  E preencho e-mail "<email>"
  E preencho senha "<senha>"
  E preencho Captcha"<Captcha>"
  Quando clico criar conta
  Entao valido mensagem final com sucesso "<msgFinal>"

  Exemplos:
  |nome |telefone   |email						     |senha  |Captcha|msgFinal                           |
  |Teste|11941855569|teste.testes@gmail.com|pwd1223|FB1GoT |Captcha incorreto, tente novamente!|