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

public class Projet{
    private String nomP;
    private Trio trio;
    private static int nbP;
    public Projet(String nom){
        trio = new Trio();
        nomP = nom;
        nbP++;
    }

    public String toString(){
        return "Projet " + nomP + " " + trio.toString();
    }

    public static int getNbProject(){return nbP;}

}