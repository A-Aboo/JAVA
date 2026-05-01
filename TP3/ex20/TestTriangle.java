public class TestTriangle{
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();

        Triangle t1 = new Triangle(p1 , p2 , new Point());

        System.out.println(p1 + "\n"  +p2);
        System.out.println(p1.distance(p2));
        System.out.println(t1);
        System.out.println(t1.getPerimetre());
        Triangle t2 = new Triangle(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
        p1.deplaceToi(100,100);
        System.out.println(t1.equals(t2));
        System.out.println(t1);
        System.out.println(t2);

    }
}