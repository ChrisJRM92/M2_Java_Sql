package com.servicios;

import com.entidades.EstadoCivil;
import com.entidades.Persona;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class TestCrear {
    public static void main(String[] args) throws Exception {
        EstadoCivil ec = new EstadoCivil("U", "Union Libre");
        Persona p = new Persona(
                "0705933588",
                "Christian",
                "Romero",
                1.75,
                Date.valueOf("1992-02-28"),
                Time.valueOf("08:25:30"),
                BigDecimal.valueOf(1250.50),
                ec,
                2
        );
        AdminPersonas.insertarRegistro(p);
        System.out.println("Persona creada correctamente");
    }
}
