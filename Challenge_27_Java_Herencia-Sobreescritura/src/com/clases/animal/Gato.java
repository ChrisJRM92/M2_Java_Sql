package com.clases.animal;

public class Gato extends Animal {

    @Override
    public void dormir(){
        System.out.println("El Gato esta dumiendo");
    }

    public void maullar(){
        System.out.println("Esta maullando");
    }

    public void maullar(String adjetivo) {
        System.out.println("Gato maullando " + adjetivo);
    }
}
