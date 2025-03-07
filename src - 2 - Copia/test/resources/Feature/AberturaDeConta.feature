
@tag
Feature: Abertura de conta 

  @tag1
  Scenario Outline:
 Teste de preenchimento e envio de formulario 
    Given que o usuário  acesse a url "https://nubank.com.br/"
And preencha o campo cpf 
And clique no botão continuar 
And preencha todo o formulario                   
 

And aceite os termos de politica e privacidade
And clique no botão enviar 
Then o formulário será enviado com sucesso 


 
 

 