public class Coureur{
    private int numDossard;
    private double tempsAu100;
    private boolean possedeTemoin;
    public Coureur(int nb){
        this.numDossard = nb;
        this.tempsAu100 = (int)(Math.random()*(16-12+1)+12);
        this.possedeTemoin = false;
    }
    public Coureur(){
        this((int)(Math.random()*(1000)) +1);
    }

    public void setPossedeTemoin(boolean pt){
        possedeTemoin = pt;
    }

    public String toString(){
        return "Coureur " + numDossard + " TempsAu100 : " + String.format("%.2f", tempsAu100) + " au 100m "+ (possedeTemoin ? "oui" : "non");
    }

    public void passeTemoin(Coureur c){
        if( c.possedeTemoin != false){
            setPossedeTemoin(c.possedeTemoin);
            c.setPossedeTemoin(false);
            System.out.println("moi coureur " + numDossard + " je passe le temoin au coureur " + c.numDossard);
        }
    }
    public int getNumDossard(){return numDossard;}
    public double getTempsAu100(){return tempsAu100;}
    public boolean getPossedeTemoin(){return possedeTemoin;}

}