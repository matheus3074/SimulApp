package com.simulapp.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "pergunta")
    private String pergunta;

    @Column(name = "alternativa")
    private char alternativa;

    @Column(name = "ano")
    private Date ano;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_simulado", referencedColumnName = "id", insertable = false, updatable = false)
    private Simulado simulado;

    @Column(name = "id_simulado")
    private int idSimulado;

    @OneToMany(mappedBy = "questions", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<UserAnswer> userAnswers = new ArrayList<>();

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_matter", referencedColumnName = "id", insertable = false, updatable = false)
    private Matter matter;

    @Column(name = "id_matter")
    private int idMatter;


    public Questions(String pergunta, char alternativa, Date ano, int idSimulado, int idMatter) {
        this.pergunta = pergunta;
        this.alternativa = alternativa;
        this.ano = ano;
        this.idSimulado = idSimulado;
        this.idMatter =idMatter;
    }

    public Questions(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public char getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(char alternativa) {
        this.alternativa = alternativa;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getIdSimulado() {
        return idSimulado;
    }

    public void setIdSimulado(int idSimulado) {
        this.idSimulado = idSimulado;
    }

    public int getIdMatter() {
        return idMatter;
    }

    public void setIdMatter(int idMatter) {
        this.idMatter = idMatter;
    }
}
