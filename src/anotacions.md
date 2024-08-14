Bibliotecas uteis 

- Lombok - Biblioteca que traz anotações para gerar getters, setters, construtores, equals, hashcode, toString
  (@Getter - @Setter - @NoArgsConstructor - @AllArgsConstructor - @EqualsAndHashCode - @ToString)


- Spring Web - Bibliotecca que traz toda infra estrutura para subir uma aplicação web - Embarca Servidor, roteamento, parsing
  (@RestController - @RequestMapping - @GetMapping - @PostMapping - @PutMapping - @DeleteMapping)


- Spring Boot dev tools - Biblioteca que traz ferramentas para desenvolvimento local - Live reload, restart automatico
  (Adicionar dependencia no pom.xml) 

------------------------------------------------------------------------------------

REST - Um acordo de comunicação 

Consiste em um conjunto de regras que definem como a comunicação entre sistemas - Um verbo http para cada operação - Um caminho - Headers - Body.

Protocolo , Url e Verbos Http

- URl - Uniform Resource Locator - Endereço de um recurso - composto por protocolo - Ex: Protocolo://Host:Porta/Caminho?QueryParams#Fragmento


- Verbos Http - Métodos que definem a operação que será realizada sobre o recurso - 

**GET - POST - PUT - DELETE - PATCH - OPTIONS - HEAD**

**GET** - Recuperar um recurso - Não deve ter efeitos colaterais - Não deve alterar o estado do servidor - Não deve ser usado para enviar dados sensíveis - Não deve ser usado para enviar muitos dados

**POST** - Criar um recurso - Enviar dados para o servidor - Pode ter efeitos colaterais - Pode alterar o estado do servidor - Pode ser usado para enviar dados sensíveis - Pode ser usado para enviar muitos dados

**PUT** - Atualizar um recurso - Substituir um recurso - Enviar dados para o servidor - Não deve ter efeitos colaterais - Deve alterar o estado do servidor - Pode ser usado para enviar dados sensíveis - Pode ser usado para enviar muitos dados

**DELETE** - Deletar um recurso - Remover um recurso - Não deve ter efeitos colaterais - Deve alterar o estado do servidor - Não deve ser usado para enviar dados sensíveis - Não deve ser usado para enviar muitos dados

**PATCH** - Atualizar um recurso - Atualizar parcialmente um recurso - Enviar dados para o servidor - Não deve ter efeitos colaterais - Deve alterar o estado do servidor - Pode ser usado para enviar dados sensíveis - Pode ser usado para enviar muitos dados

**OPTIONS** - Recuperar os métodos http permitidos para um recurso - Recuperar os headers permitidos para um recurso - Recuperar os verbos http permitidos para um recurso

**HEAD** - Recuperar os headers de um recurso - Recuperar os headers permitidos para um recurso - Recuperar os headers de um recurso sem o corpo da resposta


Request - Estrutura protcolar que contém informações sobre a requisição - Headers - Body - Method - Path - QueryParams

-----------------------------------------------------------------------------------

Status Code - Forma acordada de comunicar o resultado de uma requisição - Cada status code tem um significado - Cada status code tem um range de significado

----------------------------------------------------------------------------------

