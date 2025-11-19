import com.clases.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setValor1(3);
        calculadora.setValor2(4);
        calculadora.setDividendo(3);
        calculadora.setDivisor(4);
        calculadora.setValorP1(3);
        calculadora.setValorP2(4);
        calculadora.setValorP3(2);
        double multiplicacion = calculadora.multiplicar();
        double division = calculadora.dividir();
        double promedio = calculadora.promediar();
        calculadora.mostrarResultado();

        System.out.println("Respuesta multiplicacion: "+multiplicacion);
        System.out.println("Respuesta division: "+division);
        System.out.println("Respuesta promedio: "+promedio);


        }
    }
