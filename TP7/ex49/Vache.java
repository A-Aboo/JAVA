public class Vache extends APatte{
    private int produit;

    public Vache (){
        super(4,"Vache");
        produit = (int)(Math.random()*(30-5)+5);
    }

    public void crier(){
        System.out.println("MOoow MOoow!!");
    }

    public String toString(){
        return super.toString() + " produit " + produit + " litre du lait";
    }


}