public class Trio{
    private Personne[] tabp;
    private static int cpt;
    private int numero;
    public Trio(){
        tabp = new Personne[3];
        tabp[0] = new Personne();
        tabp[1] = new Personne();
        tabp[2] = new Personne();
        numero = ++cpt; 
    }

    public String toString(){
        return "Trio "+ numero +" : " + tabp[0].toString() + " " + tabp[1].toString() + " " + tabp[2].toString()    ;
    }

    public static int getNbTrio(){return cpt;}
}