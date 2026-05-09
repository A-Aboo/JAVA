public class Pin extends Arbre{
    private double poids;
    public Pin(){
        super("pin");
        poids = Math.random()*(4);
    }
    

    public String toString(){
        return super.toString() ;
    }

}