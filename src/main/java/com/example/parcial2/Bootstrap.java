package com.example.parcial2;

import com.example.parcial2.dto.CineDto;
import com.example.parcial2.entities.DetalleCine;
import com.example.parcial2.entities.Sala;
import com.example.parcial2.services.CineService;
import com.example.parcial2.services.DetalleCineService;
import com.example.parcial2.services.SalaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bootstrap {
    @Bean
    CommandLineRunner run(CineService cs, DetalleCineService ds, SalaService ss) {
        return args -> {
            CineDto dto = new CineDto(null, "Cinema Nova", "Calle 123");
            var saved = cs.save(dto);
            System.out.println("Saved cine id: " + saved.getId());

            DetalleCine d = new DetalleCine("555-1234", "contacto@nova.com");
            d.setCine(saved);
            ds.save(d);

            Sala s = new Sala("Sala 1", 120);
            s.setCine(saved);
            ss.save(s);
        };
    }
}
