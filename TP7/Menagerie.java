public class Menagerie{
    private Animal[] tabA;
    private static int nbA;
    private final int nbMax;
    public Menagerie(int size){
        tabA = new Animal[size];
        nbMax = size;
        nbA = 0;
    }
    public void ajouter(Animal a){
        if (nbA < nbMax){
            tabA[nbA] = a;
            nbA ++;
        }
    }
    public String toString(){
        String s = "";
        for (Animal a : tabA){
            if (a != null){
                s += a.toString()  + "\n";
            }
        }
        return s;
    }
    public void midi(){
        for ( Animal  a : tabA){
            if (a != null){
                a.crier();
            }
        }
    }
    public void veiller(){
        for (Animal a : tabA){
            if (a != null){
                a.veiillir();
            }
        }
    }
}