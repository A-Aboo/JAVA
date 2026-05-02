public class Cone{
    private double rayon;
    private double hauteur;
    private final double PI=3.14159;
    private static int nbCones;

    public Cone(double r, double h){
        this.hauteur = h;
        this.rayon  =r;
        nbCones++;
    }

    public Cone(){
        this (  Math.random()*10, Math.random()*10  );
    }

    public double getVolume(){
        return ( 1.0/3 * PI * (rayon * rayon) * hauteur   );
    }

    public String toString(){
        return "Cone r="+ String.format("%.2f",rayon)  + "cm  h="+ String.format("%.2f",hauteur) + "cm de volume " + String.format("%.2f", getVolume()) ;
    }

    public static int getNbCones(){return nbCones;}


}