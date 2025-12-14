import com.clases.cuentas.Cuenta;
import com.clases.cuentas.Persona;

public class Main_Persona {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("001-12345", 500.75);
        Persona persona = new Persona("Carlos", cuenta);

        System.out.println(persona);
    }
}
