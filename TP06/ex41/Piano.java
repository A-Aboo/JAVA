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

public class Piano extends Instrument{
    private int touche;
    
    public Piano(int t , int prix, int poids){
        super(prix,poids);
        touche = t;
    }

    public String toString(){
        return "Piano : "  + touche + " touche "  +super.toString();
    }

    public void jouer(){
        System.out.println("Le Piano " + touche + " touche joue." );
    }
}