package apppatricia;

public class TPatricia {
    private No raiz;

    public TPatricia() 
    {
        raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }
    
    
    public void Inserir(String info)
    {
        info = info.toLowerCase();
        No aux;
        
        if(this.raiz == null)
            this.raiz = new No(info.toLowerCase());
        else
        {
            No auxPatricia = this.raiz; 
            No auxCompara = null;
            int j=0, i;
            //Andar entre No
            while(auxPatricia != null)
            {   
                boolean continuar = true;
                for(i=1; i<info.length() && continuar; i++)
                    continuar = auxPatricia.getInfo().equals(info.substring(j, i));
                j=i;

                if(i < info.length()) 
                {
                    int posVlig=0;
                    for(posVlig=0; posVlig < auxPatricia.getTl(); posVlig++)
                    {
                        auxCompara = auxPatricia.vLigPosicao(posVlig);
                        char letraPatricia = auxCompara.getInfo().charAt(0);
                        if(letraPatricia == auxPatricia.getInfo().charAt(j))
                        {
                            auxPatricia = auxCompara;
                        }
                    }

                    if(posVlig == auxPatricia.getTl())
                    {
                        char letraInfo;
                        char letraPatricia;
                        boolean diferente = true;
                        for(int index=0; index < info.length() && diferente; index++)
                        {
                            letraInfo = info.charAt(index);
                            letraPatricia = auxCompara.getInfo().charAt(index);
                            if(letraInfo != letraPatricia){
                                diferente=false;
                                No pos_insere = auxCompara.quebraPalavra(index);
                                pos_insere.setInfo(info.substring(j,i));
                            }
                        }

                    }
                }
            }
        
        }       
    }
        
    public void exibePalavras(No no, String palavra)
    {
        if(no != null)
        {
            if(no.getTl() == 0)
                {
                   palavra = palavra+no.getInfo();
                    System.out.println(palavra);
                }
            else
                for(int i=0;i<no.getTl();i++)
                {
                    if(no.vLigPosicao(i) != null)
                        exibePalavras(no.vLigPosicao(i),palavra+no.getInfo());
                }
        }
    }
}
