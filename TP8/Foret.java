import java.util.ArrayList;

public class Foret{
    private Object tabO[][];
    public Foret(int n){
        tabO = new Object[n][n];
    }
    public boolean placer(Object o){
        int x = (int)(Math.random()*5);
        int y = (int)(Math.random()*5);
        if (tabO[x][y] == null){
            tabO[x][y] = o;
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Champignon> ramasserChampignons(){
        ArrayList<Champignon> array =  new ArrayList<>(10);
        for (int i = 0 ; i < 5 ; i ++){
            for (int j = 0 ; j < 5; j++){
                if (tabO[i][j] instanceof Champignon){
                    array.add( (Champignon) (tabO[i][j]));
                }
            }
        }
        return array;
    }
    public ArrayList<Ramassable> ramasserTout(){
        ArrayList<Ramassable> array = new ArrayList<>(20);
        for ( int i = 0 ; i < tabO.length ; i ++){
            for (int j = 0 ; j  < tabO.length ; j++){
                if (tabO[i][j] instanceof Ramassable){
                    array.add((Ramassable) (tabO[i][j]));
                }
            }
        }
        return array;
    }


    public String toString(){
        String s= "";
        for (int i  = 0 ;  i  < tabO[0].length  ; i++){
            s += '|';
            for (int j = 0 ; j  < tabO[0].length; j ++){

                if (tabO[i][j] instanceof Pin){
                    s += 'P';
                }else if (tabO[i][j] instanceof Champignon){
                    s += 'C';
                }else{
                    s += ' ';
                }
            }
            s += "|\n";
        } 
        return s;
    }
}
