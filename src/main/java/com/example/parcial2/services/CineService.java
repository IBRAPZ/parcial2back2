package com.example.parcial2.services;

import org.springframework.stereotype.Service;
import com.example.parcial2.repositories.CineRepository;
import com.example.parcial2.dto.CineDto;
import com.example.parcial2.entities.Cine;
import com.example.parcial2.mappers.CineMapper;

@Service
public class CineService {
    private final CineRepository repo;

    public CineService(CineRepository repo) {
        this.repo = repo;
    }

    public Cine save(CineDto dto) {
        Cine entity = CineMapper.toEntity(dto);
        return repo.save(entity);
    }
}
