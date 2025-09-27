Proyecto corregido para el parcial.

Instrucciones:
1. `mvn clean package`
2. `mvn spring-boot:run`
3. H2 console: http://localhost:8080/h2-console
   URL: jdbc:h2:mem:parcialdb

Estructura principal:
- Entities: com.example.parcial2.entities (Cine, DetalleCine, Sala)
- Repositorios: com.example.parcial2.repositories
- DTO/Mapper: CineDto / CineMapper
- Servicios: com.example.parcial2.services

Crear branch y PR:
git checkout -b featuresantiagotexamen
git add .
git commit -m "Solución parcial 2 - [Tu Nombre]"
git push origin featuresantiagotexamen
