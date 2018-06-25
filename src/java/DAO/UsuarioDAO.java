/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidade.Usuario;
import entidade.Venda;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danen
 */
public class UsuarioDAO implements DAO {

    private Connection con = ConnectionFactory.getConnection();

    @Override
    public List getPojos() {
        String sql = "select * from usuario";
        List<Usuario> usuarios = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setMatricula(rs.getInt("matricula"));
                u.setCpf(rs.getString("cpf"));
                u.setLogin(rs.getString("login"));
                u.setNome(rs.getString("nome"));
                u.setSenha(rs.getString("senha"));
                u.setQuantTicket(rs.getInt("quantTic"));
                u.setNivelAcesso(rs.getInt("nivelAcesso"));
                usuarios.add(u);
            }
            rs.close();
            stmt.close();
            return usuarios;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

  
    @Override
    public Object getPojo(String atributo) {
        String sql = "select * from usuario where matricula=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, atributo);
            Usuario u = new Usuario();
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                u.setMatricula(rs.getInt("matricula"));
                u.setCpf(rs.getString("cpf"));
                u.setLogin(rs.getString("login"));
                u.setNome(rs.getString("nome"));
                u.setSenha(rs.getString("senha"));
                u.setTipo(rs.getString("tipo"));
                u.setQuantTicket(rs.getInt("quantTic"));
                u.setNivelAcesso(rs.getInt("nivelAcesso"));
        }
            rs.close();
            stmt.close();
            return u;
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    

    @Override
    public void updatePojo(Object pojo) {
        String sql = "update usuario set nome=?, senha=?, login=?, quantTic=? where matricula=?";
        Usuario u = (Usuario) pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getLogin());
            stmt.setInt(4, u.getQuantTicket());
            stmt.setInt(5, u.getMatricula());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePojo(Object pojo) {
        String sql = "delete from usuario where matricula=?";
        Usuario u = (Usuario) pojo;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, u.getMatricula());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createPojo(Object pojo) {
        Usuario u = (Usuario) pojo;
        String sql = "insert into usuario (nome,matricula,cpf,login,senha,tipo,nivelAcesso,quantTic) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,u.getNome());
            stmt.setInt(2,u.getMatricula());
            stmt.setString(3,u.getCpf());
            stmt.setString(4,u.getLogin());
            stmt.setString(5,u.getSenha());
            stmt.setString(6,u.getTipo());
            stmt.setInt(7,u.getNivelAcesso());
            stmt.setInt(8,u.getQuantTicket());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public Usuario autenticarUsuario(String matricula, String senha) {
        Usuario usr = (Usuario)getPojo(matricula);
        if (usr.getNome() != null) {
            if (senha.equals(usr.getSenha())) {
                return usr;
            }
        }
        return null;
    }
    public List<Venda> getTicketsComprados(int matricula){
        String sql = "select * from venda where venda.id_Usu_c=? and venda.quantTic>0";
        List<Venda> vendas = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, matricula);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda v = new Venda();
                v.setId(rs.getInt("id"));
                v.setIdUsuC(rs.getInt("idUsuC"));
                v.setIdUsuV(rs.getInt("idUsuV"));
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
    public List<Venda> getTicketsGastos(int matricula){
        String sql = "select * from venda where venda.id_Usu_c=? and venda.quantTic<0";
        List<Venda> vendas = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, matricula);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda v = new Venda();
                v.setId(rs.getInt("id"));
                v.setIdUsuC(rs.getInt("idUsuC"));
                v.setIdUsuV(rs.getInt("idUsuV"));
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
}
