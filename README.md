# UdpServer

Este projeto é um servidor UDP simples implementado em Java. Ele escuta mensagens em uma porta específica e responde a comandos específicos enviados por clientes UDP.

## Como funciona
- O servidor escuta na porta 8769.
- Quando recebe a mensagem "HIT ME", responde com a frase: "Keep going, tomorrow will be worse!".

## Estrutura do Projeto
```
src/
  Main.java
  UdpServer.java
```

## Como executar
1. Compile os arquivos Java:
   ```sh
   javac src/*.java
   ```
2. Execute a classe principal (ajuste conforme o nome da sua classe main):
   ```sh
   java -cp src Main
   ```

## Requisitos
- Java 8 ou superior

## Observações
- O servidor responde apenas à mensagem "HIT ME".
- O endereço de resposta está fixo como 127.0.0.1 (localhost).
