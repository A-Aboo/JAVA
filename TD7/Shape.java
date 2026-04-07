public abstract class Shape {
    protected double x,y;
    public Shape(){
        this.x  =0;
        this.y= 0;
    }
    public Shape( double x, double y){
        this.x  = x ;
        this.y = y;
    }
    public String toString(){
        return " Position (" + x + " , " +  y   + ") Surface " + Surface();
    }
    public abstract double Surface();

}