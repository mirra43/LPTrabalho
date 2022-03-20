/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpprojeto;

import java.util.Date;

/**
 *
 * @author andre
 */
public class VendaServicos extends Venda {


    /**
     *
     * @param d
     * @param v
     */
    public VendaServicos(Date d, float v){
            
            
            this.data_venda = d;
            this.valor = v;
            num_venda++;
        }

}
