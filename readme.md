### Static Data

Consider this pattern for static data as opposed to raw JSON array.

See: [src/main/java/com/example/nodb](https://github.com/kevinchatham/java-no-db/tree/main/src/main/java/com/example/nodb)

- `Database.java` - holds static collections of database tables and data

- `Item.java` - JOCO representing individual table

Run with `mvn spring-boot:run`

- OpenJDK 11
- Lombok
- Maven 3.8.6
