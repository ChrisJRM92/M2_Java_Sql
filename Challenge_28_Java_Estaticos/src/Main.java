import com.estaticos.entidades.Alarma;
import com.estaticos.logica.AdminAlarmas;
import com.estaticos.utils.DiaSemana;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Alarma alarma1 = new Alarma(DiaSemana.LUNES, 8, 20);
        Alarma alarma2 = new Alarma(DiaSemana.MARTES, 9, 30);
        Alarma alarma3 = new Alarma(DiaSemana.MIERCOLES, 10, 40);
        Alarma alarma4 = new Alarma(DiaSemana.JUEVES, 10, 40);

        AdminAlarmas agregar = new AdminAlarmas();
        agregar.agregarAlarma(alarma1);
        agregar.agregarAlarma(alarma2);
        agregar.agregarAlarma(alarma3);
        agregar.agregarAlarma(alarma4);

        ArrayList<Alarma> alarmasConfiguradas = agregar.getAlarmas();
        System.out.println(alarmasConfiguradas);
    }
}
