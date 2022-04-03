/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpprojeto;

import java.util.*;

/**
 *
 * @author andre
 */
public class Grafo {
    
    List<Vertice> vertices;
    
    public Grafo(){
        
        vertices = new ArrayList<>();
    }
    
    public Vertice procurarPeca(Vertice peca){
        
        for(Vertice v : vertices){
             
            if(v.peca.getValorE()== peca.peca.getValorE()&& v.peca.getValorD()== peca.peca.getValorD()){
              return v; 
              
            }
            
            
        }
        
        return null;
        
    }
    
    public void ligarPecas(Vertice v1,Vertice v2,int p){
        
        Vertice temp = procurarPeca(v1),temp1 = procurarPeca(v2);
        
        if(temp == null || temp1 == null) return;
        
        Aresta nova = new Aresta(temp);
        nova.seguinte = temp1.aresta;
        temp1.aresta = nova;

        
    }
    
}
