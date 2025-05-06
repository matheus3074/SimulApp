package com.simulapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "userAnswer")
public class UserAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "resposta_selecionada")
    private char respostaSelecionada;

    @Column(name = "correta")
    private boolean correta;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_users", referencedColumnName = "id", insertable = false, updatable = false)
    private Users users;

    @Column(name = "id_user")
    private int idUser;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_questions", referencedColumnName = "id", insertable = false, updatable = false)
    private Questions questions;

    @Column(name = "id_questions")
    private int idQuestions;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_simulado", referencedColumnName = "id", insertable = false, updatable = false)
    private Simulado simulado;

    @Column(name = "id_simulado")
    private int idSimulado;

    public UserAnswer(char respostaSelecionada, boolean correta, int idUser, int idQuestions, int idSimulado) {
        this.respostaSelecionada = respostaSelecionada;
        this.correta = correta;
        this.idUser = idUser;
        this.idQuestions = idQuestions;
        this.idSimulado = idSimulado;
    }

    public UserAnswer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getRespostaSelecionada() {
        return respostaSelecionada;
    }

    public void setRespostaSelecionada(char respostaSelecionada) {
        this.respostaSelecionada = respostaSelecionada;
    }

    public boolean isCorreta() {
        return correta;
    }

    public void setCorreta(boolean correta) {
        this.correta = correta;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdQuestions() {
        return idQuestions;
    }

    public void setIdQuestions(int idQuestions) {
        this.idQuestions = idQuestions;
    }

    public int getIdSimulado() {
        return idSimulado;
    }

    public void setIdSimulado(int idSimulado) {
        this.idSimulado = idSimulado;
    }
}
