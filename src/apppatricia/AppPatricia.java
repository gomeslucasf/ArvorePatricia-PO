/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppatricia;

/**
 *
 * @author Gomes
 */
public class AppPatricia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TPatricia tPatricia = new TPatricia();
        tPatricia.Inserir("bear");
        tPatricia.Inserir("Bell");
        tPatricia.Inserir("bid");
        tPatricia.Inserir("Bull");
        tPatricia.Inserir("buy");
        tPatricia.Inserir("sell");
        tPatricia.Inserir("stock");
        tPatricia.Inserir("stop");
        tPatricia.exibePalavras(tPatricia.getRaiz(),"");
       
    }
    
}
