# Java Backend Take-Home exercise

This is a REST API for managing users. The following endpoints are supported:

| Endpoint             | Function                   |
| -------------------- | -------------------------- |
| `POST` /users        | Create a new user          |
| `GET` /users         | List all available users   |
| `GET` /users/{id}    | List a single user         |
| `PUT` /users/{id}    | Update an existing user    |
| `DELETE` /users/{id} | Delete an existing user    |

A user has the following attributes:

- A username
- A first name
- A last name
- An email
- A phone number

## Example usage (using cURL)

1. Creating a new user

```
curl -X POST http://localhost:8080/users \
-H "Content-Type: application/json" \
-d '{
  "username": "anyaa",
  "firstname": "Anya",
  "lastname": "Forger",
  "email": "anyaforger@spy.com",
  "phonenumber": "1234567890"
}'
```

2. List all users

```
curl -X GET http://localhost:8080/users
```

3. List a single user by id

```
curl -X GET http://localhost:8080/users/{id}
```

4. Updating an existing user

```
curl -X PUT http://localhost:8080/users/{id} \
-H "Content-Type: application/json" \
-d '{
  "username": "anyaa",
  "firstname": "Anya",
  "lastname": "Forger",
  "email": "anyaforger@spy.com",
  "phonenumber": "23456789"
}'
```

5. Deleting a user

```
curl -X DELETE http://localhost:8080/users/{id}
```

## Tech stack

This backend API has been built using:

- Spring boot (with Gradle)
- Spring Data JPA
- MySQL
