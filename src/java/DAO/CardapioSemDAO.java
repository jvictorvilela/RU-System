/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidade.Cardapio;
import entidade.CardapioSem;
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
public class CardapioSemDAO implements DAO{
    private Connection con = ConnectionFactory.getConnection();
    @Override
    public List getPojos() {
        String sql = "select * from cardapiosem";
        List<CardapioSem> cardapiosSem = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                CardapioSem cs = new CardapioSem();
                cs.setId(rs.getInt("id"));
                cs.setSegunda(rs.getInt("segunda"));
                cs.setTerca(rs.getInt("terca"));
                cs.setQuarta(rs.getInt("quarta"));
                cs.setQuinta(rs.getInt("quinta"));
                cs.setSexta(rs.getInt("sexta"));
                cs.setTurno(rs.getString("turno"));
                cardapiosSem.add(cs);
            }
            rs.close();
            stmt.close();
            return cardapiosSem;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Object getPojo(String atributo) {
        String sql = "select * from cardapiosem where id=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(atributo));
            CardapioSem cs = new CardapioSem();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                cs.setId(rs.getInt("id"));
                cs.setSegunda(rs.getInt("segunda"));
                cs.setTerca(rs.getInt("terca"));
                cs.setQuarta(rs.getInt("quarta"));
                cs.setQuinta(rs.getInt("quinta"));
                cs.setSexta(rs.getInt("sexta"));
                cs.setTurno(rs.getString("turno"));
            }
            rs.close();
            stmt.close();
            return cs;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void updatePojo(Object pojo) {
        
    }

    @Override
    public void deletePojo(Object pojo) {
        String sql = "delete from cardapiosem where id=?";
        CardapioSem cs = (CardapioSem) pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cs.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createPojo(Object pojo) {
        CardapioSem c = (CardapioSem)pojo;
        String sql = "insert into cardapiosem (segunda,terca,quarta,quinta,sexta,turno) values(?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getSegunda());
            stmt.setInt(2, c.getTerca());
            stmt.setInt(3, c.getQuarta());
            stmt.setInt(4, c.getQuinta());
            stmt.setInt(5, c.getSexta());
            stmt.setString(6, c.getTurno());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public Cardapio[] getDiaCardapio(String dia){
        String sql = "select * from cardapio where id=?";
        Cardapio cardapiosDoDia[] = new Cardapio[2];
        CardapioSem cardapios[] = getSemana();
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, getDiaId(dia, cardapios[1]));//dia
            ResultSet rs = stmt.executeQuery();
            Cardapio c =new Cardapio();
            int i=0;
            while(rs.next()){
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
                cardapiosDoDia[i]=c;
                i++;
            }
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, getDiaId(dia, cardapios[0]));//noite
            rs = stmt.executeQuery();
            c =new Cardapio();
            while(rs.next()){
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
                cardapiosDoDia[i]=c;
                i++;
            }
            rs.close();
            stmt.close();
            return cardapiosDoDia;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    private int getDiaId(String dia,CardapioSem cs){
        if(dia.equals("segunda"))
            return cs.getSegunda();
        else if(dia.equals("terca"))
            return cs.getTerca();
        else if(dia.equals("quarta"))
            return cs.getQuarta();
        else if(dia.equals("quinta"))
            return cs.getQuinta();
        else
            return cs.getSexta();
    }
    public CardapioSem[] getSemana(){
        String sql = "select * from cardapiosem order by id desc limit 2";
        CardapioSem cardapiosDoDia[] = new CardapioSem[2];
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            CardapioSem cs =new CardapioSem();
            int i=0;
            while(rs.next()){
                cs.setId(rs.getInt("id"));
                cs.setSegunda(rs.getInt("segunda"));
                cs.setTerca(rs.getInt("terca"));
                cs.setQuarta(rs.getInt("quarta"));
                cs.setQuinta(rs.getInt("quinta"));
                cs.setSexta(rs.getInt("sexta"));
                cs.setTurno(rs.getString("turno"));
                cardapiosDoDia[i] = cs;
                i++;
            }
            rs.close();
            stmt.close();
            return cardapiosDoDia;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
       
    }
    
    
}
