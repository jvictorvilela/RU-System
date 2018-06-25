/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidade.Preco;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danen
 */
public class PrecoDAO implements DAO{
    private Connection con = ConnectionFactory.getConnection();
    @Override
    public List getPojos() {
        String sql = "select * from preco";
        List<Preco> precos = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Preco p =  new Preco();
                p.setId(rs.getInt("id"));
                p.setNivelUsu(rs.getInt("nivelUsu"));
                p.setValor(rs.getFloat("valor"));
                precos.add(p);
            }
            rs.close();
            stmt.close();
            return precos;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Object getPojo(String atributo) {
        String sql = "select * from preco where id=?";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(atributo));
            Preco p = new Preco();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setNivelUsu(rs.getInt("nivelUsu"));
                p.setValor(rs.getFloat("valor"));
            }
            rs.close();
            stmt.close();
            return p;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void updatePojo(Object pojo) {
        String sql = "update preco set valor=? where id=?";
        Preco p = (Preco)pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setFloat(1, p.getValor());
            stmt.setInt(2, p.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePojo(Object pojo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createPojo(Object pojo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        PrecoDAO dao = new PrecoDAO();
        for(Object i:dao.getPojos()){
            Preco item = (Preco)i;
            System.out.print("id:"+item.getId()+"//");
            System.out.print("nivelUsu:"+item.getNivelUsu()+"//");
            System.out.println("valor:"+item.getValor());
        }
    }
}
