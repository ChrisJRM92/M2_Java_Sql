package com.servicios;

import com.entidades.EstadoCivil;
import com.entidades.Persona;
import com.utils.ConexionDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminPersonas {
    private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

    //Crear
    public static void insertarRegistro(Persona persona) throws Exception{
        Connection connection = null;
        PreparedStatement ps;

        try{
            connection = ConexionDB.conectar();
            ps = connection.prepareStatement("insert into persona(cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, estado_civil, numero_hijos)"+"values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, persona.getCedula());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.setBigDecimal(4, BigDecimal.valueOf(persona.getEstatura()));
            ps.setDate(5, new java.sql.Date(persona.getFechaNacimiento().getTime()));
            ps.setTime(6, new java.sql.Time(persona.getHoraNacimiento().getTime()));
            ps.setBigDecimal(7, persona.getCantidadAhorrada());
            ps.setString(8, persona.getEstadoCivil().getCodigo());
            ps.setInt(9, 2);
            ps.executeUpdate();

        }catch (Exception e){
            LOGGER.error("Error al insertar datos", e);
            throw new Exception("Error al insertar datos");
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }
    }

    //Actualizar
    public static void actualizar(Persona persona) {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = ConexionDB.conectar();

            ps = connection.prepareStatement(
                    "UPDATE persona SET " +
                            "nombre = ?, " +
                            "apellido = ?, " +
                            "estatura = ?, " +
                            "fecha_nacimiento = ?, " +
                            "hora_nacimiento = ?, " +
                            "cantidad_ahorrada = ?, " +
                            "estado_civil = ?, " +
                            "numero_hijos = ? " +
                            "WHERE cedula = ?"
            );

            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setBigDecimal(3, BigDecimal.valueOf(persona.getEstatura()));
            ps.setDate(4, new java.sql.Date(persona.getFechaNacimiento().getTime()));
            ps.setTime(5, new java.sql.Time(persona.getHoraNacimiento().getTime()));
            ps.setBigDecimal(6, persona.getCantidadAhorrada());
            ps.setString(7, persona.getEstadoCivil().getCodigo());
            ps.setInt(8, persona.getNumeroHijos());
            ps.setString(9, persona.getCedula());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //Eliminar
    public static void eliminar(String cedula) {

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = ConexionDB.conectar();

            ps = connection.prepareStatement(
                    "DELETE FROM persona WHERE cedula = ?"
            );

            ps.setString(1, cedula);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //Listar (Por nombre)
    public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception {
        ArrayList<Persona> personas = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            connection = ConexionDB.conectar();
            ps=connection.prepareStatement("select * from persona where nombre like ?");
            ps.setString(1, "%"+nombreBusqueda+"%");
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                String cedula = resultSet.getString("cedula");
                String nombre = resultSet.getString("nombre");
                Persona p = new Persona();
                p.setCedula(cedula);
                p.setNombre(nombre);
                personas.add(p);
            }

        }catch (Exception e){
            LOGGER.error("Error al consultar por nombre", e);
            throw new Exception("Error al consultar por nombre");
        }finally {
            try{
                if( connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }

        return personas;
    }

    //Listar (Por clave primaria)
    public static Persona buscarPorCedula(String cedulaBusqueda) throws Exception {

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        Persona persona = null;

        try {
            connection = ConexionDB.conectar();

            ps = connection.prepareStatement(
                    "SELECT cedula, nombre FROM persona WHERE cedula = ?"
            );

            ps.setString(1, cedulaBusqueda);
            resultSet = ps.executeQuery();

            if (resultSet.next()) {
                persona = new Persona();
                persona.setCedula(resultSet.getString("cedula"));
                persona.setNombre(resultSet.getString("nombre"));
            }

        } catch (Exception e) {
            LOGGER.error("Error al consultar por cédula", e);
            throw new Exception("Error al consultar por cédula");
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }

        return persona;
    }

    //Listar todos
    public static ArrayList<Persona> listarTodos() throws Exception {

        ArrayList<Persona> personas = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            connection = ConexionDB.conectar();

            ps = connection.prepareStatement(
                    "SELECT cedula, nombre FROM persona"
            );

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Persona p = new Persona();
                p.setCedula(resultSet.getString("cedula"));
                p.setNombre(resultSet.getString("nombre"));
                personas.add(p);
            }

        } catch (Exception e) {
            LOGGER.error("Error al listar personas", e);
            throw new Exception("Error al listar personas");
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }

        return personas;
    }


}
