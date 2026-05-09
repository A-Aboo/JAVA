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

import java.util.ArrayList;

public class Etudiant {
    private int[] notes = new int[5];
    private String nom;
    private int cpt = 0;

    private static  ArrayList<Etudiant> tabE = new ArrayList<>();

    public Etudiant(String n){
        nom = n;
        tabE.add(this);
    }

    public void entrerNote(int n) throws TabNotesPleineException{
        if (cpt == notes.length) throw new TabNotesPleineException();
        notes[cpt++] = n;       
    }

    public String toString(){
        String s = nom +  " " ;
        for (int i = 0 ; i < cpt ; i++){
           s += notes[i] + " ";
        }
        return s;
    }

    public String getNom(){return nom;}
    public static ArrayList<Etudiant> getEtudiant(){return tabE;}
}