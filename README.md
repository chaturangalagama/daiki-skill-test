# A basic library catalogue system using Spring Boot, H2 Database, and Spring Data JPA

## Run Spring Boot application
```
mvn spring-boot:run
```

# Initialize DB with following values:

INSERT INTO BOOKS (
    BOOK_ID
,   NAME
,   PRICE
)
VALUES
    (1, 'Ram', 22)
,   (2, 'Rahim', 23)
,   (3, 'Pankaj', 222)
,   (4, 'Rahim', 342)
,   (5, 'Mohan', 20);

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


# Then test using postman requests at port 8080:

Sample GET request to get all the books which are published by a specific publisher- 
Use following URL - http://localhost:8080/api/publisher?name=Sarasavi
Publisher name should be set as ?name=Sarasavi
Body should be set as "raw" and "JSON"

Sample GET response -

[
    {
        "bookId": 4,
        "name": "Rahim",
        "publisher": {
            "publisherId": 3,
            "name": "Sarasavi",
            "address": "SarasaviADD"
        },
        "author": {
            "authorId": 3,
            "name": "Pankaj",
            "address": "PankajADD"
        },
        "price": 342.0
    }
]

