package com.simulapp.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "simuladoResult")
public class SimuladoResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "acertos")
    private int acertos;

    @Column(name = "erros")
    private int erros;

    @Column(name = "nota_final")
    private double notaFinal;

    @Column(name = "data_realizacao")
    private Date dataRealizacao;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_users", referencedColumnName = "id", insertable = false, updatable = false)
    private Users users;

    @Column(name = "id_user")
    private int idUser;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_simulado", referencedColumnName = "id", insertable = false, updatable = false)
    private Simulado simulado;

    @Column(name = "id_simulado")
    private int idSimulado;

    public SimuladoResult(int acertos, int erros, double notaFinal, Date dataRealizacao, int idUser, int idSimulado) {
        this.acertos = acertos;
        this.erros = erros;
        this.notaFinal = notaFinal;
        this.dataRealizacao = dataRealizacao;
        this.idUser = idUser;
        this.idSimulado = idSimulado;
    }

    public SimuladoResult(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdSimulado() {
        return idSimulado;
    }

    public void setIdSimulado(int idSimulado) {
        this.idSimulado = idSimulado;
    }
}
