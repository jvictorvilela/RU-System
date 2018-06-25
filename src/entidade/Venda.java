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
public class Venda {
    private int id;
    private int quantTicket;
    private int idUsuC;
    private int idUsuV;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantTicket() {
        return quantTicket;
    }

    public void setQuantTicket(int quantTicket) {
        this.quantTicket = quantTicket;
    }

    public int getIdUsuC() {
        return idUsuC;
    }

    public void setIdUsuC(int idUsuC) {
        this.idUsuC = idUsuC;
    }

    public int getIdUsuV() {
        return idUsuV;
    }

    public void setIdUsuV(int idUsuV) {
        this.idUsuV = idUsuV;
    }
    
    
}
