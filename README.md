# Parcial 2 – Cinema Nova (Backend)

## Autor
**Juan Jose Martinez Perez**

## Descripción
Este proyecto implementa un backend mínimo para el cine **Cinema Nova**, cumpliendo los requisitos del Parcial 2.  
Permite registrar la información básica de cines, sus detalles y sus salas, utilizando **Spring Boot** y **JPA** con base de datos en memoria (**H2**).

## Funcionalidades
- Persistencia de entidades:
   - **Cine** (nombre, dirección)
   - **DetalleCine** (teléfono, email, relación 1:1 con Cine)
   - **Sala** (nombre, capacidad, relación N:1 con Cine)
- Repositorios con consultas personalizadas.
- Servicios que implementan la operación de guardado.
- DTO + Mapper para la entidad **Cine**.
- Inserción de datos iniciales con `Bootstrap`.

## Estructura del código
- **Entities:** `com.example.parcial2.entities`
- **Repositories:** `com.example.parcial2.repositories`
- **Services:** `com.example.parcial2.services`
- **DTO/Mapper:** `com.example.parcial2.dto` / `com.example.parcial2.mappers`
- **Bootstrap:** `com.example.parcial2.Bootstrap` (datos de prueba)

