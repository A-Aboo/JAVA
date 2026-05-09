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

public class TestVectN{
    public static void main(String[] args){
        VectN v = new VectN(4, 5, 6);
        System.out.println(v + "\n" +v.somme());
        int [] t = v.getTab();
        t[0] = 100;
        System.out.println(v);
    }
}