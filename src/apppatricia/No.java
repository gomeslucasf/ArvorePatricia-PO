package apppatricia;

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

    public No [] getVlig() {
        return vlig;
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


    public int getTl() {
        return tl;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }    

    public No vLigPosicao(int pos)
    {
        return this.vlig[pos];
    }
    public String exibir(){
        return this.getInfo();
    }
    public No quebraPalavra(int index){
        
        String sub = this.info.substring(index, this.info.length());
        this.info.replace(sub, "");
        
        this.setVlig(this.getTl(),new No (sub));
        this.tl++;
        this.setVlig(this.getTl(),new No ());
        
        return this.vLigPosicao(tl);
    }
}
