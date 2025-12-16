package com.servicios;

import com.entidades.Persona;

import java.util.ArrayList;

public class TestListarTodo {
    public static void main(String[] args) {
        try {
            ArrayList<Persona> personas = AdminPersonas.listarTodos();
            System.out.println(personas);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
