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

public class Menagerie{
    private Animal[] tabA;
    private int cpt;
    public Menagerie(int nb){
        tabA = new Animal[nb];
        cpt=0;
    }

    public void  ajoute(Animal a){
        if (cpt < tabA.length){
            tabA[cpt++]= a;
        }else{
            System.out.println("Le tableau est pleine");
        }
    }

    public void midi(){
        for(Animal a : tabA)
        {
            if (a != null){
                a.crier();
            }
        }
    }

    public void vieillirTous(){
        for (Animal a : tabA){
            if (a != null){

                a.vieillir();
            }
        }
    }

    public String toString(){
        String s = "Les Animeaux \n";
        for (Animal a : tabA){
            if ( a != null){
                s += a.toString() + "\n";
            }
        }
        return s;
    }

}