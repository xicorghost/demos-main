## 1. Creación del proyecto con Spring Initializr

lol

## Endpoints para pruebas (Postman o navegador)


### Productos


- Obtener todos los productos
  GET http://localhost:8080/productos


- Obtener producto por id
  GET http://localhost:8080/productos/{id}


- Crear productos
  POST http://localhost:8080/productos
  Content-Type: application/json


  Ejemplos para crear productos (POST):


{
  "id": 1,
  "nombre": "Laptop",
  "stock": 15,
  "precio": 999.99,
  "categoria": "Electrónica"
}

{
    "id": 2,
    "nombre": "Smartphone",
    "stock": 30,
    "precio": 499.99,
    "categoria": "Electrónica"
  },

  {
    "id": 3,
    "nombre": "Silla de oficina",
    "stock": 20,
    "precio": 149.50,
    "categoria": "Muebles"
  },

  {
    "id": 4,
    "nombre": "Botella térmica",
    "stock": 50,
    "precio": 19.99,
    "categoria": "Hogar"
  },

  {
    "id": 5,
    "nombre": "Teclado mecánico",
    "stock": 10,
    "precio": 89.95,
    "categoria": "Informática"
  },

  {
    "id": 6,
    "nombre": "Auriculares inalámbricos",
    "stock": 25,
    "precio": 129.00,
    "categoria": "Audio"
  }
  ### ADVERTENCIA
  -El dia jueves 26 descubri cual fue el problema, y era esque no aprete el f5,
  pero despues en los puertos por alguna razon lo deje en localhost:3306 pero no 
  funcionaba las peticiones en el postman pero despues las puse con localhost:8080
  pero seguia estando en 3306 pero todo funcionaba bien asi que lo deje asi xd.
