import com.clases.Producto;

public class MainProducto {
    public static void main(String[] args) {
        Producto productoA = new Producto();
        Producto productoB = new Producto();
        Producto productoC = new Producto();

        //Producto A
        productoA.nombre = "Omeprazol";
        productoA.descripcion = "Dolor estomago";
        productoA.precio = 0.15f;
        productoA.stockActual = 50;

        //Producto B
        productoB.nombre = "Paracetamol";
        productoB.descripcion = "Dolor cuerpo";
        productoB.precio = 0.20f;
        productoB.stockActual = 100;

        //Producto C
        productoC.nombre = "Doluneurobion";
        productoC.descripcion = "Dolor cuerpo";
        productoC.precio = 0.25f;
        productoC.stockActual = 50;

        System.out.println("-------- Producto A --------");
        System.out.println("Nombre: "+productoA.nombre);
        System.out.println("Descripcion: "+productoA.descripcion);
        System.out.println("Precio: "+productoA.precio);
        System.out.println("Stock disponible: "+productoA.stockActual);

        System.out.println("-------- Producto B --------");
        System.out.println("Nombre: "+productoB.nombre);
        System.out.println("Descripcion: "+productoB.descripcion);
        System.out.println("Precio: "+productoB.precio);
        System.out.println("Stock disponible: "+productoB.stockActual);

        System.out.println("-------- Producto C --------");
        System.out.println("Nombre: "+productoC.nombre);
        System.out.println("Descripcion: "+productoC.descripcion);
        System.out.println("Precio: "+productoC.precio);
        System.out.println("Stock disponible: "+productoC.stockActual);
    }
}
