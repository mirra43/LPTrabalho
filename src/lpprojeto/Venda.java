/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpprojeto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author andre
 */
public class Venda {
    
     int num_venda;
    Date data_venda;
    float valor;
    List<Artigos> artigos;
    
    
    /**
     *setter da variável valor
     * @param va
     */
    public void setValor(float va){
        this.valor = va;
    }
    
    /**
     *setter da variável data_venda
     * @param dt
     */
  
    
    public void setData(Date dt){
        this.data_venda = dt;
    }
    
    /**
     *getter da variável valor
     * @return
     */
    public float getValor(){
        return valor;
    }
    
    /**
     *getter da variável data_venda
     * @return
     */
    public Date getData(){
        return data_venda;
    }

}
