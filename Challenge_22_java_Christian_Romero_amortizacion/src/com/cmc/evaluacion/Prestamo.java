package com.cmc.evaluacion;

import com.cmc.entidades.Cuota;

import java.util.ArrayList;

public class Prestamo {
    private double monto;
    private double interes;
    private int plazo;
    private Cuota[] cuota;

    public Prestamo(double monto, double interes, int plazo) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
        this.cuota = new Cuota[plazo];
    }

    public Cuota[] getCuota() {
        return cuota;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
}
