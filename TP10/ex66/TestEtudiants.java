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

public class TestEtudiants {
    public static void main(String[] args) {
        Etudiant e  = null;
        for (String s : args){

            try {
                int x = Integer.parseInt(s);
              //  System.out.print(", est une note " + x);
                e.entrerNote(x);
            }catch(NumberFormatException n ){
                e = new Etudiant(s);

                //System.out.println("est un nom " + s);
            }catch(TabNotesPleineException t){
                System.out.println("le tableau de notes de l'etudiant " + e.getNom() + " est pleine");
            }

        }
        // pas besoin de loop pour array list !! 
        System.out.println("Les etudiant : \n"+ Etudiant.getEtudiant());


    }
}