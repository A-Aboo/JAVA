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

public class TestEntierBorne {
    public static void main(String[] args) {
        try{
            EntierBorne ebX = new EntierBorne( (int)(Math.random() * ( 150  - (- 150 ) + 1 ) +( - 150)) );
            EntierBorne ebY = new EntierBorne( (int)(Math.random() * (3))  );
            System.out.println(ebX + "\t"  +ebY  + "\nSomme -> " + ebX.somme(ebY));
            System.out.println("Division -> " + ebX.divPar(ebY));
            
        }catch(HorsBornesException e){
            System.out.println(e.getMessage());
        }catch(DivisionParZeroException d){
            System.out.println(d.getMessage());
        }


        // (a) Non, cela ne compile pas, car Exception capture
        // déjà DivisionParZeroException, donc le deuxième catch devient inaccessible.

        // (b) Oui, on peut utiliser un seul catch(Exception e),
        // car toutes ces exceptions héritent de Exception, mais plusieurs catch permettent de traiter chaque erreur différemment.

        // (c) Oui, on peut écrire throws Exception dans main, 
        // mais ce n’est pas conseillé car le programme ne gère pas proprement l’erreur et peut s’arrêter brutalement.


    }
}