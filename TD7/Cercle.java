public class Cercle extends Shape {
    private double radius;
    public Cercle(){
        super();
        radius = 1;
    }
    public Cercle(double x ,double y, double r){
        super(x,y);
        radius = r;
    }
    public String toString(){
        return "Circle radius  " + radius + " "+ super.toString();
    }
    public double Surface(){
        return Math.PI  * radius * radius;
    }


}