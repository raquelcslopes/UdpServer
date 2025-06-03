# UdpServer

This project is a simple UDP server implemented in Java. It listens for messages on a specific port and responds to specific commands sent by UDP clients.

## How it works
- The server listens on port 8769.
- When it receives the message "HIT ME", it replies with the phrase: "Keep going, tomorrow will be worse!".

## Project Structure
```
src/
  Main.java
  UdpServer.java
```

## How to run
1. Compile the Java files:
   ```sh
   javac src/*.java
   ```
2. Run the main class (adjust according to your main class name):
   ```sh
   java -cp src Main
   ```

## Requirements
- Java 8 or higher

## Notes
- The server only responds to the message "HIT ME".
- The response address is fixed as 127.0.0.1 (localhost).

