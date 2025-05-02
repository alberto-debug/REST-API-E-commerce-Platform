
---

# 🛍️ E-commerce REST API

A secure and scalable **Spring Boot REST API** backend for an eCommerce platform, supporting product management, user authentication, cart handling, and order processing.

---

## ✨ Key Features

* 🛒 Cart & Checkout
* 📦 Product CRUD (Admin)
* 🔐 JWT Auth & Role-based Access
* 📊 Order Tracking
* 🔎 Product Search & Filter

---

## 🛠️ Tech Stack

* Java 17, Spring Boot, Spring Security (JWT)
* Spring Data JPA, PostgreSQL / H2
* Maven, Swagger UI

---

## 🚀 Quick Start

```bash
git clone https://github.com/yourusername/ecommerce-rest-api.git
cd ecommerce-rest-api
mvn spring-boot:run
```

Runs at: `http://localhost:8080`

---

## 🔐 Auth Endpoints

* **POST /api/auth/register** – User registration
* **POST /api/auth/login** – Get JWT token

Use `Authorization: Bearer <token>` in protected routes.

---

## 📬 API Highlights

### Products

* `GET /api/products` – List all
* `POST /api/admin/products` – Create (Admin)

### Cart

* `POST /api/cart/add` – Add item
* `GET /api/cart` – View cart

### Orders

* `POST /api/orders` – Place order
* `GET /api/orders/{id}` – Order details

---

## 📘 Docs & Testing

* Swagger: `http://localhost:8080/swagger-ui.html`
* Run tests: `mvn test`

---

## 📞 Contact

📧 [albertojunior848423803@gmail.com](mailto:albertojunior848423803@gmail.com)
🌐 

---

