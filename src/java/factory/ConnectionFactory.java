/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danen
 */
public class ConnectionFactory {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/RU?useUnicode=yes&characterEncoding=UTF-8", "root", "flamengo");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) throws SQLException {
            Connection con = ConnectionFactory.getConnection();
            System.out.println("Conexão bem sucedida");
            con.close();
        
    }
}
