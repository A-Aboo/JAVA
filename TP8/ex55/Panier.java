import java.util.ArrayList;

public class Panier extends ArrayList<Ramassable>{
    private double poidsMax;

    public Panier(int nb){
        super(nb);
        poidsMax = nb;
    }

    public double getPoids(){
        double total = 0;
        for (Ramassable r : this){
            total += r.getPoids();
        }
        return total;
    }

    @Override // for stupid compiler to know !! 
    public boolean add(Ramassable r){
        if (getPoids()+ r.getPoids() <= poidsMax){
            super.add(r);
            System.out.println(r.toString() + " est Ajoute au panier");
            return true;
        }
        System.out.println(  r.toString() + " n;est pas ajouter au panier");
        return false;
    }

    public int compterToxiques(){
        int t = 0;
        for (Ramassable r : this){
            if (r instanceof Toxique){
                t += 1;
            }
        }
        return t;
    }

    public String toString() {
        String s = "Panier contenant " + this.size() + " objets, dont "
            + compterToxiques() + " toxiques ("
            + String.format("%.1f", getPoids()) + "kg sur "
            + String.format("%.1f", poidsMax) + "kg)\n";

        for (Ramassable r : this) {
            s += "- " + r.toString() + "\n";
        }

        return s;
    }

    

}