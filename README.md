# Homework Assignment

**SpaceTravel** is a demonstration project for managing passenger transportation between planets. The project uses Hibernate to interact with the database, Flyway for migrations, and PostgreSQL as the database.

This phase is a continuation of the previous one and adds new functionality for ticket management (`Ticket`).

## New functionality

### Ticket entity:
- Ticket contains information about the customer, start and end planet.
- Many-to-one relationships are used for the relationship between the client and the ticket, as well as between planets and tickets.
- The ticket has an automatically generated creation date.

### CRUD service for tickets:
- The operations of creating, reading, updating, and deleting tickets are implemented.
- The correctness of the data is checked: you cannot save a ticket for a non-existent or `null` client, as well as for a non-existent or `null` planet.
