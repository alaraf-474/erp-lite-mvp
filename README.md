# ⚙️ ERP System Backend (Spring Boot)

This is a modular backend for an **Enterprise Resource Planning (ERP)** system, built using **Java Spring Boot**. The project is designed for clean code, modular architecture, and RESTful API design.

---

## 📦 Modules

- ✅ **User Module** – CRUD operations for managing users (Admins, Managers, Staff)
- ⏳ Inventory Module – _Coming Soon_
- ⏳ Finance Module – _Coming Soon_

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3
- PostgreSQL
- Spring Data JPA
- Spring Security (configured)
- Maven
- REST APIs

---

## 🔐 Authentication

Spring Security is enabled by default. You’ll be prompted with a login page at:
```

[http://localhost:8080/api/users](http://localhost:8080/api/users)

````

> You can disable security temporarily from `SecurityConfig.java` if needed.

---

## 📡 API Endpoints (User Module)

| Method | Endpoint            | Description           |
|--------|---------------------|-----------------------|
| GET    | `/api/users`        | Get all users         |
| GET    | `/api/users/{id}`   | Get user by ID        |
| POST   | `/api/users`        | Create new user       |
| PUT    | `/api/users/{id}`   | Update existing user  |
| DELETE | `/api/users/{id}`   | Delete a user         |

---

## 🧪 Testing the API

You can test with:
- **Postman**
- **curl**
- Or connect a React frontend later

Example POST request:
```json
POST /api/users
{
  "username": "jdoe",
  "fullName": "John Doe",
  "password": "securepass",
  "role": "MANAGER"
}
````

---

## 🚀 How to Run

```bash
# 1. Clone the repo
git clone https://github.com/yourusername/erp.git

# 2. Open in IDE (VS Code / IntelliJ)

# 3. Create PostgreSQL DB (e.g. erp_db)

# 4. Configure `application.properties`

# 5. Run the app
./mvnw spring-boot:run
```

---

## 📁 Folder Structure

```
src
 └── main
     ├── java
     │   └── com.erp
     │       ├── controller
     │       ├── model
     │       ├── repository
     │       └── service
     └── resources
         ├── application.properties
```

---

## 📌 Author

* **Al Araf**
  🌐 GitHub: [@alaraf-474](https://github.com/alaraf-474)
  🔗 LinkedIn: *\[(https://www.linkedin.com/in/rishad-araf/)]*

---

> ERP is modular, maintainable, and scalable — ready for production-level evolution.
