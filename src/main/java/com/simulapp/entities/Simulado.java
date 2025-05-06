package com.simulapp.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "simulado")
public class Simulado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @OneToMany(mappedBy = "simulado", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<UserAnswer> userAnswers = new ArrayList<>();

    @OneToMany(mappedBy = "simulado", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Questions> questions = new ArrayList<>();

    @OneToMany(mappedBy = "simulado", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<SimuladoResult> simuladoResults = new ArrayList<>();

    public Simulado(String titulo, String descricao, Date dataCriacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }

    public Simulado(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
