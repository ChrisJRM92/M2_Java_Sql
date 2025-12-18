package com.krakedev.entidades;

public class Cliente {
	private String cedula;
	private String nombre;
	private int numerohijos;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String cedula, String nombre, int numerohijos) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.numerohijos = numerohijos;
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
	public int getnumerohijos() {
		return numerohijos;
	}
	public void setnumerohijos(int numerohijos) {
		this.numerohijos = numerohijos;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", numerohijos=" + numerohijos + "]";
	}


	
	
}
