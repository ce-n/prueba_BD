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
//       String nombre = "euro2012" ;
        //String nombre = "practicos";
        String user = "111mil";
        String pass = "111mil";
        try {
            // Objeto que maneja la conexion con el servidor BD
            //  - Requiere .jar en Libraries -
            Connection con = DriverManager.getConnection(url+nombre, user, pass);
            // Objeto que maneja las consultas SQL
            Statement stmt = con.createStatement();
            
            // executeUpdate() permite las consultas para modificar la BD
//            stmt.executeUpdate("CREATE TABLE razas (id INT unsigned NOT NULL AUTO_INCREMENT, nombre VARCHAR(150) NOT NULL, raza VARCHAR(150) NOT NULL, PRIMARY KEY (id))");
//            stmt.executeUpdate("CREATE TABLE comida (id INT unsigned NOT NULL AUTO_INCREMENT, nombre VARCHAR(150) NOT NULL, raza VARCHAR(150) NOT NULL, PRIMARY KEY (id))");
//            stmt.executeUpdate("INSERT INTO razas (nombre, raza) VALUES ('Chatran','gato chino'), ('Mickey','raton'), ('Benji','Callejero') , ('Lassie', 'Collie')");
//            stmt.executeUpdate("INSERT INTO razas (nombre, raza) VALUES ('Pipo','golden')");
//            stmt.executeUpdate("INSERT INTO comida (nombre, raza) VALUES ('Dog Chow','perro')");
//            stmt.executeUpdate("INSERT INTO comida SET nombre='Gatti', raza='gato'");
 //           stmt.executeUpdate("ALTER TABLE comida DROP COLUMN precio");
 //           stmt.executeUpdate("ALTER TABLE comida ADD COLUMN precio INT");
 //           stmt.executeUpdate("UPDATE comida SET precio=600 WHERE nombre= 'Dog Chow'" );
 //           stmt.executeUpdate("UPDATE comida SET precio=450 WHERE id=2");
 //           stmt.executeUpdate("UPDATE comida SET precio=300 WHERE id=3");
        //    stmt.executeUpdate("CREATE TABLE productos (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR (150), descripcion VARCHAR(500), PRIMARY KEY (id))");
        //    stmt.executeUpdate("INSERT INTO productos VALUES (1, 'pelota', 'juguete para perros')");
        //    stmt.executeUpdate("INSERT INTO productos VALUES (2, 'recipiente', 'recipiente para alimento')");
        //stmt.executeUpdate("ALTER TABLE productos ADD COLUMN stock INT");
        //stmt.executeUpdate("UPDATE productos SET stock = 5 WHERE id = 1");
        //stmt.executeUpdate("UPDATE productos SET stock = 20 WHERE id = 2");
        //stmt.executeUpdate("DELETE FROM productos WHERE id = 9");
        //stmt.executeUpdate("CREATE TABLE pedidos (id_pedido INT NOT NULL AUTO_INCREMENT, id_producto INT, nombre_cliente VARCHAR (50), PRIMARY KEY (id_pedido)) ");
        //stmt.executeUpdate("INSERT INTO pedidos(id_producto, nombre_cliente) VALUE (3, 'Cecilia')");


            //String col = "nombre";
            // executeQuery() permite las consultas de informacion en la BD
            ResultSet rs;
            //rs = stmt.executeQuery("SELECT idAlumno, SUM(puntaje) FROM Respuesta WHERE idEjercicio IN (SELECT idEjercicio FROM Ejercicio JOIN TrabajoPractico ON Ejercicio.idTrabajoPractico = TrabajoPractico.idTrabajoPractico WHERE tema = 'geografía política') GROUP BY idAlumno"); 
              rs = stmt.executeQuery("SELECT * FROM productos WHERE id=3");
       /*resultado de la subconsulta rs = stmt.executeQuery("SELECT * FROM Ejercicio JOIN TrabajoPractico ON Ejercicio.idTrabajoPractico = TrabajoPractico.idTrabajoPractico WHERE tema = 'geografía política'");*/
            //rs = stmt.executeQuery("show tables");
//            rs = stmt.executeQuery("SELECT matchid, player FROM goal WHERE teamid = 'GER'");
//            rs = stmt.executeQuery("SELECT id, stadium, team1, team2 FROM game WHERE id=10  12");
            while (rs.next()) {
             System.out.println(rs.getString(1) + "\t" + rs.getString(2));//+"\t" + rs.getString(3)+"\t" + rs.getString(4)+ "\t" +rs.getString(4)+"\t" +rs.getString(5)+"\t" +rs.getString(6)+"\t" +rs.getString(7));
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
