/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpprojeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mirra
 */
public class VendaArtigos extends Venda{
    
    /**
     *
     * @param d
     * @param v
     */
    public VendaArtigos(Date d, float v){
            artigos = new ArrayList<>();
            this.data_venda = d;
            this.valor = v;
            num_venda++;
        }
    
    /**
     *adiciona artigos ao array de artigos
     * @param art
     */
    public void addArtigos(Artigos art){
            artigos.add(art);
        }
        
    /**
     *remove artigos ao array de artigos
     * @param art
     */
    public void removeArtigos(Artigos art){
            artigos.remove(art);
        }
        
    /**
     * vai retornar todos os artigos presentes no array artigos
     * @return ArrayList artigos
     */
    public List getArtigos(){
            return artigos;
        }
}
