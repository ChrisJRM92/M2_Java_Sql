package com.servicios;

import com.entidades.Persona;

import java.util.ArrayList;

public class TestListar {
    public static void main(String[] args) {
        try {
            ArrayList<Persona> personas = AdminPersonas.buscarPorNombre("a");
            System.out.println(personas);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
