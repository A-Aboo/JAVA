import java.util.ArrayList;

public class Ocean{
    private ArrayList<Submarine> tabS ;
    private int cpt = 0;
    public Ocean(int nb){
        tabS = new ArrayList<Submarine>(nb);
    }
    public void ajoter(Submarine s){
        if ( cpt <5 ){
            tabS.add(s);
            cpt++;
            System.out.println(s.getClass());
            System.out.println( s instanceof Submarine);
        }
    }
    public void deplacer(){
        for (Submarine s : tabS){
            s.seDeplacer();
            System.out.println(s.getClass() + "  Se deplace");
        }
    }
}