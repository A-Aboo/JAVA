public class Champignon extends Arbre implements Ramassable{
    private int Poids;
    public Champignon(String nom){
        super(nom);
        Poids  = 4;
    }
    public String toString(){
        return super.toString() + " "+ Poids;
    }
    public int getPoids(){return Poids;}

}