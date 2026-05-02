public class Personne{
    private String nom;
    private static int nbPersonnes;
    private static char lettre='A';

    public Personne(){
        nom = "Individu" + lettre++;
        nbPersonnes++;
    }

    public static int getNbPersonne(){return nbPersonnes;}

    public String toString(){
        return nom;
    }

}