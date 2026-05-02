public class Pile{
    private Assiette[] tabA;
    private int nbA;

    public Pile (int a){
        tabA = new Assiette[a];
        nbA = 0;
    }

    public boolean estVide(){return nbA == 0;}

    public boolean estPleine(){return nbA == tabA.length;}

    public void empiler(Assiette a){
        if (!estPleine()){
            tabA[nbA] = a;
            nbA ++;
        }else{
            System.out.println("La pile est pleine ");
        }
    }

    public Assiette depiler(){

        if (estVide()){
            System.out.println("La Pile est Vide");
            return null;
        }
        nbA --;
        Assiette re = tabA[nbA];
        tabA[nbA] = null;
        return re;
    }

    public String toString(){
        String s = "Pile :\n";
        for(int i = nbA - 1; i >= 0; i--){
            s += tabA[i] + "\n";
        }
        return s;
    }


}