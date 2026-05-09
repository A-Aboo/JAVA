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

public class AMoteur extends Vehicule{ 
    private double niveauEssence;
    private double capacite;
    public AMoteur(String marque, double capa){
        super(marque);
        niveauEssence = 0;
        capacite = capa;
    }

    public String toString(){
        return super.toString() + " AMoteur ";
    }
    public void approvisionner(double nbLitre){
        niveauEssence  += nbLitre;
    }

    public boolean  estEnPanne(){
        return  (niveauEssence <= 0.0);
    }

}