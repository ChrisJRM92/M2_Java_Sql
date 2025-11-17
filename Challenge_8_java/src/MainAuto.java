import com.clases.Auto;

public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        auto1.marca = "Chevrolet";
        auto1.anio = 2025;
        auto1.precio = 17990;

        auto2.marca = "Mazda";
        auto2.anio = 2025;
        auto2.precio = 18990;


        System.out.println("Marca: "+auto1.marca);
        System.out.println("Año: "+auto1.anio);
        System.out.println("Precio: "+auto1.precio);
        System.out.println("--------------------");
        System.out.println("Marca: "+auto2.marca);
        System.out.println("Año: "+auto2.anio);
        System.out.println("Precio: "+auto2.precio);
    }
}
