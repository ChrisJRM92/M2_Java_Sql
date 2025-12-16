package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/javasql";
    private static final String USER = "postgres";
    private static final String PASS = "12345";

    public static Connection conectar() throws Exception{
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection= DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new Exception("Error en la infraestructura");
        } catch (SQLException e){
            e.printStackTrace();
            throw new Exception("Error, credenciales incorrectas");
        }
        return connection;
    }
}
