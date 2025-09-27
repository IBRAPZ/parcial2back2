package com.example.parcial2.services;

import org.springframework.stereotype.Service;
import com.example.parcial2.entities.DetalleCine;
import com.example.parcial2.repositories.DetalleCineRepository;

@Service
public class DetalleCineService {
    private final DetalleCineRepository repo;

    public DetalleCineService(DetalleCineRepository repo) {
        this.repo = repo;
    }

    public DetalleCine save(DetalleCine detalle) {
        return repo.save(detalle);
    }
}
