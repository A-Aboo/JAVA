public abstract class APatte extends Animal{
    private int nbPatte;
    public APatte(int nbP , String nom){
        super(nom);
        nbPatte = nbP;
    }

    public String toString(){
        return super.toString()+" " + nbPatte +"  patte";
    }

  
}