# Smart Canteen API Specification

All endpoints are prefixed with `/api`. Protected requests use `Authorization: Bearer <JWT>`.

## Authentication

`POST /auth/login`

```json
{"email":"student@campus.test","password":"password"}
```

Returns `{ "token": "...", "user": { "id": 1, "name": "Student", "email": "...", "role": "STUDENT" } }`.

`POST /auth/register` accepts `email`, `name`, and `password`; new accounts receive the `STUDENT` role.

## Menu

- `GET /menu` — public-to-authenticated catalog response.
- `POST /menu` — `ADMIN`; accepts `name`, `category`, `description`, `emoji`, `price`, `available`.
- `PUT /menu/{id}` — `ADMIN`; replaces a menu item.
- `DELETE /menu/{id}` — `ADMIN`.

## Orders

`POST /orders` accepts:

```json
{"pickupSlot":"1:00 PM","items":[{"menuItemId":1,"quantity":2}]}
```

- `GET /orders/my` — current customer’s orders.
- `GET /orders/kitchen` — `STAFF` or `ADMIN`; active queue.
- `PATCH /orders/{id}/status` — `STAFF` or `ADMIN`; body `{ "status": "ON_STOVE" }`.

Valid statuses: `NEW`, `ON_STOVE`, `READY`, `PICKED_UP`, `CANCELLED`.

## Analytics

`GET /admin/analytics` — `ADMIN`; returns today’s order count, grouped statuses, and peak-hour aggregates.
