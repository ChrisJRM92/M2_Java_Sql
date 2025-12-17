package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {
	
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos(){
		ArrayList<Producto> productos = new ArrayList<>();
		
		Categoria cat1 = new Categoria(1, "Electrónicos");
	    Categoria cat2 = new Categoria(2, "Oficina");

	    productos.add(new Producto("P001", "Teclado", cat1, 25.50, 10));
	    productos.add(new Producto("P002", "Mouse", cat1, 12.00, 20));
	    productos.add(new Producto("P003", "Cuaderno", cat2, 3.50, 50));

	    return productos;
	}
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println(">>>>>> "+producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println(">>>>>> "+producto);
	}
}
