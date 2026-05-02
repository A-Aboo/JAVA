public class TestFigure {
    public static void main(String[] args) {
        Figure2D[] tab = new Figure2D[4];

        tab[0] = new Rectangle(5, 3);
        tab[1] = new Carre(4);
        tab[2] = new Ellipse(6, 2);
        tab[3] = new Cercle(3);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
            System.out.println("Surface = " + tab[i].surface());
            System.out.println("Perimetre = " + tab[i].perimetre());
            System.out.println();
        }
    }
}