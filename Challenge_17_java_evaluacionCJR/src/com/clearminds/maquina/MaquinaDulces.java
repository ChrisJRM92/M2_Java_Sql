package com.clearminds.maquina;

import com.clearminds.componentes.Celda;

public class MaquinaDulces {
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo;

    public void configurarMaquina(String code1, String code2, String code3, String code4){
        this.celda1.setCodigo(code1);
        this.celda2.setCodigo(code2);
        this.celda3.setCodigo(code3);
        this.celda4.setCodigo(code4);


    }

}
