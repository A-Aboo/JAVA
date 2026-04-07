public class Vache extends APattes{
    private int lait;
    public Vache (String nom , int age , int pat){
        super(nom, age, pat);
        lait  = (int)(Math.random()* (50 - 5 +1) + 5); 
    }
    public Vache (int lai, int pate){
        super(pate);
        lait  = (int)(Math.random()* (50 - 5 +1) + 5); 
    }
    public String toString(){
        return super.toString();
    }

    public void crier(){
        System.out.println("Moooo !");
    }
    
}