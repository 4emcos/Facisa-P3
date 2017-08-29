# Facisa-P3

Atividades relacionadas a disciplina de Programação 3.

## Unidade I
----------
### Atividade I - Visibilidade de pacotes


|                                     | Private | Default | Protected | Public |
|-------------------------------------|---------|:--------| :---------|-------:|
| Mesma Classe                        |   Sim   |   Sim   |    Sim    |   Sim  |
| Mesmo Pacote                        |   Não   |   Sim   |    Sim    |   Sim  |
| Pacotes Diferentes (subclasses)     |   Não   |   Não   |    Sim    |   Sim  |
| Pacotes Diferentes (sem subclasses) |   Não   |   Não   |    Não    |   Sim  |
________________________________________________________________________________________________________________________________________

### Atividade II - Problema do diamante

>  O problema diamante ocorre quando se tenta fazer múltiplas heranças, ou seja, ele o impede de estender dois objetos ao mesmo tempo, pois por acaso ele encontrasse em uma classe herdada de dois métodos herdados de classes diferentes com o mesmo nome ele não saberia como se comportar.

________________________________________________________________________________________________________________________________________

### Atividade III - Padrão de projeto singleton e connection pool

* Singleton

    > A ideia da cerca da questão em se falando de Singleton, é de que tenhamos uma classe-objeto capaz de ser instanciada (criada em memória pronta para seu uso) uma única vez e com visibilidade e acessibilidade global dessa instância em um determinado escopo de projeto. 
    
* Connection pool

    > Um connection pool significaria “piscina de conexões” em português. Basicamente, é uma camada que fica entre o cliente de banco de dados, que faz as conexões com o banco, e o próprio banco. Em aplicações Java, a ideia dessa camada intermediária é que o cliente possa criar conexões com o banco usando o connection pool quase da mesma forma que criaria usando JDBC diretamente, de modo que fica transparente para ele como a conexão é retornada.

### JavaDoc das classes
  
  * Visibilidade
  
  
  
  * ExemploSingleton

