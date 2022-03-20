
package lpprojeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 
 *   <h1>Class Venda Servico </h1>
 * 
 * <p>
 * 
*  Nesta class estao definidos os parametros que permitem criar uma venda de serviços .
* 
*
* @author Andre Costa
* @version 1.0
* @since 2022-03-20
* 
* 
*/

public class VendaServicos extends Venda {


    /**
     *
     * @param d
     * @param v
     */
    public VendaServicos(Date d, float v){
            
            artigos = new ArrayList<>();
            this.data_venda = d;
            this.valor = v;
            num_venda++;
        }

    /**
     *
     * @return
     */
    public int getNum_venda() {
        return num_venda;
    }

    /**
     *
     * @param num_venda
     */
    public void setNum_venda(int num_venda) {
        this.num_venda = num_venda;
    }

    /**
     *
     * @return
     */
    public Date getData_venda() {
        return data_venda;
    }

    /**
     *
     * @param data_venda
     */
    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public List<Artigos> getArtigos() {
        return artigos;
    }

    /**
     *
     * @param artigos
     */
    public void setArtigos(List<Artigos> artigos) {
        this.artigos = artigos;
    }

    
    
}
