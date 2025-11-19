package com.clases;

public class Rectangulo {
    public double base;
    public double altura;

    public double calcularPerimetro(){
        double perimetro = (2*base)+(2*altura);
        return perimetro;
    }
}
