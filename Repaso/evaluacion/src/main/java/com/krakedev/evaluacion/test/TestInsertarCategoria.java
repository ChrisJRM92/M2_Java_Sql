package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeDevException;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestInsertarCategoria {
	public static void main(String[] args) {
		
		//Ojo autoinclemental
        Categoria categoria = new Categoria("Limpieza");

        try {
            ServiciosCategoria.insertar(categoria);
            System.out.println("Categoría insertada correctamente");

        } catch (KrakeDevException e) {
            System.out.println(e.getMessage());
        }
    }
	

}
