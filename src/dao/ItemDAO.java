/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Item;
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
public class ItemDAO implements DAO {

    private Connection con = ConnectionFactory.getConnection();

    @Override
    public List getPojos() {
        String sql = "select * from item";
        List<Item> itens = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Item i = new Item();
                i.setId(rs.getInt("id"));
                i.setNome(rs.getString("nome"));
                i.setCategoria(rs.getInt("categoria"));
                itens.add(i);
            }
            rs.close();
            stmt.close();
            return itens;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Object getPojo(int atributo) {
        String sql = "select * from item where id=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, atributo);
            Item item = new Item();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                item.setId(rs.getInt("id"));
                item.setNome(rs.getString("nome"));
                item.setCategoria(rs.getInt("categoria"));
            }
            rs.close();
            stmt.close();
            return item;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void updatePojo(Object pojo) {
        String sql = "update item set nome=?, categoria=? where id=?";
        Item i = (Item) pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, i.getNome());
            stmt.setInt(2, i.getCategoria());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePojo(Object pojo) {
        String sql = "delete from item where id=?";
        Item i = (Item) pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, i.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createPojo(Object pojo) {
        Item i = (Item)pojo;
        String sql = "insert into item (nome,categoria) values(?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, i.getNome());
            stmt.setInt(2, i.getCategoria());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
