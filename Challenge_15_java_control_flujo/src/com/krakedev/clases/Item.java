package com.krakedev.clases;

public class Item {
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    public Item() {
        this.productosActuales = 20;
        this.productosDevueltos = 5;
        this.productosVendidos = 5;
    }

    public void imprimir(){
        System.out.println(this.productosActuales);
        System.out.println(this.productosDevueltos);
        System.out.println(this.productosVendidos);
    }

    public void vender(int cantidad){
        this.productosVendidos-=cantidad;
    }

    public void devolver(int cantidad){
        this.productosDevueltos +=cantidad;
    }

    public int getProductosActuales() {
        return productosActuales;
    }

    public int getProductosDevueltos() {
        return productosDevueltos;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }
}
