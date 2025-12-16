package com.servicios;

import com.entidades.Persona;

public class TestListarPorCedula {
    public static void main(String[] args) {
        try {
            Persona persona = AdminPersonas.buscarPorCedula("0705933588");
            System.out.println(persona);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
