public class Vehicule{
    protected  final int numeroId;
    private String  marque;
    private static int cpt = 0;
    private int distance;
    public Vehicule(String mar){
        cpt++;
        numeroId= cpt;
        marque  = mar;
        distance = 0;
    }
    public String toString(){
        return numeroId + " de marque " + marque;
    }
    public void Rouler(double dist){
        System.out.println(toString() + " a roule "+dist + " km");
        distance += dist;
    }
    
}