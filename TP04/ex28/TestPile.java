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

public class TestPile{
    public static void main(String[] args){

        Assiette a = new Assiette();
        Assiette a2 = new Assiette();
        Assiette a3 = new Assiette();
        Pile p = new Pile(5);
        System.out.println(p);
        p.empiler(a);
        p.depiler();
        p.depiler();
        p.empiler(a);
        p.empiler(a);
        p.empiler(a);
        p.empiler(a);
        p.empiler(a);
        p.empiler(a);
        System.out.println(p);

    }
}