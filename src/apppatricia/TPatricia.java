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
public class TPatricia {
    private No raiz;


    public TPatricia() 
    {
        raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }
    
    public No NoIdeal(String info, int index){
        int indexInfo = 0, indexPatricia = 1 ;
        No auxPatricia = this.raiz; 
        char letraInfo;
        char letraPatricia;
        
        while(auxPatricia != null)
        {            
            letraInfo = info.charAt(indexInfo);
            letraPatricia = auxPatricia.getInfo().charAt(indexPatricia);
            
            if(letraPatricia != '\0' && letraInfo  == letraPatricia)
            {
                indexInfo++;
                indexPatricia++;
            }
            else
            {
                
            }
        }
        
        return null;
    }
    
    public void Inserir(String info)
    {
        
        No aux;
        
        if(this.raiz == null)
            this.raiz = new No(info.toLowerCase());
        else
        {
            char letra = info.charAt(0);
            
            
            
        }
        /*
        No aux, pai;
        int i = 0, pos;
        if(raiz == null)
        {
            aux = new No(info.charAt(0));
            raiz = 4;
            for(i=1; i<info.length(); i++)
            {
                aux.setVlig((int)info.charAt(i-1)-97, new No(info.charAt(i)));
                aux.setTll(aux.getTll()+1);
                aux = aux.getVlig((int)info.charAt(i-1)-97);
            }
            aux.setVlig((int)info.charAt(i-1)-97, new No());
            aux = aux.getVlig((int)info.charAt(i-1)-97);
            aux.setPalavra(info);
        }
        else
        {
            aux = raiz; pai = raiz;
            i=0;
            while(i<info.length()&&aux!=null)
            {
                pai = aux;
                aux = aux.getVlig((int)info.charAt(i)-97);
                i++;
            }
            if(i<info.length()&&aux == null)
            {
                pai.setVlig((int)info.charAt(i-1)-97, new No(info.charAt(i)));
                aux = pai.getVlig((int)info.charAt(i-1)-97);
                for(;i<info.length();i++)
                {
                    aux.setVlig((int)info.charAt(i)-97, new No(info.charAt(i)));
                    aux.setTll(aux.getTll()+1);
                    aux = aux.getVlig((int)info.charAt(i)-97);
                }
                aux.setVlig((int)info.charAt(i-1)-97, new No());
                aux = aux.getVlig((int)info.charAt(i-1)-97);
                aux.setPalavra(info);
            }
            else
                if(i==info.length()&&aux != null)
                    aux.setPalavra(info);
                else
                   if(i==info.length()&&aux == null)
                   {
                       pai.setVlig((int)info.charAt(i-1)-97, new No());
                       aux = pai.getVlig((int)info.charAt(i-1)-97);
                       aux.setPalavra(info);
                   }
        }*/
    }
}
