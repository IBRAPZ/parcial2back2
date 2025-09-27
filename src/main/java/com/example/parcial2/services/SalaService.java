package com.example.parcial2.services;

import org.springframework.stereotype.Service;
import com.example.parcial2.entities.Sala;
import com.example.parcial2.repositories.SalaRepository;

@Service
public class SalaService {
    private final SalaRepository repo;

    public SalaService(SalaRepository repo) {
        this.repo = repo;
    }

    public Sala save(Sala sala) {
        return repo.save(sala);
    }
}
