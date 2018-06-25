/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author danen
 */
public interface DAO {
    
    public List getPojos();
    public Object getPojo(int atributo);
    public void updatePojo(Object pojo);
    public void deletePojo(Object pojo);
    public void createPojo(Object pojo);
}
