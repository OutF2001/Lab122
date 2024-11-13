package com.tecsup.petclinic.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "specialties")
@Data
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String office;
    @Column(name = "h_open")
    private int hOpen;
    @Column(name = "h_close")
    private int hClose;

    public Specialty() {}

    public Specialty(Integer id, String name, String office, int hOpen, int hClose) {
        super();
        this.id = id;
        this.name = name;
        this.office = office;
        this.hOpen = hOpen;
        this.hClose = hClose;
    }

    public Specialty(String name, String office, int hOpen, int hClose) {
        super();
        this.name = name;
        this.office = office;
        this.hOpen = hOpen;
        this.hClose = hClose;
    }
}
