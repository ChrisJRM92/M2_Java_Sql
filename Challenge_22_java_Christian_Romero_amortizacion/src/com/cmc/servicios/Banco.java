package com.cmc.servicios;

import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Prestamo> prestamos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente buscarCliente(String cedula){
        for(Cliente c: clientes){
            if(cedula.equals(c.getCedula())){
                return c;
            }
        }
        return null;
    }

    public void registrarClientes(Cliente cliente){
        boolean encontrado = false;
        for(Cliente c: clientes){
            if(buscarCliente(cliente.getCedula()) != null){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            encontrado = false;
            System.out.println("Cliente ya existe: "+ cliente.getCedula());
        }else {
            this.clientes.add(cliente);
        }
    }

    public void asignarPrestamo(String cedula, Prestamo prestamo){
        Cliente c = buscarCliente(cedula);
        if (c == null) {
            System.out.println("no es cliente del banco");
            return;
        }
        prestamo.setCedula(cedula);
        CalculadoraAmortizacion.generarTabla(prestamo);
        prestamos.add(prestamo);
    }

    public ArrayList<Prestamo> buscarPrestamos(String cedula){
        ArrayList<Prestamo> prestamosCliente = new ArrayList<Prestamo>();
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getCedula().equals(cedula)) {
                prestamosCliente.add(prestamos.get(i));
            }
        }

        if (prestamosCliente.isEmpty()) {
            return null;
        }
        return prestamosCliente;
    }
}
