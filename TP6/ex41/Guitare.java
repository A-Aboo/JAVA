public class Guitare extends Instrument{
    private String type;

    public Guitare(String t ,int prix , int poids){
        super(prix,poids);
        type = t;
    }

    public String toString(){
        return "Le guitar "+ type + " " + super.toString();
    }

    public void jouer(){
        System.out.println("Le guitar " + type + " joue.");
    }
}