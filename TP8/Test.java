import java.util.ArrayList;
public class Test{
    public static void main(String[] args) {

        Foret f = new Foret(5);
        for (int i = 0 ; i  < 7 ; i++){
            f.placer( new Champignon("Crep"));
        }
        for ( int j = 0 ; j  < 3 ; j++){
            f.placer( new Pin ("pin"));
        }
        for ( int j = 0 ; j  < 3 ; j++){
            f.placer( new ChampignonToxic ("Cp"));
        }
        System.out.println(f.toString());

        ArrayList<Champignon> array = f.ramasserChampignons();
        ArrayList<Ramassable> array1 = f.ramasserTout();
        for (Object o : array){
            System.out.println(o.toString());
        }
        for (Object o : array1){
            System.out.println(o.toString());
        }
    }
}