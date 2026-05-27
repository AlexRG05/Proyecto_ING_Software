package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alexander Manuel
 */
public class Conexion {

    private static final String URL = "jdbc:sqlite:factory.db";

    public static Connection getConexion() {
        try {
            Connection con = DriverManager.getConnection(URL);
            Statement stmt = con.createStatement();
            
            // Magia: Creamos las tablas automáticamente si no existen
            stmt.execute("CREATE TABLE IF NOT EXISTS proyectos (id INTEGER PRIMARY KEY, nombre TEXT NOT NULL, descripcion TEXT)");
            stmt.execute("CREATE TABLE IF NOT EXISTS usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT NOT NULL, password TEXT NOT NULL)");
            
            return con;
            
        } catch (SQLException e) {
            System.out.println("Error de BD: " + e.getMessage());
            return null;
        }
    }
}
