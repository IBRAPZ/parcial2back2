package com.example.parcial2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles_cine")
public class DetalleCine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String telefono;

    @Column(unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "cine_id", nullable = false, unique = true)
    private Cine cine;

    public DetalleCine() {}

    public DetalleCine(String telefono, String email) {
        this.telefono = telefono;
        this.email = email;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Cine getCine() { return cine; }
    public void setCine(Cine cine) { this.cine = cine; }
}
