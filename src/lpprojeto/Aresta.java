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
class Aresta {
    
    Vertice destino;
    int peso;
    Aresta seguinte;
    
    public Aresta(Vertice v){
        destino=v;
        this.peso = destino.peca.getValorTotal();
        seguinte=null;
        
    }
    
    public void andre(){
        System.out.println("Andre");
    }
    
    
}
