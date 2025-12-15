import com.clases.Calculadora;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public  void testSumar(){
        Calculadora c = new Calculadora();
        int resultado = c.sumar(5, 10);
        assert(resultado==15);
    }

    @Test
    public  void testRestar(){
        Calculadora c = new Calculadora();
        int resultado = c.restar(10, 5);
        assert(resultado==5);
    }
}
