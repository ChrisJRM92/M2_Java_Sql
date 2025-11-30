package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private ArrayList<Nota> notas= new ArrayList<Nota>();

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public Estudiante(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.notas = new ArrayList<Nota>();
    }

    public void agregarNota(Nota nuevaNota){
        Nota elemento;
        boolean isRepeat = false;

        if(this.notas.size()==0){
            if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 0){
                this.notas.add(nuevaNota);
            }else {
                System.out.println("La calificacion debe ser entre 0-10");
            }
        }else {
            for (int i=0; i<this.notas.size(); i++){
                elemento = this.notas.get(i);
                if(nuevaNota.getMateria().getCodigo().equals(elemento.getMateria().getCodigo())){
                    isRepeat = true;
                    break;
                }
            }
        }

        if(isRepeat == false){
            if (nuevaNota.getCalificacion()>=0&&nuevaNota.getCalificacion()<=10){
                notas.add(nuevaNota);
            }else {
                System.out.println("Nota no valida, debe ser entre 0-10");
            }
        }else {
            System.out.println("Codigo de la materia repetido");
        }
    }

    public void modificarNota(String codigo, Nota nuevaNota){
        boolean codigoEncontrado = true;
        Nota elemento;

        for (int i = 0; i < this.notas.size(); i++) {
            elemento = this.notas.get(i);

            if (codigo.equals(elemento.getMateria().getCodigo())) {
                if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
                    elemento.setCalificacion(nuevaNota.getCalificacion());
                } else {
                    System.out.println("La nota debe ser 0-10");
                }
                break;
            }else {
                codigoEncontrado=false;
            }
        }

        if(codigoEncontrado==false) {
            System.out.println("No se encontro el codigo de la materia");
        }
    }

    public double calcularPromedioNotasEstudiante() {
        Nota elemento;
        double sumaNotas = 0;
        double promedio = 0;

        for (int i = 0; i < this.notas.size(); i++) {
            elemento = this.notas.get(i);

            sumaNotas += elemento.getCalificacion();
        }

        promedio = sumaNotas / this.notas.size();

        return promedio;
    }

    public void mostrar() {
        Nota elemento;

        for (int i = 0; i < this.notas.size(); i++) {
            elemento = this.notas.get(i);

            System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Cedula: " + cedula + " Materia: "
                    + elemento.getMateria().getNombre() + " Calificacion: " + elemento.getCalificacion());
        }

    }
}
