**Convensão sobre Configuração, Configuração sobre Implentação**

restfiul - conjunto de principios que estabelecem a comunicação dentro de uma api

status code - status das minhas requisições

2xx ------ sucessso------

204 - no content - não tem nada para retornar
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

@ResponseStatus  - status code da minha requisição - 200 - 201 - 204 - 400 - 404 - 500

@ResquestMapping - endpoint mãe - /alunos 

@PathVariable - só em endpoints que façam requisições tipo o id, get all não precisa - {Id} - /{id} - 

@XXMapping  - metodos https dos endpoints - get - post - put - delete

@RequestBody - desserializa o response que eu recebo da minha requisição conforme o objeto do meu parametro - o body da minha chamada

@RequestParams - QueryParams - parametros que são passados na url.

---------------------------------------------------------------------------------------------------

DTO - DATA TRANSFER OBJECT - AlunoPostRequest - 

---------------------------------------------------------------------------------------------------

**Injeção de dependencia** - @Autowired - injeta a dependencia do objeto que eu preciso - não dar New nas minhas classes - 

**Bean** - @Bean - um objeto que fica disponivel para ser injetado em qualquer lugar da aplicação - orientado a interface -  
**Injeção de Beans** - @Autowired - injeta o bean que eu preciso - não deve armazenar estado 


@service é igual o @bean porem menos verboso 
@bean a gente tem que criar uma config e instaciar o bean
@service só criar a classe e anotar com @service

-------------------------------------------------------------------------------------------------------------
**JPA** - Java Persistence API - ORM - Object Relational Mapping - mapeamento de objetos para o banco de dados
@entity - mapeia a tabela do banco de dados
@id - mapeia a chave primaria
@GeneratedValue - gera o valor da chave primaria automaticamente
@column - mapeia a coluna do banco de dados
@OneToMany - mapeia o relacionamento de um para muitos
@ManyToOne - mapeia o relacionamento de muitos para um















