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

public class Instrument{
    private int prix, poids;
    
    public Instrument(int  pr, int po)
    {
        this.prix = pr;
        this.poids = po;
    }

    public String toString(){
        return "Poids : " + poids + "kg, Prix :"+prix + " euros"; 
    }

    public void jouer(){
        System.out.println("L'instrument joue ");
    };
}