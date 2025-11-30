package krakedev.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class Curso {
    private ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(ArrayList<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }


    public String buscarEstudiantePorCedula(Estudiante estudiante) {
        Estudiante elemento;

        if (this.estudiante.size() != 0) {
            for (int i = 0; i < this.estudiante.size(); i++) {
                elemento = this.estudiante.get(i);

                if (elemento.getCedula().equals(estudiante.getCedula())) {
                    return "Estudiante ya está en el curso";
                }
            }
            return null;
        }
        return null;
    }

    public void matricularEstudiante(Estudiante estudiante) {
        String cedulaEncontrada;

        cedulaEncontrada = buscarEstudiantePorCedula(estudiante);

        if (cedulaEncontrada == null) {
            this.estudiante.add(estudiante);
        }
    }

    public double calcularPromedioCurso() {
        double promedio = 0;
        Estudiante elementoEncontrado;

        for (int i = 0; i < estudiante.size(); i++) {
            elementoEncontrado = estudiante.get(i);

            promedio += elementoEncontrado.calcularPromedioNotasEstudiante();
        }

        promedio = promedio / estudiante.size();

        return promedio;
    }

    public void mostrar() {
        Estudiante elemento;

        for (int i = 0; i < estudiante.size(); i++) {
            elemento = estudiante.get(i);

            for (int j = 0; j < elemento.getNotas().size(); j++) {
                System.out.println("Nombre: " + elemento.getNombre() + " Apellido: "
                        + elemento.getApellido() + " Cedula: " + elemento.getCedula() + " Materia: "
                        + elemento.getNotas().get(j).getMateria().getNombre() + " Calificacion: "
                        + elemento.getNotas().get(j).getCalificacion());
            }
        }

    }


}
