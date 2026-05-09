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

public class Alea{

    private Alea(){}

    public static char lettre(){
        return (char)(Math.random()*('Z'-'A'+1)+'A');
    }

    public static String chaine(){
        String s = "";
        for (int i = 0; i < 10 ; i++){
            s += lettre();
        }
        return s;
    }
}