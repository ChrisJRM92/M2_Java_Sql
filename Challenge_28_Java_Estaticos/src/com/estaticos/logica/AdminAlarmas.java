package com.estaticos.logica;

import com.estaticos.entidades.Alarma;

import java.util.ArrayList;

public class AdminAlarmas {
    private ArrayList<Alarma> alarmas = new ArrayList<>();

    public void agregarAlarma(Alarma alarma){
        alarmas.add(alarma);
    }

    public ArrayList<Alarma> getAlarmas() {
        return alarmas;
    }
}
