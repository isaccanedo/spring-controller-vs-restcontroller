# spring-controller-vs-restcontroller
:herb: Neste breve tutorial, discutiremos a diferença entre as anotações @Controller e @RestController no Spring MVC

1. Visão Geral
Neste breve tutorial, discutiremos a diferença entre as anotações @Controller e @RestController no Spring MVC.

Podemos usar a primeira anotação para controladores Spring tradicionais, e ela faz parte do framework há muito tempo.

O Spring 4.0 introduziu a anotação @RestController para simplificar a criação de serviços da Web RESTful. É uma anotação conveniente que combina @Controller e @ResponseBody, o que elimina a necessidade de anotar cada método de tratamento de solicitação da classe do controlador com a anotação @ResponseBody.
