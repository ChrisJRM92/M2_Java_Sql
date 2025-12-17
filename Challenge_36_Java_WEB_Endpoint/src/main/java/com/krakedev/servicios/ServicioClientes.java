package com.krakedev.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("customers")
public class ServicioClientes {
	
	@Path("m1")
	@GET
	public String saludar() {
		return "Reto 36 completado";
	}
}
