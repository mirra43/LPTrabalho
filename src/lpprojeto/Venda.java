
package lpprojeto;

import java.util.Date;
import java.util.List;

/**
 * 
 * <h1>Class Venda </h1>
 * 
 * <p>
 * 
*  Nesta class estao definidos os parametros que permitem criar uma venda.
* 
*
* @author Andre Costa
* @version 1.0
* @since 2022-03-20
* 
* 
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
    
    public void teste(){
        System.out.println("teste");
    }
    
}
