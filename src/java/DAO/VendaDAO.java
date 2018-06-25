/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidade.Venda;
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
public class VendaDAO implements DAO{
    private Connection con = ConnectionFactory.getConnection();
    @Override
    public List getPojos() {
        String sql = "select * from venda";
        List<Venda> vendas = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda v = new Venda();
                v.setId(rs.getInt("id"));
                v.setIdUsuC(rs.getInt("id_Usu_c"));
                v.setIdUsuV(rs.getInt("id_Usu_v"));
                v.setQuantTicket(rs.getInt("quantTic"));
                v.setDatas(rs.getString("datas"));
                v.setHoras(rs.getString("horas"));
                vendas.add(v);
            }
            rs.close();
            stmt.close();
            return vendas;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Object getPojo(String atributo) {
        String sql = "select * from venda where id=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(atributo));
            Venda v = new Venda();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                v.setId(rs.getInt("id"));
                v.setIdUsuC(rs.getInt("id_Usu_c"));
                v.setIdUsuV(rs.getInt("id_Usu_v"));
                v.setQuantTicket(rs.getInt("quantTic"));
            }
            rs.close();
            stmt.close();
            return v;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void updatePojo(Object pojo) {
        //sem uso
    }

    @Override
    public void deletePojo(Object pojo) {
        String sql = "delete from venda where id=?";
        Venda v =(Venda)pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, v.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createPojo(Object pojo) {
        Venda v = (Venda)pojo;
        String sql = "insert into venda (id_Usu_c,id_Usu_v,quantTic, datas, horas) values(?,?,?,?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, v.getIdUsuC());
            stmt.setInt(2, v.getIdUsuV());
            stmt.setInt(3,v.getQuantTicket());
            stmt.setString(4,v.getDatas());
            stmt.setString(5,v.getHoras());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
