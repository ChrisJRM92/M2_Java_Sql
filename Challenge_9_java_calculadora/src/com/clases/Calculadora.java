package com.clases;
public class Calculadora {
    private double valor1;
    private double valor2;

    private double dividendo;
    private double divisor;

    private double valorP1;
    private double valorP2;
    private double valorP3;

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    public void setValorP1(double valorP1) {
        this.valorP1 = valorP1;
    }

    public void setValorP2(double valorP2) {
        this.valorP2 = valorP2;
    }

    public void setValorP3(double valorP3) {
        this.valorP3 = valorP3;
    }

    public double multiplicar (){
        return this.valor1*this.valor2;
    }
    public double dividir (){
        return this.dividendo/this.divisor;
    }
    public double promediar (){
        return (this.valorP1+this.valorP2+this.valorP3)/3;
    }

    public static void mostrarResultado() {
        System.out.println("Ahorita no joven");
    }




}
