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

public class TestAnimal{
    public static void main(String[] args) {
        Animal v = new Vache();
        Animal b = new Boa();
        Menagerie m = new Menagerie(5);
        m.ajoute(b);
        m.ajoute(v);
        m.ajoute(b);    
        m.midi();
        m.vieillirTous();
        System.out.println(m);
    }
}