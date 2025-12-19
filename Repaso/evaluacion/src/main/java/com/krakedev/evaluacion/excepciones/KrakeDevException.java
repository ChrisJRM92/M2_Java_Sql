package com.krakedev.evaluacion.excepciones;

public class KrakeDevException extends Exception {
	
	public KrakeDevException(String mensaje) {
        super(mensaje);
    }

    public KrakeDevException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
