public class SansMoteur extends Vehicule{
    public SansMoteur(String marque)
    {
        super(marque);
    }
    public String toString(){
        return  super.toString()  + " SansMoteur ";
    }
    public void transporter(String depart , String arrive){
        System.out.println("Le velo " + numeroId + " se deplace de " + depart + " a " + arrive);
    }
}