public class Voiture extends AMoteur{
    private int nbPlace;
    public Voiture(String marque , int nbpla , int cap){
        super(marque,cap);
        nbPlace = nbpla;
    }

    public String toString(){
        return "La Voiure "+ super.toString() + " avec nbplaces " + nbPlace;
    }

    public void transporter(int nbpers, int km ){
        if (!estEnPanne()){
            System.out.println("La voiture " + id + " tarnsport " + nbpers + " Personnes sur " + km + "km");
        }else{
            System.out.println("La voiture n'as plus d'essence!!");
        }
    }
}