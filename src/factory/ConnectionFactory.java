/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author danen
 */
public class ConnectionFactory {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/ru", "mysql.sys", "123456789");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) throws SQLException {
        try (Connection con = ConnectionFactory.getConnection()) {
            System.out.println("Conexão bem sucedida");
        }
        
    }
}
