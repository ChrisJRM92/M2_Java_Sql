package com.cmc.entidades;

import com.cmc.evaluacion.Utilitario;

public class Cuota {
    private int numero;
    private double cuota;
    private double capital;
    private double inicio;
    private double interes;
    private double abonoDeCapital;
    private double saldo;

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInicio() {
        return inicio;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAbonoDeCapital() {
        return abonoDeCapital;
    }

    public void setAbonoDeCapital(double abonoDeCapital) {
        this.abonoDeCapital = abonoDeCapital;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuota(int numero) {
        this.numero = numero;
    }

    public void mostrarPrestamo(){
        Utilitario utilitario = new Utilitario();
        this.cuota = utilitario.redondear(this.cuota);
        this.capital = utilitario.redondear(this.capital);
        this.inicio = utilitario.redondear(this.inicio);
        this.interes = utilitario.redondear(this.interes);
        this.abonoDeCapital= utilitario.redondear(this.abonoDeCapital);
        this.saldo = utilitario.redondear(this.saldo);
        System.out.println(this.numero+" | "+this.cuota+" | "+this.inicio+" | "+this.interes+" | "+this.abonoDeCapital+" | "+this.saldo);
    }
}
