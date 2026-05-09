/******************************************************************************/
/*                                                                            */
/*   UL2IN002 - Programmation Orientée Objet          ███████╗██╗   ██╗       */
/*   Sorbonne Université                              ██╔════╝██║   ██║       */
/*                                                    ███████╗██║   ██║       */
/*   Author: A-Aboo                                   ╚════██║██║   ██║       */
/*                                                    ███████║╚██████╔╝       */
/*                                                    ╚══════╝ ╚═════╝        */
/*                                                                            */
/******************************************************************************/

public class VectN{
    private int [] tab;

    private VectN(int n){
        tab = new int[n];
    }

    public VectN(int n , int max){
        this(n);
        for (int i = 0  ; i <tab.length; i++){
            tab[i] = (int)(Math.random()*(max +1));
        }
    }

    public VectN(){
        this(5,9);  
    }

    public VectN(int a, int b, int c ){
        this(3);
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;
    }

    public int somme(){
        int s=  0;
        for(int i : tab){
            s += i;
        }
        return s;
    }

    public String toString(){
        String s = "[";
        for(int i = 0 ; i < tab.length -1 ; i++){
            s += tab[i] + ", ";
        }
        s += tab[tab.length - 1 ] + "]";
        return s;
    }

    public int[] getTab(){
        int [] t = new int[tab.length]; 
        for(int i = 0 ; i < t.length ; i++){
            t[i] = tab[i];
        }
        return t;
    }
}