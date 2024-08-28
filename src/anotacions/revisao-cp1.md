**Convensão sobre Configuração, Configuração sobre Implentação**

restfiul - conjunto de principios que estabelecem a comunicação dentro de uma api

status code - status das minhas requisições

2xx ------ sucessso------

204 - no content 
200 - ok

3xx ----- redirecionamento ------

4xx ----- cagada do usuario - input errado do usuario ------

400 - bad request - não encontrei nada  
404 - deveria existir mas não existe   
408 - timeout - conexao front com o back

5xx  ----- erro do lado do servidor -----


request - camada de envio que fazemos para o servidor

o nosso endpoint espera uma resquest e devolve uma response

--------------------------------------------------------------------------------------

Anotações para controller
@RestController - get - post - put

@ResponseStatus - 

@ResquestMapping - endpoint mãe

@PathVariable - só em endpoints que façam requisições tipo o id, get all não precisa

@XXMapping  - metodos https dos endpoints

@RequestBody - desserializa o response que eu recebo da minha requisição conforme o objeto do meu parametro

@RequestParams - 

---------------------------------------------------------------------------------------------------

DTO - DATA TRANSFER OBJECT - AlunoPostRequest









