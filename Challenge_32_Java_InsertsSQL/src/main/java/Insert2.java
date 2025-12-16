import java.math.BigDecimal;
import java.sql.*;

public class Insert2 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        BigDecimal estatura = new BigDecimal("1.60");
        Date fechaNacimiento = Date.valueOf("1993-05-15");
        Time horaNacimiento = Time.valueOf("08:45:30");
        BigDecimal cantidadAhorrada = new BigDecimal("11250.50");
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/relaciones_db", "postgres", "12345");
            System.out.println("Conexion exitosa!");
            ps = connection.prepareStatement("insert into persona(cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)"+"values(?,?,?,?,?,?,?,?)");
            ps.setString(1, "070701119");
            ps.setString(2, "Sofia");
            ps.setString(3, "Romero");
            ps.setBigDecimal(4, estatura);
            ps.setDate(5, fechaNacimiento);
            ps.setTime(6, horaNacimiento);
            ps.setBigDecimal(7, cantidadAhorrada);
            ps.setInt(8, 3);

            ps.executeUpdate();
            System.out.println("Datos agregados correctamente...");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
