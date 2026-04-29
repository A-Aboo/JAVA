public class Segment{
    private int x, y ;
    public Segment(int extX , int extY){
        this.x = extX;
        this.y = extY;
    }
    public int longeur(){
        if (x > y)return x-y;
        return y-x;
    }
    public String toString(){
        return "Segment [  <" + x + ">,<" + y + ">  ]";
    }
}