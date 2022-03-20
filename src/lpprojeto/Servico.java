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
public class Servico {
    
    int codigo;
    String tipo_serviço;
    float valor_serviço;
    
    /**
     *construtor responsável pela criação de serviços
     * @param tipo
     * @param valor
     */
    public Servico(String tipo,float valor){
        this.tipo_serviço = tipo;
        this.valor_serviço = valor;
        codigo++;
    }
    
    
    
    
}
