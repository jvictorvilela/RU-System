/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author danen
 */
public class Usuario {
    private int matricula;
    private String nome;
    private String tipo;
    private String login;
    private String senha;
    private String cpf;
    private int quantTicket;
    private int nivelAcesso;
    
    public Usuario() {
        this.matricula = 0;
        this.nome = null;
        this.login = null;
        this.senha = null;
        this.cpf = null;
        this.tipo = "";
        this.quantTicket = 0;
        this.nivelAcesso = 0;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQuantTicket() {
        return quantTicket;
    }

    public void setQuantTicket(int quantTicket) {
        this.quantTicket = quantTicket;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
        switch (tipo) {
            case "aluno":
                this.nivelAcesso = 1;
                break;
            case "professor":
                this.nivelAcesso = 1;
                break;
            case "servidor":
                this.nivelAcesso = 1;
                break;
            case "mantedor":
                this.nivelAcesso = 2;
                break;
            case "nutricionista":
                this.nivelAcesso = 3;
                break;
            case "administrador":
                this.nivelAcesso = 4;
                break;
        }
    }
    
    
}
