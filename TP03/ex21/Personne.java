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

public class Personne{
    private String nom;
    private Personne conjoint;
    
    public Personne(String nom){
        this.nom  = nom;
        conjoint = null;
    }

    public Personne(){
        this( "Pers"+(char)(Math.random()*('Z'-'A'+1)+'A'));
    }

    public String toString(){
        if(conjoint == null){
            return nom + ", célibataire";
        }
        return nom + ", marie(e)";
    }
    public void epouser(Personne p) {
        if (p == null || p == this || conjoint != null || p.conjoint != null) {
            System.out.println("Le mariage de " + this + " avec " + p + " est impossible");
            return;
        }

        conjoint = p;
        p.conjoint = this;

        System.out.println(nom + ", célibataire se marie avec " + p.nom + ", célibataire");
    }

    public void divorcer(){
        if (conjoint != null)
        {
            System.out.println(nom + " marie(e) divorce de "+conjoint.nom +", marie(e)");
            conjoint.conjoint = null;
            conjoint = null;
        }else{
            System.out.println("est deja contant ");
        }
    }

    

}