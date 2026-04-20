public class Pin extends Arbre implements Ramassable{
    private int poids;
    public Pin(String nom ){
        super(nom);
        this.poids = 4;
    }
    public int getPoids(){return poids;}

    public String toString(){
        return super.toString();
    }
}