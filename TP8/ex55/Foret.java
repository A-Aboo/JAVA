import java.util.ArrayList;
public class Foret{
    private Object terrain[][];
    public Foret(int taille){
        terrain = new Object[taille][taille];
    }

    public boolean placer(Object o){
        int x  = (int)(Math.random()*terrain.length);
        int y  = (int)(Math.random()*terrain.length);
        if (terrain[x][y] == null){
            terrain[x][y] = o;
            return true;
        }
        return false;
    }

    public String toString(){
        String s = "";
        for (int i = 0 ; i < terrain.length ; i++){
            s += "| ";
            for (int j =0 ; j  < terrain[i].length  ; j++){
                    if (terrain[i][j] != null ){
                        s += terrain[i][j].toString().charAt(0);
                    }else{
                        s += " ";
                        
                    }
                } 
                s += " |";
                s += "\n";
            }
        return s;
    }


    public ArrayList<Champignon> ramaserChampignon(){
        ArrayList<Champignon> l = new ArrayList<Champignon>();
        for (int i =0; i < terrain.length; i++){
            for (int j = 0 ; j < terrain[0].length ; j++){
                if (terrain[i][j] instanceof Champignon){
                    l.add((Champignon) terrain[i][j]);
                    terrain[i][j] = null;
                }
            }
        }
        return l;
    }

    public ArrayList<Ramassable> ramasserTous(){
        ArrayList<Ramassable> l = new ArrayList<>();
        for (int i =0 ; i  < terrain.length ; i++){
            for (int j = 0 ; j < terrain[i].length ; j++ ){
                if (terrain[i][j] instanceof Ramassable){
                    l.add((Ramassable) terrain[i][j]);
                    terrain[i][j] = null;
                }
            }
        }
        return l;
    }


    public void ramasser(Panier p){
        for (int i = 0 ; i < terrain.length ; i++){
            for (int j = 0 ; j < terrain[i].length ; j++){
                if (terrain[i][j] instanceof Ramassable){
                    if (p.add( (Ramassable) terrain[i][j])){
                        terrain[i][j] = null;
                    }

                }
            }
        }
    }

}