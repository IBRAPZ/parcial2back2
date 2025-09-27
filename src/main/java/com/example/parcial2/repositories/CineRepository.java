package com.example.parcial2.repositories;

import com.example.parcial2.entities.Cine;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CineRepository extends JpaRepository<Cine, Long> {
    @Query("select c from Cine c where lower(c.nombre) like lower(concat('%',:nombre,'%'))")
    List<Cine> searchByNombre(@Param("nombre") String nombre);
}
