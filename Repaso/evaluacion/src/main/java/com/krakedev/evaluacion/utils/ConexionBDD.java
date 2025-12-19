package com.krakedev.evaluacion.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.excepciones.KrakeDevException;

public class ConexionBDD {

    private static final Logger logger =LogManager.getLogger(ConexionBDD.class);
    private static final String URL ="jdbc:postgresql://localhost:5432/repasodb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";

    public static Connection conectar() throws KrakeDevException {

        logger.debug("obteniendo conexion");

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            logger.error("Error al conectar a la base de datos", e);
            throw new KrakeDevException("No se pudo establecer conexión", e);
        }
    }
}
