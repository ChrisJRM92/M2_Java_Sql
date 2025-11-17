import com.clases.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double multiplicacion = calculadora.multiplicar(3,4);
        double division = calculadora.dividir(3,4);
        double promedio = calculadora.promediar(3,4,2);
        calculadora.mostrarResultado();

        System.out.println("Respuesta multiplicacion: "+multiplicacion);
        System.out.println("Respuesta division: "+division);
        System.out.println("Respuesta promedio: "+promedio);


        }
    }
