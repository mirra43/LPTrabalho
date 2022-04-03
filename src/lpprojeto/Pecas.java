/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpprojeto;

/**
 *
 * @author andre
 */
public class Pecas {
    
    private int valorTotal,valorE,valorD;
    
    /**
     *
     * @param valorE
     * @param valorD
     */
    public Pecas(int valorE,int valorD){
        
        this.valorE = valorE;
        this.valorD = valorD;
        this.valorTotal = valorE + valorD;
        
    }

    /**
     *
     * @return
     */
    public int getValorTotal() {
        return valorTotal;
    }

    /**
     *
     * @param valorTotal
     */
    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     *
     * @return
     */
    public int getValorE() {
        return valorE;
    }

    /**
     *
     * @param valorE
     */
    public void setValorE(int valorE) {
        this.valorE = valorE;
    }

    /**
     *
     * @return
     */
    public int getValorD() {
        return valorD;
    }

    /**
     *
     * @param valorD
     */
    public void setValorD(int valorD) {
        this.valorD = valorD;
    }
   
    
}
