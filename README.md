# Chat App

A real-time chat application built using Spring Boot for the backend and Thymeleaf with JavaScript for the frontend. This project demonstrates the use of WebSocket and STOMP protocols for seamless and efficient communication between clients.

## Features

- **Real-Time Communication**: Instant messaging powered by WebSocket and STOMP.
- **Interactive Frontend**: Built with Thymeleaf, JavaScript, and Bootstrap.
- **Scalable Backend**: Developed using Spring Boot with support for WebSocket and STOMP messaging.

## Tech Stack

### Backend (Server-Side)
- **Spring Boot**
- **Spring WebSocket**
- **Spring Messaging** (STOMP Protocol)
- **Thymeleaf**

### Frontend (Client-Side)
- **Thymeleaf**
- **JavaScript (ES6)**
- **SockJS**
- **STOMP.js**
- **HTML/CSS**
- **Bootstrap**

### Development and Infrastructure Tools
- **Maven**

## Getting Started

### Prerequisites

Ensure you have the following installed:
- **Java 17** or higher
- **Maven**
- A modern web browser

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/chat-app.git
   cd chat-app
   ```

2. **Backend Setup**
   - Navigate to the project directory.
   - Build the project using Maven:
     ```bash
     mvn clean install
     ```
   - Run the application:
     ```bash
     mvn spring-boot:run
     ```
   - The server will start at `http://localhost:8080`.

3. **Access the Application**
   - Open a web browser and navigate to `http://localhost:8080`.

## How It Works

- **Backend**: The Spring Boot application handles WebSocket connections and manages message routing using STOMP.
- **Frontend**: Thymeleaf templates are used for rendering pages, while JavaScript (ES6), SockJS, and STOMP.js handle real-time communication.

## Project Structure

```
chat-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.chatapp
│   │   │       ├── config         # WebSocket configuration
│   │   │       ├── controller    # Controller classes
│   │   │       └── model         # Data models
│   │   └── resources
│   │       ├── static           # Static files (CSS, JS)
│   │       └── templates        # Thymeleaf templates
└── pom.xml                      # Maven configuration
```

## Dependencies

### Maven
Key dependencies include:
- `spring-boot-starter-web`
- `spring-boot-starter-websocket`
- `spring-boot-starter-thymeleaf`
- `spring-messaging`

Refer to `pom.xml` for the complete list of dependencies.

## Contributions

Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes.
4. Submit a pull request.


## Acknowledgments

- **Spring Framework** for its robust backend support.
- **Bootstrap** for responsive and elegant UI components.
- **SockJS** and **STOMP.js** for simplifying real-time communication.


