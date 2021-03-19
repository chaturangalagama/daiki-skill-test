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

INSERT INTO AUTHORS (
    AUTHOR_ID
,   ADDRESS
,   NAME

)
VALUES
    (1, 'RamADD', 'Ram')
,   (2, 'RaHImADD', 'Rahim')
,   (3, 'PankajADD', 'Pankaj')
,   (4, 'MohanADD', 'Mohan');


INSERT INTO PUBLISHERS (
    PUBLISHER_ID
,   ADDRESS
,   NAME
)
VALUES
    (1, 'JenaPubADD', 'Jena')
,   (2, 'NimalPubADD', 'Nimal')
,   (3, 'SarasaviADD', 'Sarasavi')
,   (4, 'GunasenaADD', 'Gunasena');


INSERT INTO BOOKS (
    BOOK_ID
,   NAME
,   PRICE
,   AUTHOR_AUTHOR_ID
,   PUBLISHER_PUBLISHER_ID
)
VALUES
    (1, 'Rich dad poor dad', 22, 1, 1)
,   (2, 'The inception', 23, 2, 4)
,   (3, 'Dark night', 222, 1, 2)
,   (4, 'Spring boot 2', 342, 4, 2)
,   (5, 'Modern AI applications', 20, 2, 3);


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

-----------------------------------------

Sample GET request to get the publisher of the book- 

Use following URL - http://localhost:8080/api/publisher_by_book

Book name should be set as name=book_name (Ex:name=The inception)


