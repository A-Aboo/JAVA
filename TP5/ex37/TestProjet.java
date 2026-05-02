public class TestProjet{ 
    public static void main(String[] args){
        System.out.println( "NbPersonne : " +Personne.getNbPersonne());
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        System.out.println(p1 + "\n" + p2) ;
        System.out.println("NbPersonne : "+Personne.getNbPersonne());
        Trio t1 = new Trio();
        System.out.println(t1);
        Projet p = new Projet("PSX-774");
        System.out.println(p);
        System.out.println(Personne.getNbPersonne() + " " + Trio.getNbTrio() + " " + Projet.getNbProject() );
    }
}