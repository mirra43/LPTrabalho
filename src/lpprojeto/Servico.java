
package lpprojeto;

/**
 * 
 *   <h1>Class Servico </h1>
 * 
 * <p>
 * 
*  Nesta class estao definidos os parametros que permitem caracterizar um serviço.
* 
*
* @author Andre Costa
* @version 1.0
* @since 2022-03-20
* 
* 
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
