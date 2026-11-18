# Sample data

The local Spring profile seeds three BCrypt-protected accounts and six menu items on startup. Credentials are intentionally demo-only:

| Email | Password | Role |
| --- | --- | --- |
| student@campus.test | password | STUDENT |
| staff@campus.test | password | STAFF |
| admin@campus.test | password | ADMIN |

To add realistic orders, sign in as the student and place an order from the UI. The H2 database is in-memory and resets when the backend stops.
