import com.clases.Auto;

public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        auto1.setMarca("Chevrolet");
        auto1.setAnio(2025);
        auto1.setPrecio(17990);

        auto2.setMarca("Mazda");
        auto2.setAnio(2025);
        auto2.setPrecio(18990);


        System.out.println("Marca: "+auto1.getMarca());
        System.out.println("Año: "+auto1.getAnio());
        System.out.println("Precio: "+auto1.getPrecio());
        System.out.println("--------------------");
        System.out.println("Marca: "+auto2.getMarca());
        System.out.println("Año: "+auto2.getAnio());
        System.out.println("Precio: "+auto2.getPrecio());
    }
}
