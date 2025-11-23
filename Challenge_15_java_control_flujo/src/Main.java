import com.krakedev.clases.Estudiante;
import com.krakedev.clases.Item;
import com.krakedev.clases.Producto;
import com.krakedev.clases.Validacion;

public class Main {
    public static void main(String[] args) {
        Validacion val = new Validacion();
        Boolean var = val.validarMonto(-1);
        System.out.println("El estado es: "+var);
        System.out.println("----------------------------------");
        Estudiante est = new Estudiante("Sofia");
        System.out.println(est.getNombre());
        est.calificar(8);
        System.out.println("Estado: "+est.getResultado());
        System.out.println("----------------------------------");
        Producto pro = new Producto("Chocolate", -5.50);
        pro.setPrecio();
        System.out.println(pro.getPrecio());
        pro.calcularPrecioPromo(10);
        System.out.println(pro.getPrecio());
        System.out.println("----------------------------------");
        Item item = new Item();
        System.out.println(item.getProductosActuales());
        System.out.println(item.getProductosDevueltos());
        System.out.println(item.getProductosVendidos());


    }
}