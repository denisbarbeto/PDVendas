/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexoes.ConexaoMySql;
import static groovy.ui.text.FindReplaceUtility.dispose;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelDataVenc;

/**
 *
 * @author Pedro
 */
public class ControllerValidacao {
    ConexaoMySql con = new ConexaoMySql();
    ModelDataVenc mod = new ModelDataVenc();
    int valida;
  
    
    public void Validar(String senha){
      
        con.conectar();
        con.executarSQL("select * from ativacao");
        
        try {
        con.resultSet.last();
        
        valida = Integer.parseInt(con.resultSet.getString("vencimento"));
        
        int operacao = (valida + 777777)/3;
        int senhaValidacao = Integer.parseInt(senha);

        if(operacao==senhaValidacao){
            
            int dia,mes,ano;
            String AcertaMes, AcertaDia, ProxSenha;
            
            
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date hoje = new Date();
            String data = df.format(hoje);
            
            
            char [] senhachar = data.toCharArray();
            
            dia = Integer.parseInt(""+senhachar[0]+senhachar[1]);
            mes = Integer.parseInt(""+senhachar[3]+senhachar[4]);
            ano = Integer.parseInt(""+senhachar[6]+senhachar[7]+senhachar[8]+senhachar[9]);
                     
            if(mes < 12){
                mes++; 
                
                if(mes < 10){
                    AcertaMes= "0" +mes;
                    }
                else{
                    AcertaMes= ""+mes;
                }
            }else{
                mes = 1;
                ano ++;
                AcertaMes = "0" +mes;
                }
                 
            if(dia < 10){
               AcertaDia = "0" +dia;  
            }
            else{
               AcertaDia = "" +dia;  
            }
            
            
            
            ProxSenha = AcertaDia + " / " + AcertaMes + " / " + ano;   
            PreparedStatement pst = con.con.prepareStatement("insert into ativacao (vencimento) values (?) ");
            pst.setString(1, ProxSenha);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sistema Ativado com Exito até: " + ProxSenha); 
            
            
//        }else{
//                JOptionPane.showMessageDialog(null, "Chave de Registro Validada com Sucesso! ");  
     
        }else {
        JOptionPane.showMessageDialog(null, "Senha Errada!\n Erro: " ); 
       }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Não foi possivel Validar o Sistema!\nErro: " + ex);
        }
        
        con.fecharConexao();
        
    }
    
}
