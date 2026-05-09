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

public class Assiette{
    private int diametre; 

    public Assiette(int di){
        this.diametre = di;
    }

    public Assiette(){
        this(26);
    }

    public String toString(){
        return "Assiette " + diametre + " cm";
    }
    
}