package com.cmc.evaluacion;

import com.cmc.entidades.Cuota;

public class CalculadoraAmortizacion {

    public static double calcularCuota(Prestamo prestamo){
        double interes = (prestamo.getInteres()/12)/100;
        double cuota = ((prestamo.getMonto() * interes))/(1 - Math.pow(1 + interes, -prestamo.getPlazo()));
        return cuota;

    }

    public static void generarTabla(Prestamo prestamo){
        double valorCuota = calcularCuota(prestamo);
        Cuota[] cuota = prestamo.getCuota();

        for (int i = 0; i < cuota.length; i++) {
            cuota[i] = new Cuota(i + 1);
            cuota[i].setCuota(valorCuota);
        }
        cuota[0].setInicio(prestamo.getMonto());
        CalculadoraAmortizacion calc = new CalculadoraAmortizacion();

        for (int i = 0; i < cuota.length; i++) {
            Cuota actual = cuota[i];
            Cuota siguiente = (i + 1 < cuota.length) ? cuota[i + 1] : null;

            calc.calcularValoresCuota(prestamo.getInteres(), actual, siguiente);
        }
    }

    public void calcularValoresCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente){
        double cuotaMensual = interes / 12 / 100;
        double valorInteres = cuotaActual.getInicio() * cuotaMensual;
        cuotaActual.setInteres(valorInteres);

        double abonoCapital = cuotaActual.getCuota() - valorInteres;
        cuotaActual.setAbonoDeCapital(abonoCapital);

        double saldo = cuotaActual.getInicio() - abonoCapital;

        if (cuotaSiguiente == null) {
            abonoCapital = cuotaActual.getInicio();
            cuotaActual.setAbonoDeCapital(abonoCapital);
            cuotaActual.setCuota(valorInteres + abonoCapital);
            saldo = 0;
        }
        cuotaActual.setSaldo(saldo);

        if (cuotaSiguiente != null) {
            cuotaSiguiente.setInicio(saldo);
        }
    }

    public static void mostrarTabla(Prestamo prestamo) {
        System.out.println("N.| Cuota  | Inicio | Interés | Abono Cap | Saldo");
        System.out.println("--|--------|--------|---------|-----------|-------");

        Cuota[] cuotas = prestamo.getCuota();

        for (int i = 0; i < cuotas.length; i++) {
            Cuota cuota = cuotas[i];
            cuota.mostrarPrestamo();
        }
    }
}
