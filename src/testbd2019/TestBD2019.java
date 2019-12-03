/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbd2019;

// Descargado de
// https://dev.mysql.com/downloads/connector/j/5.1.html
import java.sql.*;

/**
 *
 * @author meschoyez
 */
public class TestBD2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Valores por defecto
        // ej. "jdbc:mysql://172.18.0.91:3306/prueba"
        String url = "jdbc:mysql://172.18.0.91:3306/";
        String nombre = "prueba" ;
//        String nombre = "euro2012" ;
        String user = "111mil";
        String pass = "111mil";
        try {
            // Objeto que maneja la conexion con el servidor BD
            //  - Requiere .jar en Libraries -
            Connection con = DriverManager.getConnection(url + nombre, user, pass);
            // Objeto que maneja las consultas SQL
            Statement stmt = con.createStatement();
            
            // executeUpdate() permite las consultas para modificar la BD
//            stmt.executeUpdate("CREATE TABLE razas (id INT unsigned NOT NULL AUTO_INCREMENT, nombre VARCHAR(150) NOT NULL, raza VARCHAR(150) NOT NULL, PRIMARY KEY (id))");
//            stmt.executeUpdate("CREATE TABLE comida (id INT unsigned NOT NULL AUTO_INCREMENT, nombre VARCHAR(150) NOT NULL, raza VARCHAR(150) NOT NULL, PRIMARY KEY (id))");
//            stmt.executeUpdate("INSERT INTO razas (nombre, raza) VALUES ('Chatran','gato chino'), ('Mickey','raton'), ('Benji','Callejero') , ('Lassie', 'Collie')");
//            stmt.executeUpdate("INSERT INTO razas (nombre, raza) VALUES ('Pipo','golden')");
//            stmt.executeUpdate("INSERT INTO comida (nombre, raza) VALUES ('Dog Chow','perro')");
//            stmt.executeUpdate("INSERT INTO comida SET nombre='Gatti', raza='gato'");

            //String col = "nombre";
            // executeQuery() permite las consultas de informacion en la BD
            ResultSet rs;
//            rs = stmt.executeQuery("SELECT raza, nombre FROM razas");
            rs = stmt.executeQuery("SELECT nombre, raza FROM comida");
//            rs = stmt.executeQuery("SELECT matchid, player FROM goal WHERE teamid = 'GER'");
//            rs = stmt.executeQuery("SELECT id, stadium, team1, team2 FROM game WHERE id=10  12");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2));
//                System.out.println(rs.getString("nombre") + "\t" + rs.getString("raza"));
//                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
//                System.out.println(rs.getString(col));
            }
            // Cierre de la conexion
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
