# Backend SalesHome

Este proyecto es el backend de la plataforma **SalesHome**, una tienda inmobiliaria que permite gestionar propiedades, clientes y transacciones.  
Está desarrollado en **Spring Boot 3.5.7** con **Java 17** y utiliza **Oracle Database** con conexión mediante **Oracle Wallet**.

## Características

- Gestión de propiedades (crear, leer, actualizar, eliminar).
- Conexión segura a base de datos Oracle.
- Configuración JPA/Hibernate para operaciones CRUD.
- API REST consumible desde aplicaciones web y móviles.
- Seguridad básica con Spring Security (opcional según entorno de desarrollo).

## Tecnologías

- Java 17
- Spring Boot 3.5.7
- Spring Data JPA
- Oracle Database (Wallet)
- Maven
- HikariCP (pool de conexiones)
- Lombok (para simplificar código)
- Postman para pruebas de API

## Endpoints principales

| Método | URL                  | Descripción                       |
|--------|--------------------|-----------------------------------|
| GET    | `/productos`        | Listar todas las propiedades      |
| GET    | `/productos/{id}`   | Obtener propiedad por ID          |
| POST   | `/productos`        | Crear nueva propiedad             |
| PUT    | `/productos/{id}`   | Actualizar propiedad existente    |
| DELETE | `/productos/{id}`   | Eliminar propiedad por ID         |

## Configuración

1. Clonar el repositorio:
```bash
git clone https://github.com/TU_USUARIO/backend-saleshome.git
