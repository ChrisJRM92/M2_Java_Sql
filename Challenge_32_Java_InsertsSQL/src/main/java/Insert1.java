import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert1 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/relaciones_db", "postgres", "12345");
            System.out.println("Conexion exitosa!");
            ps = connection.prepareStatement("insert into clientes(cedula, nombre, apellido)"+"values(?,?,?)");
            ps.setString(1, "070107112");
            ps.setString(2, "Sofia");
            ps.setString(3, "Romero");
            //ps.setInt();
            //ps.setDouble();

            ps.executeUpdate();
            System.out.println("Datos agregados...");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
