package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeDevException;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestActualizarCategoria {
	public static void main(String[] args) {
        Categoria categoria = new Categoria(1, "Bebidas y refrescos");
        try {
            ServiciosCategoria.actualizar(categoria);
            System.out.println("Categoría actualizada correctamente");

        } catch (KrakeDevException e) {
            System.out.println(e.getMessage());
        }
    }
}
