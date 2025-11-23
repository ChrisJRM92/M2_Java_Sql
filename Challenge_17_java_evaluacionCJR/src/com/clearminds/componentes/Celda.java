package com.clearminds.componentes;

public class Celda {
    private Producto producto;
    private int stock;
    private String codigo;

    public Celda(String codigo) {
        this.codigo = codigo;
    }

    public void ingresarProducto(Producto producto, int stock){
        this.stock = stock;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getStock() {
        return stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
