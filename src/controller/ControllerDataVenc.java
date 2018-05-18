/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexoes.ConexaoMySql;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelDataVenc;

/**
 *
 * @author Pedro
 */
public class ControllerDataVenc {
    ConexaoMySql conex = new ConexaoMySql();
    ModelDataVenc mod = new ModelDataVenc();
    
  public void SalvarData(ModelDataVenc mod )  {
      
      conex.conectar();
        try {
            PreparedStatement pst = conex.conectar().prepareStatement("insert into ativacao(vencimento) values(?) ");
            pst.setString(1,mod.getData());
            pst.execute();
            JOptionPane.showMessageDialog(null," Licenças Cadastrada com Sucesso!");
       
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro na Inserção da Ativação!\nERRO: " + ex);
        }
 }
    
}
