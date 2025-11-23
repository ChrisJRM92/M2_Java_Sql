package com.krakedev.clases;

public class Validacion {
    public Boolean validarMonto(int monto){
        if(monto>=0){
            return true;
        }else{
            return false;
        }
    }
}
