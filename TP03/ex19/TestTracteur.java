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

public class TestTracteur{
    public static void main(String[] args){

        Roue r1 = new Roue(120);
        Roue r2 = new Roue(120);
        Roue r3 = new Roue();
        Roue r4 = new Roue();

        Cabine c = new Cabine(3, "Blue");

        System.out.println(r1 + "\n" + r2 + "\n" + r3 + "\n" + r4 + "\n"  + c);

        Tracteur t1 = new Tracteur(r1,r2,r3,r4,c);
        System.out.println(t1 + "\n");

        Tracteur t2 = t1.copie();
        t2.peindre("Rouge");
        System.out.println(t2 + "\n\n");
        System.out.println(t1);
    }
}