public class Amoteur extends Vehicule{
    private int capacite;
    protected int niveau;
    public Amoteur(String marque ,int cap  ){
        super(marque);
        capacite = cap;
        niveau  =0;
    }
    public String toString(){

        return  " amoteur " + super.toString() + " capacite " + capacite + " niveau "+ niveau;
    }
    public void approvisionner(int nbLitre){
        niveau += nbLitre;
    }
    public void enPanne(){
        if (niveau == 0){
            System.out.println("La voiture 2 n’a plus d’essence !");
        }
    }
    
}