package com.example.parcial2.mappers;

import com.example.parcial2.dto.CineDto;
import com.example.parcial2.entities.Cine;

public class CineMapper {
    public static Cine toEntity(CineDto dto) {
        if (dto == null) return null;
        Cine c = new Cine();
        c.setId(dto.getId());
        c.setNombre(dto.getNombre());
        c.setDireccion(dto.getDireccion());
        return c;
    }

    public static CineDto toDto(Cine ent) {
        if (ent == null) return null;
        return new CineDto(ent.getId(), ent.getNombre(), ent.getDireccion());
    }
}
