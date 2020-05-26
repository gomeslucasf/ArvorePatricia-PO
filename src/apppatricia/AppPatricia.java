package apppatricia;

public class AppPatricia {

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
