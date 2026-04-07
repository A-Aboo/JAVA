public abstract class Figure{
    private int x, y;
    public Figure(int x,  int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Les Valeur " + x + " , " + y  ;
    }
}