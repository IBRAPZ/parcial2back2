package com.example.parcial2.repositories;

import com.example.parcial2.entities.DetalleCine;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface DetalleCineRepository extends JpaRepository<DetalleCine, Long> {
    @Query("select d from DetalleCine d where d.email = :email")
    Optional<DetalleCine> findByEmail(@Param("email") String email);
}
