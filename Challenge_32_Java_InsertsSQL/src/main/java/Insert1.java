import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class Insert1 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        BigDecimal estatura = new BigDecimal("1.75");
        Date fechaNacimiento = Date.valueOf("1992-02-28");
        Time horaNacimiento = Time.valueOf("14:35:00");
        BigDecimal cantidadAhorrada = new BigDecimal("1250.50");
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/relaciones_db", "postgres", "12345");
            System.out.println("Conexion exitosa!");
            ps = connection.prepareStatement("insert into persona(cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)"+"values(?,?,?,?,?,?,?,?)");
            ps.setString(1, "0705933588");
            ps.setString(2, "Christian");
            ps.setString(3, "Romero");
            ps.setBigDecimal(4, estatura);
            ps.setDate(5, fechaNacimiento);
            ps.setTime(6, horaNacimiento);
            ps.setBigDecimal(7, cantidadAhorrada);
            ps.setInt(8, 2);

            ps.executeUpdate();
            System.out.println("Datos agregados correctamente...");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
