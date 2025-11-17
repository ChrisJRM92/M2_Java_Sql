package com.clases;
public class Calculadora {
    public double multiplicar (double valor1, double valor2){
        return valor1*valor2;
    }
    public double dividir (double dividiendo, double divisor){
        return dividiendo/divisor;
    }
    public double promediar (double valor1, double valor2, double valor3){
        return (valor1+valor2+valor3)/3;
    }

    public static void mostrarResultado() {
        System.out.println("Ahorita no joven");
    }
}
