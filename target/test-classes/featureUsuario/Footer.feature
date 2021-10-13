#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:06/10/2021
#version: 1.0

Funcionalidade: Redirecionamento dos links do Footer
	Como um aluno do site eadplataforma
	Quero clicar nos links do hearder
  Para que seja redirecionado para página correta
	
Contexto:
	Dado que estou na pagina home do site
	E clico Login
  E preencho e-mail "paloma.gpedro@gmail.com"
  E preencho senha "pwd1234"
  E seleciono entrar
  E clico eem aceitar coockies
	

Esquema do Cenário: redirecionamento do link Fale Conosco
  E clico Fale Conosco
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal     |
 |Fale Conosco |
 
Esquema do Cenário: redirecionamento do link Política de Privacidade
  E clico Política de Privacidade
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal                                                        |
 |SEÇÃO 4 - POR QUANTO TEMPO OS DADOS PESSOAIS FICAM ARMAZENADOS? | 
	
Esquema do Cenário: redirecionamento do link Consultar Certificado
  E clico Consultar Certificado
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal |
 |Home     | 
			
Esquema do Cenário: redirecionamento do link Icone facebook
  E clico Icone Facebook
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal |
 |Senha    | 
 
 	
Esquema do Cenário: redirecionamento do link  Icone Youtube
  E clico Icone Youtube
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal                      |
 |Transmissões ao vivo passadas | 
			
Esquema do Cenário: redirecionamento do link Icone Instagram
  E clico Icone Instagram
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal           |
 |Empresa de software| 
 

Esquema do Cenário: redirecionamento do link Imagem Facebook
  E clico Imagem Facebook
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal                                      |
 |Ver mais da Página EAD Plataforma no Facebook | 

@fast 
Esquema do Cenário: redirecionamento do link Icone EadPlataforma
  E clico Icone EadPlataforma
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
 |msgFinal |
 |Blog     |
