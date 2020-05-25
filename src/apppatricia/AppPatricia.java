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
        TPatricia t = new TPatricia();
        t.Inserir("acta");
        t.Inserir("acto");
        t.Inserir("actor");
        t.Inserir("ala");
        t.Inserir("galo");
        t.Inserir("gel");
        t.Inserir("sol");
        t.Inserir("sola");
        t.Inserir("solo");
       /* t.exibe(t.getRaiz());
        t.remove("galo");
        System.out.println("\n\n");
        t.exibe(t.getRaiz());*/
    }
    
}
