public class Velo extends SansMoteur{
    private int vitesse;
    public Velo(String marque , int vit){
        super(marque);
        vitesse  = vit;
    }
    
    public String toString(){
        return "Velo "+ super.toString()  +  vitesse +" Vitesse";
    }

    public void transporter(String depart , String arriver){
        System.out.println("Le Velo " + id + " se deplace de " +depart + " a " + arriver);
    }

  
}