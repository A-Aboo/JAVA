public class Balance{
    public static final int MAX = 150 ;
    public void paser (int poids ) throws TropLourdException{
        if (poids > MAX){
            throw new TropLourdException();
        }
        System.out.println("Poids "  + poids + " kg");
    }
}