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

public class Vehicule{
    private static int cpt;
    protected final int id;
    private String marque;
    private double distanceParcourue;

    public Vehicule(String m){
        marque = m;
        id = ++cpt;
        distanceParcourue = 0;
    }

    public void rouler(double distance) {
        distanceParcourue += distance;
        System.out.println(this + " a roulé " + distance + " km");
    }

    public void setDistanceParcourue(double distance){
        distanceParcourue += distance;
    }

    public String toString(){
        return id  + " de marque " +marque ; 
    }

    
  
    
}

