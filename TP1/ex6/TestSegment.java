public class TestSegment{
    public static void main(String[] args){
        Segment s1 = new Segment(6, 8);
        Segment s2 = new Segment(12,5);
        if (s1.longeur() > s2.longeur()) {
            System.out.println("Le premier est plus long");
        }else{
            System.out.println("Le deuxieme est plus long");
        }
    }
}