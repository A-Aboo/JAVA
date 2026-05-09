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

public class TestPersonne{
    public static void main(String[] args){
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        Personne p3 = new Personne();
        System.out.println(p1 +"\n" + p2 + "\n" +p3);
        p1.epouser(p2);
        p1.epouser(p3);
        p3.epouser(p1);
        p3.epouser(p3);
        System.out.println(p1 +"\n" + p2 + "\n" +p3);
        p1.divorcer();
        p3.divorcer();

    }
}