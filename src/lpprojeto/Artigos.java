/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpprojeto;

/**
 *
 * @author marim
 */
public class Artigos {
    float valor_artigo;
    int codigo;
    String nome_artigo;

    /**
     *construtor responsável pela criação de artigos
     * @param n
     * @param v
     */
    public Artigos(String n,float v){
        this.nome_artigo = n;
        this.valor_artigo = v;
        codigo++;
    }
 
}
