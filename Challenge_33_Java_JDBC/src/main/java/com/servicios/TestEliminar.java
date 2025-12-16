package com.servicios;

public class TestEliminar {
    public static void main(String[] args) {
        String cedula = "0705933588";
        AdminPersonas.eliminar(cedula);
        System.out.println("Persona "+cedula+" eliminada correctamente");
    }
}
