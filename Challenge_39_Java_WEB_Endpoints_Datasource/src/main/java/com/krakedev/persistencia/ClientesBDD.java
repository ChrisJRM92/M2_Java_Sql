package com.krakedev.persistencia;

import java.sql.Connection;

import com.krakedev.entidades.Cliente;
import com.krakedev.utils.conexionbdd;

public class ClientesBDD {
	public void insertar(Cliente cliente) {
		Connection con = conexionbdd.obtenerConexion();
		if(con != null) {
			System.out.println("Conectado");
		}else {
			System.out.println("Error al obtener conexion");
		}
	}

}
