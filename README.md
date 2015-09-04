# first-non-repeated

### Pra que é esse repositório? ###

Implementa um algoritmo de avaliação de um stream em busca do primeiro caractere que não se 
repete.

### Estratégia ###
O design da interface foi definido previamente pelo solicitante. 
Optei por utilizar o Junit para garantir os diversos cenários.
Para executar o código, somente através de teste, pois não foi criada uma classe executável.

#### O Algoritmo ####
Com relação ao algorítmo, utilizei um LinkedHashMap para armazenar os caracteres lidos porque 
ele garante a ordem de adição dos item, ou seja, os primeiro adicionados são os primeiros lidos, 
dessa forma, após ler o stream completo basta encontrar o primeiro caracter no mapa de lidos 
que só tem uma ocorrência que fica garantido que é o primeiro lido da stream que não se repetiu.

### Pré Requisitos ###
* Git
* JDK 1.8
* Maven

### Como executar os testes ###
> mvn test
