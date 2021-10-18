# spring-controller-vs-restcontroller
:herb: Neste breve tutorial, discutiremos a diferença entre as anotações @Controller e @RestController no Spring MVC

# 1. Visão Geral
Neste breve tutorial, discutiremos a diferença entre as anotações @Controller e @RestController no Spring MVC.

Podemos usar a primeira anotação para controladores Spring tradicionais, e ela faz parte do framework há muito tempo.

O Spring 4.0 introduziu a anotação @RestController para simplificar a criação de serviços da Web RESTful. 
É uma anotação conveniente que combina @Controller e @ResponseBody, o que elimina a necessidade de anotar cada método
de tratamento de solicitação da classe do controlador com a anotação @ResponseBody.

# 2. Spring MVC @Controller
Podemos anotar controladores clássicos com a anotação @Controller. Isso é simplesmente uma especialização da classe @Component, que nos permite detectar automaticamente as classes de implementação por meio da varredura do classpath.

Normalmente usamos @Controller em combinação com uma anotação @RequestMapping para métodos de tratamento de solicitações

Vamos ver um exemplo rápido do controlador Spring MVC:

```
@Controller
@RequestMapping("books")
public class SimpleBookController {

    @GetMapping("/{id}", produces = "application/json")
    public @ResponseBody Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

    private Book findBookById(int id) {
        // ...
    }
}
```

Anotamos o método de tratamento da solicitação com @ResponseBody. Essa anotação permite a serialização automática do objeto de retorno no HttpResponse.

# 3. Spring MVC @RestController
@RestController é uma versão especializada do controlador. Inclui as anotações @Controller e @ResponseBody e, como resultado, simplifica a implementação do controlador:
