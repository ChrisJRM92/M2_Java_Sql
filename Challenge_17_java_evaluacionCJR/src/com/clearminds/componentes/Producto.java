package com.clearminds.componentes;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void incrementarPrecio(int porcentaje){
        this.precio = ((100+porcentaje)*(this.precio))/100;
    }

    public void disminuirPrecio(double descuento){
        this.precio = this.precio-descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
