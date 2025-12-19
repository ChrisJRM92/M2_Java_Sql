package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.excepciones.KrakeDevException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class TestConexionBDD {
	public static void main(String[] args) {
        try {
            ConexionBDD.conectar();
            System.out.println("Conexión exitosa");
        } catch (KrakeDevException e) {
            System.out.println(e.getMessage());
        }
    }
}
