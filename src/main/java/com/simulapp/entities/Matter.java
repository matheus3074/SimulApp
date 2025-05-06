package com.simulapp.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "matter")
public class Matter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "area_conhecimento")
    private String areaConhecimento;

    @OneToMany(mappedBy = "matter", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Questions> questions = new ArrayList<>();

    public Matter(String nome, String areaConhecimento) {
        this.nome = nome;
        this.areaConhecimento = areaConhecimento;
    }

    public Matter() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

}
