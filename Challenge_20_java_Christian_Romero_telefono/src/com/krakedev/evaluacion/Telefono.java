package com.krakedev.evaluacion;

public class Telefono {
    private String numero;
    private String tipo;
    private String estado;

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public Telefono(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = "E";
        if(numero != null && tipo != null){
            if(tipo.equals("Movil") || tipo.equals("Convencional")){
                if(tipo.equals("Movil")){
                    if(numero.length() == 10){
                        this.numero = numero;
                        this.tipo = tipo;
                        this.estado = "C";
                    }
                }
                if(tipo.equals("Convencional")){
                    if(numero.length() == 7){
                        this.numero = numero;
                        this.tipo = tipo;
                        this.estado = "C";
                    }
                }
            }

        }
    }
}
