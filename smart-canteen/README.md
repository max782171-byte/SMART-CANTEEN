# Smart Canteen Pre-Order System

A syllabus-aligned full-stack canteen application with a responsive React client and a Spring Boot/JPA API. The domain is split into authentication, menu catalog, ordering, kitchen queue, and analytics modules so it can be separated into microservices later.

## Features

- Customer menu search, category filters, cart drawer, scheduled pickup slots, and order tracking.
- Kitchen Kanban board for New Orders, On the Stove, and Ready for Pickup.
- Admin analytics with Recharts and menu CRUD.
- Stateless JWT authentication, BCrypt password hashing, role-based routes, Spring Data JPA repositories, and SQL aggregation queries.
- H2 local profile for quick demos; MySQL configuration for production-style development.

## Run on a Mac M1

Prerequisites: Node.js 18+ and Java 17+. Maven is needed for the backend (`brew install maven`).

```bash
cd smart-canteen/frontend
npm install
npm run dev
```

In a second terminal:

```bash
cd smart-canteen/backend
mvn spring-boot:run -Dspring-boot.run.profiles=local
```

Open <http://localhost:5173>. The local H2 profile starts on port 8080 and seeds demo accounts:

- `student@campus.test` / `password` (student)
- `staff@campus.test` / `password` (staff)
- `admin@campus.test` / `password` (admin)

The H2 console is available at <http://localhost:8080/h2-console> with JDBC URL `jdbc:h2:mem:canteen`, user `sa`, and an empty password.

For MySQL, create a database named `smart_canteen`, set `SPRING_DATASOURCE_USERNAME` and `SPRING_DATASOURCE_PASSWORD`, then run with `-Dspring-boot.run.profiles=mysql`.

## API

The API base URL is `http://localhost:8080/api`.

- `POST /auth/register`, `POST /auth/login`
- `GET /menu`, `POST /menu`, `PUT /menu/{id}`, `DELETE /menu/{id}`
- `POST /orders`, `GET /orders/my`, `GET /orders/kitchen`, `PATCH /orders/{id}/status`
- `GET /admin/analytics`

Send `Authorization: Bearer <token>` for protected endpoints. Admin menu and analytics routes require `ADMIN`; kitchen routes require `STAFF` or `ADMIN`.

## Syllabus mapping

React hooks and responsive HTML/CSS cover Units 1–2. Spring MVC, services, JPA, SQL aggregation, JWT, and BCrypt cover Units 3–4. Domain package boundaries and DTO-based APIs provide a Unit 5 microservice migration path.
