package com.servicios;

import com.entidades.Persona;
import com.utils.ConexionDB;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminPersonas {

    public static void insertarRegistro(Persona persona){
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
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
