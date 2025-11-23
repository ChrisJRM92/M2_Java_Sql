package com.krakedev.clases;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(){
        if(this.precio<0){
            this.precio*=-1;
        }
    }

    public double calcularPrecioPromo(double porcentaje){
        this.precio = this.precio-(this.precio*porcentaje/100);
        return this.precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
