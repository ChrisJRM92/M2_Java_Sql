import com.clases.Producto;

public class MainProducto {
    public static void main(String[] args) {
        Producto productoA = new Producto();
        Producto productoB = new Producto();
        Producto productoC = new Producto();

        //Producto A
        productoA.setNombre("Omeprazol");
        productoA.setDescripcion("Dolor estomago");
        productoA.setPrecio(0.15f);
        productoA.setStockActual(50);

        //Producto B
        productoB.setNombre("Paracetamol");
        productoB.setDescripcion("Dolor cuerpo");
        productoB.setPrecio(0.20f);
        productoB.setStockActual(100);

        //Producto C
        productoC.setNombre("Doluneurobion");
        productoC.setDescripcion("Dolor cuerpo");
        productoC.setPrecio(0.25f);
        productoC.setStockActual(50);

        System.out.println("-------- Producto A --------");
        System.out.println("Nombre: "+productoA.getNombre());
        System.out.println("Descripcion: "+productoA.getDescripcion());
        System.out.println("Precio: "+productoA.getPrecio());
        System.out.println("Stock disponible: "+productoA.getStockActual());

        System.out.println("-------- Producto B --------");
        System.out.println("Nombre: "+productoB.getNombre());
        System.out.println("Descripcion: "+productoB.getDescripcion());
        System.out.println("Precio: "+productoB.getPrecio());
        System.out.println("Stock disponible: "+productoB.getStockActual());

        System.out.println("-------- Producto C --------");
        System.out.println("Nombre: "+productoC.getNombre());
        System.out.println("Descripcion: "+productoC.getDescripcion());
        System.out.println("Precio: "+productoC.getPrecio());
        System.out.println("Stock disponible: "+productoC.getStockActual());
    }
}
