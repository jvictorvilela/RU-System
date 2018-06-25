/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidade.Cardapio;
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
public class CardapioDAO implements DAO{
    private Connection con = ConnectionFactory.getConnection();
    @Override
    public List getPojos() {
        String sql = "select * from cardapio";
        List<Cardapio> cardapios = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cardapio c = new Cardapio();
                c.setCarne1(rs.getInt("carne1"));
                c.setCarne2(rs.getInt("carne2"));
                c.setCarneVeg(rs.getInt("carneVeg"));
                c.setGuarn1(rs.getInt("guarn1"));
                c.setGuarn2(rs.getInt("guarn2"));
                c.setGuarn3(rs.getInt("guarn3"));
                c.setDoce(rs.getInt("doce"));
                c.setFruta(rs.getInt("fruta"));
                c.setSuco(rs.getInt("suco"));
                c.setSalada(rs.getInt("salada"));
                cardapios.add(c);
            }
            rs.close();
            stmt.close();
            return cardapios;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Object getPojo(String atributo) {
        String sql = "select * from cardapio where id=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(atributo));
            Cardapio c = new Cardapio();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
               c.setCarne1(rs.getInt("carne1"));
                c.setCarne2(rs.getInt("carne2"));
                c.setCarneVeg(rs.getInt("carneVeg"));
                c.setGuarn1(rs.getInt("guarn1"));
                c.setGuarn2(rs.getInt("guarn2"));
                c.setGuarn3(rs.getInt("guarn3"));
                c.setDoce(rs.getInt("doce"));
                c.setFruta(rs.getInt("fruta"));
                c.setSuco(rs.getInt("suco"));
                c.setSalada(rs.getInt("salada"));
            }
            rs.close();
            stmt.close();
            return c;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void updatePojo(Object pojo) {
        String sql = "update cardapio set carne1=?, carne2=?,carneVeg3=?,guarn1=?,guarn2=?,guarn3=?,salada=?,doce=?,fruta=?,suco=? where id=?";
        Cardapio c = (Cardapio) pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getCarne1());
            stmt.setInt(2, c.getCarne2());
            stmt.setInt(3, c.getCarneVeg());
            stmt.setInt(4, c.getGuarn1());
            stmt.setInt(5, c.getGuarn2());
            stmt.setInt(6, c.getGuarn3());
            stmt.setInt(7,c.getSalada());
            stmt.setInt(8, c.getDoce());
            stmt.setInt(9,c.getFruta());
            stmt.setInt(10, c.getSuco());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePojo(Object pojo) {
        String sql = "delete from cardapio where id=?";
        Cardapio c = (Cardapio) pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createPojo(Object pojo) {
        Cardapio c = (Cardapio)pojo;
        String sql = "insert into cardapio (carne1,carne2,carneVeg,guarn1,guarn2,guarn3,salada,doce,fruta,suco) values(?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getCarne1());
            stmt.setInt(2, c.getCarne2());
            stmt.setInt(3, c.getCarneVeg());
            stmt.setInt(4, c.getGuarn1());
            stmt.setInt(5, c.getGuarn2());
            stmt.setInt(6, c.getGuarn3());
            stmt.setInt(7,c.getSalada());
            stmt.setInt(8, c.getDoce());
            stmt.setInt(9,c.getFruta());
            stmt.setInt(10, c.getSuco());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
