import java.util.ArrayList;

public class Panier extends ArrayList<Ramassable>{
    private int poidsmax;
    public Panier(int poids){
        poidsmax = poids;
    }
    public int getPoids(){
        int t = 0 ; 
        for ( Ramassable r : this){
            t += r.getPoids();
        }
        return t;
    }
    @Override
    public boolean add(Ramassable r ){
        if (r.getPoids() + getPoids() < poidsmax){
            super.add(r);
            return true;
        }
        return false;
    }
    public int compterToxic(){
        int t= 0 ; 
        for(Ramassable r : this){
            if (r instanceof Toxic){
                t += 1;
            }
        }
        return t;
    }
    public String toString(){
        return "Panier contenant "+ size()  + " dont " + compterToxic() + " Toxic";
    }
}