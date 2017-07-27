/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Breno-
 */
public class ConnectionFactory {
     private static String url = "jdbc:mysql://localhost:3306/QuinaFacil";
    private static String usuario = "root";
    private static String senha = "1234";
    
    private static ConnectionFactory fabrica = null;
    
    private ConnectionFactory(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
            catch (ClassNotFoundException ex){
                        ex.printStackTrace();
                    }
        
    }
    
    public static ConnectionFactory getInstance(){
        if(fabrica == null){
            fabrica = new ConnectionFactory();
        }
        return fabrica;
    }
    
    public Connection getConnection() throws SQLException {
        
        Connection con = DriverManager.getConnection(url, usuario, senha);
        return con;
    }
    
}
