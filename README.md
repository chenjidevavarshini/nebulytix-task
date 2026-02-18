
---

## APIs

### Product APIs

| Method | Endpoint            | Description           |
|--------|-------------------|----------------------|
| POST   | /products          | Create a product     |
| GET    | /products/{id}     | Get product by ID    |
| GET    | /products          | Get all products     |
| PUT    | /products/{id}     | Update a product     |
| DELETE | /products/{id}     | Delete a product     |

### User APIs

| Method | Endpoint        | Description       |
|--------|----------------|------------------|
| POST   | /users          | Create a user     |
| GET    | /users/{id}     | Get user by ID    |
| GET    | /users          | Get all users     |
| PUT    | /users/{id}     | Update a user     |
| DELETE | /users/{id}     | Delete a user     |

> Note: All request bodies should follow the DTO structure.

---

## Database

- H2 in-memory database  
- Accessible at [http://localhost:8083/h2-console](http://localhost:8083/h2-console)  
- JDBC URL: `jdbc:h2:mem:testdb`  
- Username: `SA`  
- Password: *(leave empty)*  

Tables created: `products`, `users`.

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/chenjidevavarshini/nebulytix-task.git
cd nebulytix-task
