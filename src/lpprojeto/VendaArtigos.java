
package lpprojeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 *   <h1>Class Venda Artigos </h1>
 * 
 * <p>
 * 
*  Nesta class estao definidos os parametros que permitem criar uma venda de artigos .
* 
*
* @author João Mirra
* @version 1.0
* @since 2022-03-20
* 
* 
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
