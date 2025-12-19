package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeDevException;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestBuscarCategoria {
	public static void main(String[] args) {

        try {
            Categoria c = ServiciosCategoria.buscarPorId("1");

            if (c != null) {
                System.out.println("Id: " + c.getId() +" Nombre: " + c.getNombre()
                );
            } else {
                System.out.println("No existe la categoría buscada");
            }

        } catch (KrakeDevException e) {
            System.out.println(e.getMessage());
        }
    }
}
