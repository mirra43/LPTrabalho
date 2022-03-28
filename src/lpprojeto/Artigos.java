
package lpprojeto;


/**
 * 
 *  <h1>Class Artigos </h1>
 * 
 * <p>
 * 
*  Nesta class estao definidos os parametros que permitem adicionar artigos.
* 
*
* @author Mariana Veiga
* @version 1.0
* @since 2022-03-20
* 
* 
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
