
# Api Rest

## Requisitos

IntelliJ IDEA (Versión comunidad)

> https://www.jetbrains.com/es-es/idea/download

Jdk 20

> https://www.oracle.com/java/technologies/downloads/#jdk20

Postman

> https://www.postman.com/downloads/

## Ejecución

- Abrir el proyecto en IntelliJ
- Ejecutar "Application"

<br>

> En Postman

<br>

**POST (Creación ID)**

> localhost:8080/product

- Seleccionar Body>Raw>Json y pasar los datos de un producto
> {
"description": "XPS Laptop",
"price": 2025.77
}
- Si el resultado es un id junto a una respuesta 201, se ejecuto de manera exitosa

<br>

**GET (Recibir todos los productos)**

> localhost:8080/product

- Si el resultado es una lista de los productos junto a una respuesta 200, se ejecuto de manera exitosa

<br>

**GET (Recibir un producto)**

> localhost:8080/product/123

- Si el resultado es 1 producto junto a una respuesta 200, se ejecuto de manera exitosa

<br>

**PATCH (Enviar un producto)**

> localhost:8080/product

- Seleccionar Body>Raw>Json y pasar los datos de un producto

> {
"id": "888",
"description": "An awesome product",
"price": 1587.14
}

- Si el resultado es una respuesta vacia producto junto a una respuesta 200, se ejecuto de manera exitosa. En la consola de IntelliJ se podrá observar los datos enviados.

<br>

**DELETE**

> localhost:8080/product/123

- Seleccionar Body>Raw>Json y pasar un json vacio
> {}
- Si el resultado es una respuesta vacia producto junto a una respuesta 200, se ejecuto de manera exitosa.
