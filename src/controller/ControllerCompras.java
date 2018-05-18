package controller;

import model.ModelCompras;
import DAO.DAOCompras;
import java.util.ArrayList;

/**
*
* @author BLSoft
*/
public class ControllerCompras {

    private DAOCompras daoCompras = new DAOCompras();

    /**
    * grava Compras
    * @param pModelCompras
    * return int
    */
    public int salvarComprasController(ModelCompras pModelCompras){
        return this.daoCompras.salvarComprasDAO(pModelCompras);
    }

    /**
    * recupera Compras
    * @param pCodigo
    * return ModelCompras
    */
    public ModelCompras getComprasController(int pCodigo){
        return this.daoCompras.getComprasDAO(pCodigo);
    }

    /**
    * recupera uma lista deCompras
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelCompras> getListaComprasController(){
        return this.daoCompras.getListaComprasDAO();
    }

    /**
    * atualiza Compras
    * @param pModelCompras
    * return boolean
    */
    public boolean atualizarComprasController(ModelCompras pModelCompras){
        return this.daoCompras.atualizarComprasDAO(pModelCompras);
    }

    /**
    * exclui Compras
    * @param pCodigo
    * return boolean
    */
    public boolean excluirComprasController(int pCodigo){
        return this.daoCompras.excluirComprasDAO(pCodigo);
    }
}