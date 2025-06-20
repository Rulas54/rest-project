# REST Project – Backend de AgendaKotlin

🔧 Proyecto backend desarrollado en **Java con Spring Boot** para alimentar la aplicación móvil [AgendaKotlin](https://github.com/Rulas54/AgendaKotlin). Este servicio expone una API REST para manejar operaciones CRUD sobre contactos, tareas y eventos.

## 🌐 English Version Below

---

## 🛠 Tecnologías utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 (base de datos en memoria)  
- RESTful API  

---

## 📦 Funcionalidades

- CRUD para contactos, tareas y eventos  
- Endpoints organizados por entidad (`/contacts`, `/events`, `/tasks`)  
- Creación automática de la base de datos H2  
- Listo para ser consumido desde aplicaciones móviles o clientes HTTP  

---
## 🧑‍💻 Author

**Luis Raúl Reyes Vázquez**  
[LinkedIn](https://www.linkedin.com/in/luis-raúl-reyes-vazquez)  
[GitHub](https://github.com/Rulas54)

---
## ▶️ Cómo ejecutar

```bash
# Clonar el repositorio
git clone https://github.com/Rulas54/rest-project.git

# Entrar al proyecto
cd rest-project

# Ejecutar (usando Maven o tu IDE)
./mvnw spring-boot:run
