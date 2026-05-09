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

public class TestComplexe {
    public static void main(String[] args) {
        Complexe c1 = new Complexe(1, 1);
        Complexe c2 = new Complexe(2, 2);
        Complexe c3 = new Complexe();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Complexe somme = c1.addition(c2);
        Complexe produit = c1.multiplication(c2);

        System.out.println("Addition : " + somme);
        System.out.println("Multiplication : " + produit);

        Complexe i = new Complexe(0, 1);
        System.out.println("i * i = " + i.multiplication(i));

        System.out.println("(1 + i) * (2 + 2i) = " + produit);
    }
}