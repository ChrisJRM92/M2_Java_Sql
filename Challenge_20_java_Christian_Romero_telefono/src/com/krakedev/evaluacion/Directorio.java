package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    private Date fechaModificacion;

    public boolean agregarContacto(Contacto contacto){
        if (buscarPorCedula(contacto.getCedula()) != null) {
            return false;
        }
        this.contactos.add(contacto);
        return true;
    }

    public Contacto buscarPorCedula(String cedula){
        if(this.contactos.size()>=0){
            for(Contacto c: contactos){
                if(c.getCedula().equals(cedula)){
                    return c;
                }
            }
        }
        return null;
    }
}
