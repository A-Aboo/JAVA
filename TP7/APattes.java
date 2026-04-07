public abstract class APattes extends Animal{
    private int nbPatte;
    public APattes(String nom ,int age , int nbp){
        super(nom,age);
        this.nbPatte  =nbp;
    }
    public APattes(int nb){
        super();
        nbPatte = nb;
    }
    public String toString(){
        return super.toString()+ " a patte a " + nbPatte + " patte";
    }
    
}