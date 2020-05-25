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
public class No {
    
    private No[] vlig;
    private String info;
    private int tl;
    
    public No(String info) 
    {
        this.vlig = new No[26];
        this.info = info;
        this.tl = 0;
    }

    public No() 
    {
        this.vlig = new No[26];
        this.tl = 0;
        info = null;
    }

    public No getVlig(int pos) {
        return vlig[pos];
    }

    public void setVlig(int pos, No no) {
        this.vlig[pos] = no;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public int getTll() {
        return tl;
    }

    public void setTll(int tl) {
        this.tl = tl;
    }    
    public String exibir(){
        return this.getInfo();
    }
}
