package com.krakedev.evaluacion.test;

import java.util.ArrayList;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeDevException;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestRecuperarCategorias {
	  public static void main(String[] args) {
	        try {
	            ArrayList<Categoria> categorias = ServiciosCategoria.recuperarTodos();
	            for (Categoria c : categorias) {
	                System.out.println(
	                    "Id: " + c.getId() +
	                    " Nombre: " + c.getNombre()
	                );
	            }
	        } catch (KrakeDevException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
