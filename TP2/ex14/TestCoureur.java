public class TestCoureur {
    public static void main(String[] args) {
        Coureur c1 = new Coureur(1);
        Coureur c2 = new Coureur(2);
        Coureur c3 = new Coureur(3);
        Coureur c4 = new Coureur(4);

        c1.setPossedeTemoin(true);

        c1.courir();
        c1.passeTemoin(c2);

        c2.courir();
        c2.passeTemoin(c3);

        c3.courir();
        c3.passeTemoin(c4);

        c4.courir();

        double tempsTotal = c1.getTempsAu100()
                          + c2.getTempsAu100()
                          + c3.getTempsAu100()
                          + c4.getTempsAu100();

        System.out.println("Temps total pour 400m : " 
            + String.format("%.2f", tempsTotal) + "s");
    }
}