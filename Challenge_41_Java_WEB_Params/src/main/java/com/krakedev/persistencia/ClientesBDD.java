package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.utils.conexionbdd;

public class ClientesBDD {
	public void insertar(Cliente cliente) throws KrakeDevException {
		Connection con = null;
		try {
			con = conexionbdd.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("insert into clientes(cedula, nombre, numerohijos) values(?,?,?)");
			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getnumerohijos());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al insertar el cliente");
		} catch (KrakeDevException e) {
			throw e;
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void actualizar(Cliente cliente) throws KrakeDevException {
		Connection con = null;
		try {
			con = conexionbdd.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("update clientes set nombre = ?, numerohijos = ? where cedula=?");
			
			ps.setString(1, cliente.getNombre());
		    ps.setInt(2, cliente.getnumerohijos());
		    ps.setString(3, cliente.getCedula());

		    ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			throw new KrakeDevException("Error al actualizar datos");
		}catch(KrakeDevException e) {
			throw e;
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<Cliente> recuperarTodos() throws KrakeDevException{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;
		try {
			con = conexionbdd.obtenerConexion();
			ps = con.prepareStatement("select cedula, nombre, numerohijos from clientes");
			rs = ps.executeQuery();
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numerohijos = rs.getInt("numerohijos");
				cliente = new Cliente(cedula, nombre, numerohijos);
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al obtener los datos SQL");
		}
		try {
			con = conexionbdd.obtenerConexion();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error en la consulta. Detalles: "+e.getMessage());
		}
		
		return clientes;
	}
	
	
	public Cliente buscarPorPk(String cedulaBusqueda) throws KrakeDevException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;
		try {
			con = conexionbdd.obtenerConexion();
			ps = con.prepareStatement("select cedula, nombre, numerohijos from clientes where cedula = ?");
			ps.setString(1, cedulaBusqueda);
			rs = ps.executeQuery();
			if(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numerohijos = rs.getInt("numerohijos");
				cliente = new Cliente(cedula, nombre, numerohijos);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al obtener los datos SQL");
		}
		try {
			con = conexionbdd.obtenerConexion();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error en la consulta. Detalles: "+e.getMessage());
		}
		
		return cliente;
	}
	
	public Cliente buscarPorHijos(int hijosBusqueda) throws KrakeDevException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;
		try {
			con = conexionbdd.obtenerConexion();
			ps = con.prepareStatement("select cedula, nombre, numerohijos from clientes where numerohijos >= ?");
			ps.setInt(1, hijosBusqueda);
			rs = ps.executeQuery();
			if(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numerohijos = rs.getInt("numerohijos");
				cliente = new Cliente(cedula, nombre, numerohijos);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al obtener los datos SQL");
		}
		try {
			con = conexionbdd.obtenerConexion();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error en la consulta. Detalles: "+e.getMessage());
		}
		
		return cliente;
	}


}
