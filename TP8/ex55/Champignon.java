public class Champignon extends Arbre implements Ramassable{

    private double poids;
    public Champignon(String nom){
        super(nom);
        poids = Math.random()*(3);
    }

    public double getPoids(){return poids;}

    public String toString(){
        return super.toString()+" " + poids  + "kg";
    }

}