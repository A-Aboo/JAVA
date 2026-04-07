public class Camion extends Amoteur{
    private int Volume;
    public Camion(String Marque , int vol){
        super(Marque, vol);
        Volume  =vol;
    }
    public String toString(){
        return "Le Camion "  + super.toString() + " peut transporter " + Volume;
    }
    
}