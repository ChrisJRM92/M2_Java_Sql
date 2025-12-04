package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    private Date fechaModificacion;

    public Directorio() {
        this.contactos = new ArrayList<>();
    }

    public boolean agregarContacto(Contacto contacto){
        if (buscarPorCedula(contacto.getCedula()) != null) {
            return false;
        }
        this.contactos.add(contacto);
        this.fechaModificacion = new Date();
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

    public String consultarUltimaModificacion(){
        if (this.fechaModificacion == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(this.fechaModificacion);
    }

    public int contarPerdidos(){
        int perdidos = 0;
        for(Contacto c: contactos){
            if(c.getDireccion()==null){
                perdidos+=1;
            }
        }
        return perdidos;
    }
}
