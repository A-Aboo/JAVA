public class Roue{
    private int diametre;
    
    public Roue(int d){
        this.diametre = d;
    }

    public Roue(){
        this(60);
    }

    public Roue copie (){
        return new Roue(diametre);
    }

    public String toString(){
        return "Roue " + diametre + " cm ";
    }
}