# A basic library catalogue system using Spring Boot, H2 Database, and Spring Data JPA


## Run Spring Boot application
```
mvn spring-boot:run
```

# Initialize DB:

Go to http://localhost:8080/h2-ui/

Use JDBC URL - jdbc:h2:mem:testdb

Username - sa

Password -

And then connect to H2 DB

-----------------------------------------

Initialize DB with following values

INSERT INTO BOOKS (
    BOOK_ID
,   NAME
,   PRICE
)

VALUES
    (1, 'Rich dad poor dad', 22)
,   (2, 'The inception', 23)
,   (3, 'Dark night', 222)
,   (4, 'Spring boot 2', 342)
,   (5, 'Modern AI applications', 20);

-----------------------------------------

INSERT INTO AUTHORS (
    AUTHOR_ID
,   ADDRESS
,   NAME
,   BOOK_ID
)

VALUES
    (1, 'RamADD', 'Ram', 3)
,   (2, 'RaHImADD', 'Rahim', 1)
,   (3, 'PankajADD', 'Pankaj', 4)
,   (4, 'RaHImADD', 'Rahim', 5)
,   (5, 'MohanADD', 'Mohan', 2);

-----------------------------------------

INSERT INTO PUBLISHERS (
    PUBLISHER_ID
,   ADDRESS
,   NAME
,   BOOK_ID
)

VALUES
    (1, 'JenaPubADD', 'Jena', 3)
,   (2, 'NimalPubADD', 'Nimal', 1)
,   (3, 'SarasaviADD', 'Sarasavi', 4)
,   (4, 'GunasenaADD', 'Gunasena', 2);


# Then test APIs using Swagger:

Go to http://localhost:8080/swagger-ui.html

-----------------------------------------

Sample GET request to get all the books - 

Use following URL - http://localhost:8080/api/books

-----------------------------------------

Sample GET request to see publisher information of a selected book- 

Use following URL - http://localhost:8080/api/books

Publisher name should be set as name=book_name (Ex:name=Modern AI applications)

-----------------------------------------

Sample GET request to get all the books which are published by a specific publisher- 

Use following URL - http://localhost:8080/api/publisher

Publisher name should be set as name=publisher_name (Ex:name=Sarasavi)

-----------------------------------------

Sample GET request to get all the books which are authored by a specific author- 

Use following URL - http://localhost:8080/api/author

Publisher name should be set as name=author_name (Ex:name=Rahim)


