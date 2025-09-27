package com.example.parcial2.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cines")
public class Cine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String direccion;

    @OneToOne(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true)
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sala> salas;

    public Cine() {}

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public DetalleCine getDetalle() { return detalle; }
    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
        if (detalle != null) detalle.setCine(this);
    }
    public List<Sala> getSalas() { return salas; }
    public void setSalas(List<Sala> salas) {
        this.salas = salas;
        if (salas != null) salas.forEach(s -> s.setCine(this));
    }
}
