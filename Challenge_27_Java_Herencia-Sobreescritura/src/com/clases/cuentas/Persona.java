package com.clases.cuentas;

public class Persona {
    private String nombre;
    private Cuenta cuenta;

    public Persona(String nombre, Cuenta cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', cuenta=" + cuenta + "}";
    }
}
