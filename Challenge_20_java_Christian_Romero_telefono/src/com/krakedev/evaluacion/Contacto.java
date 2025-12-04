package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
    private String cedula;
    private String nombre;
    private String apellido;
    private ArrayList<Telefono> telefonos = new ArrayList<>();
    private Direccion direccion;

    public Contacto(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public void imprimir(){
        System.out.println("Cedula: "+this.cedula);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Direccion: ");
        if(direccion != null && direccion != null){
            System.out.println("   Calle principal: "+direccion.getCallePrincipal());
            System.out.println("   Calle secundaria: "+direccion.getCalleSecundaria());
        }else {
            System.out.println("   No tiene asociada una direccion");
        }
    }

    public void agregarTelefono(Telefono telefono){
            this.telefonos.add(telefono);
    }

    public void mostrarTelefonos(){
        if(telefonos.size() >= 0){
            System.out.println("Telefonos con estado 'C': ");
            for (Telefono t: telefonos){
                if(t.getEstado().equals("C")){
                    System.out.println("Numero: "+t.getNumero()+", "+ "Tipp: "+t.getTipo());
                }
            }
        }
    }

    public ArrayList<Telefono> recuperarIncorrectos(){
        ArrayList<Telefono> incorrectos = new ArrayList<>();

        if(telefonos.size()>=0){
            for(Telefono t: telefonos){
                if(t.getEstado().equals("E")){
                    incorrectos.add(t);
                }
            }
        }
        return incorrectos;
    }
}
