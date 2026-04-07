public class Voiture extends Amoteur {
    private int nbPlace;
    public Voiture(String marque, int nbP){
        super(marque,  nbP);
        nbPlace = nbP;
    }
    public String toString(){
        return super.toString() + " nb place " +nbPlace ;
    }
    public void transporter(int nbP , int km){
        if (niveau == 0){
            enPanne();
        }else{
            System.out.println("La voiture " + numeroId + " transport " + nbP + " Personne Sur "+ km + " km");
        }
    }
}