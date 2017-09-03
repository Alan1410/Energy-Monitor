package com.ems.model;

import java.sql.Timestamp;

/**
 *
 * @author Alan
 */
public class Eletric 
    extends 
        Core<Eletric>
{
    private double corrente;
    private double tensao;
    private double fatorPotencia;
    private Timestamp dataRegistro;

    public double getCorrente() {
        return corrente;
    }

    public void setCorrente(double corrente) {
        this.corrente = corrente;
    }

    public double getTensao() {
        return tensao;
    }

    public void setTensao(double tensao) {
        this.tensao = tensao;
    }

    public double getFatorPotencia() {
        return fatorPotencia;
    }

    public void setFatorPotencia(double fatorPotencia) {
        this.fatorPotencia = fatorPotencia;
    }

    public Timestamp getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Timestamp dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}