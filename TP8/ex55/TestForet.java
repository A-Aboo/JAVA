public class TestForet {
    public static void main(String[] args) {

        Foret f = new Foret(5);

        // Q55.3 : 70% champignons, 30% pins
        for (int i = 0; i < 7; i++) {
            f.placer(new Champignon("Cepe"));
        }

        for (int i = 0; i < 3; i++) {
            f.placer(new Pin());
        }

        for (int i = 0; i < 3; i++) {
            f.placer(new ChampignonToxique("Amanite"));
        }
        System.out.println(f);


        Panier p = new Panier(8);

        f.ramasser(p);

        System.out.println("PANIER :");
        System.out.println(p);

        System.out.println(f);
    }
}