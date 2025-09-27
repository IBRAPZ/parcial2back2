package com.example.parcial2.repositories;

import com.example.parcial2.entities.Sala;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    @Query("select s from Sala s where s.capacidad > :cap")
    List<Sala> findByCapacidadGreaterThan(@Param("cap") int cap);
}
