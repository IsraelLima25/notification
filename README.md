# 📩 Notification Service - Envio de Notificações com Spring Boot

Este projeto é um microserviço para envio de notificações utilizando **Spring Boot** e **Apache Kafka**. Ele permite a publicação e o consumo de mensagens em tópicos do Kafka, garantindo comunicação assíncrona eficiente.

## 🚀 Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot 3.3.0**  
- **Spring Web**  
- **Spring Kafka**  
- **Docker**  
- **Testes com JUnit e Spring Boot Test**  

## 📥 Instalação e Execução

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/notification-service.git
   ```

2. Suba o ambiente Docker com Kafka (caso necessário):
   ```sh
   docker-compose up -d
   ```

3. Execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```

## 🛠 Estrutura do Projeto

- `/src/main/java/br/com/lima/notification` → Código principal do microserviço  
- `/src/test/java/br/com/lima/notification` → Testes unitários e de integração  
- `/pom.xml` → Configuração do projeto e dependências  

## 📌 Funcionalidades

- 🔹 **Publicação de mensagens** em tópicos Kafka  
- 🔹 **Consumo de mensagens** para processar notificações  
- 🔹 **Testes automatizados** para garantir a qualidade do código  

## 📖 Testes

Para rodar os testes automatizados:
```sh
mvn test
```
