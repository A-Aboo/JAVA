public class Villageois{
    private String nom;
    private double poids;
    private boolean malade;
    public Villageois(String nomv){
        this.nom = nomv;
        this.poids = Math.random()*(150-50) + 50;
        this.malade = Math.random() < 0.20;
    }
    public String toString(){
        return "Villageois " + nom + ", poids : " + String.format("%.2f", poids) +" kg, malade : " + 
        (malade ? "oui" : "non") + ", peut soulever " + String.format("%.2f" , poidsSouleve()) + " kg";
    }
    public double poidsSouleve(){
        if (malade)return poids/4;
        return poids/3;
    }


    public String getNom(){return nom;}
    public double getPoids(){return poids;}
    public boolean getMalade(){return malade;}


}