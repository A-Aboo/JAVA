public class Orchestre{
    private final int MAX  = 10;
    private Instrument[] tabI;
    private int cpt;

    public Orchestre(int nb){
        if (nb> MAX){
            tabI = new Instrument[MAX];
        }else{
            tabI = new Instrument[nb];
        }
        cpt = 0;
    }
    public  void ajouterInstrument(Instrument x){
        if (cpt < tabI.length){
            tabI[cpt]  = x;
            cpt++;
        }
        
    }

    public void jouer(){
        for (Instrument i : tabI){
            if (i != null){
                i.jouer();
            }
        }
    }
    
}