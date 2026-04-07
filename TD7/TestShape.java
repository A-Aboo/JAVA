public class TestShape{
    public static void main(String[] args){
        Cercle c1  = new Cercle(1,1,3);
        Cercle c2 = new Cercle();
        Regtangle r1 = new Regtangle(2,4);
        Regtangle r2 = new Regtangle(5,7);
        System.out.println(c1  + "  "  + c2);
        Shape [] tabS  = new Shape[4];
        tabS[0] = c1;
        tabS[1] = r1;
        tabS[2] = c2;
        tabS[3] = r2;
        double res = 0;
        for (Shape s: tabS){
            res += s.Surface();
            System.out.println(res);
        }
        Corbeil c = new Corbeil(10);
        c.lister();
        c.methK();
        c.compteNobrePomme();
     }
}