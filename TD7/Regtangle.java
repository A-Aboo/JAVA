public class Regtangle extends Shape{
    public Regtangle(double x , double y){
        super(x,y);
    }
    public double Surface(){
        return Math.PI * x * y;
    }
}