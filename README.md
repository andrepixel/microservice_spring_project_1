# microservice_spring_project_1

Project for study of microservice using Spring Boot 2.

## Qual é a ideia desse projeto?

Esse projeto tem como objetivo simular um fluxo de microserviços onde é necessário fazer validações e seperações de Tickets de uma empresa que trabalha com cinemas. É necessário que seja dividido é um banco de dados os tickets de 3 cinemas e assim que tratados enviar cada conjunto de tickets já separados por cinemas para filas do Kafka.

## Algumas Observações

Vamos supor que tivessemos trabalhando em uma empresa que trabalha com tickets para cinemas. Trabalhamos em uma equipe "X" onde fazemos parte de um pequeno fluxo, dentre vários na arquitetura da empresa. O nosso fluxo tem a visão somente das mensagens que estão em uma fila do Kafka, mas nesse projeto, também foi criado o projeto que não se tem conhecimento que é o gerador de Ticket que envia para a primeira fila do Kafka.

> O primeiro projeto é um Worker, mas não teoria não deveríamos saber como ele funciona, já que ele é de uma outra equipe, mas para fins práticos ele existe aqui nessa arquitetura para ter um gerador para o Kafka.

## Explicação da Arquitetura

1 - O fluxo dessa arquitetura começa com um Worker que acopla todas informações possíveis de um Ticket e envia para uma fila no Kafka. 

2 - O segundo projeto também é um Worker, onde vai pegar mensagens do primeira fila do Kafka e vai começar a fazer um pequeno tratamento desses Tickets e assim que for validado vai fazer uma requisição para uma API onde cada tipo de Ticket será enviado para uma rota diferente. 

3 - O terceiro projeto é uma API que tem como função atender o segundo projeto e os outros projetos depois da API, ambos são Workers. A função da API no primeiro momento é receber os tickets já validados pelo primeiro Worker e enviar para o banco de dados, que aqui pela quantidade massiva de dados e não ter muita relacionamento foi escolhido o MongoDB, onde cada cinema tera o seu próprio documento. No segundo momento ele receberá requisições de outros Workers para atualizar os documentos alterados para o MongoDB.

4 - Por fim, existe outros 3 projetos que são Workers, e eles tem função de receber cada um receber documento relacionado ao seu cinema, fazer uma validação e se tudo der certo enviar para uma outra fila de Kafka.

## Tecnologias usadas

* Java 
* Kotlin
* Spring
* Docker
* Kubernetes
* Jenkins
* GitHub

## Ideia do Projeto

Esse projeto tem como função ser um estudo aprofundado de microserviço, e a cada conhecimento adquirido ir incrementando nesse projeto.