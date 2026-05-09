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

public class TestTableauMain{
    public static void main(String[] args){
        System.out.println("Il y a "+  args.length +" arguments.");
        int count = 0;
        for(String ch : args){
            System.out.println("args["+count++ + "]="+  ch);
        }
    }
}