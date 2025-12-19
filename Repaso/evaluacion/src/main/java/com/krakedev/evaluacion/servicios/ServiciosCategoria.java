package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeDevException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class ServiciosCategoria {
	
	//Insertar
	public static void insertar(Categoria categoria) throws KrakeDevException {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement("INSERT INTO categorias (nombre) VALUES (?)");
            ps.setString(1, categoria.getNombre());
            ps.executeUpdate();

        } catch (KrakeDevException e) {
            throw e;

        } catch (Exception e) {
            throw new KrakeDevException("Error al insertar la categoría", e);

        } finally {
            try { if (ps != null) ps.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }
	
	//Actualizar
	public static void actualizar(Categoria categoria) throws KrakeDevException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement("UPDATE categorias SET nombre = ? WHERE id = ?");
            ps.setString(1, categoria.getNombre());
            ps.setInt(2, categoria.getId());
            ps.executeUpdate();

        } catch (KrakeDevException e) {
            throw e;

        } catch (Exception e) {
            throw new KrakeDevException("Error al actualizar la categoría", e);

        } finally {
            try { if (ps != null) ps.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }
	
	//Buscar por id
	public static Categoria buscarPorId(String id) throws KrakeDevException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            int idCategoria = Integer.parseInt(id);

            con = ConexionBDD.conectar();
            ps = con.prepareStatement("SELECT id, nombre FROM categorias WHERE id = ?");
            ps.setInt(1, idCategoria);
            rs = ps.executeQuery();

            if (rs.next()) {
                Categoria c = new Categoria();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                return c;
            }
            return null;

        } catch (KrakeDevException e) {
            throw e;

        } catch (Exception e) {
            throw new KrakeDevException("Error al encontrr la categoría", e);

        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (ps != null) ps.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }
	
	public static ArrayList<Categoria> recuperarTodos() throws KrakeDevException {

        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT id, nombre FROM categorias";

        try (
            Connection con = ConexionBDD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        ) {

            while (rs.next()) {
                Categoria c = new Categoria(
                    rs.getInt("id"),
                    rs.getString("nombre")
                );
                categorias.add(c);
            }

        } catch (KrakeDevException e) {
            throw e;
        } catch (Exception e) {
            throw new KrakeDevException("Error al recuperar categorías", e);
        }

        return categorias;
    }
	
}
