package com.servicios;

import com.entidades.EstadoCivil;
import com.entidades.Persona;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class TestActualizar {
    public static void main(String[] args) {
        EstadoCivil ec = new EstadoCivil("C", "Casado");

        Persona persona = new Persona(
                "0705933588",
                "Christian",
                "Romero Actualizado",
                1.78,
                Date.valueOf("1992-02-28"),
                Time.valueOf("09:15:00"),
                BigDecimal.valueOf(3000.00),
                ec,
                3
        );

        AdminPersonas.actualizar(persona);
        System.out.println("Persona actualizada correctamente");
    }
}
