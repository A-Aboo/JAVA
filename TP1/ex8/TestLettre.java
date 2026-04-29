public class TestLettre {
    public static void main(String[] args) {

        for (char c = 'a'; c <= 'z'; c++) {
            Lettre l = new Lettre(c);
            System.out.println(c + " : " + l.getCodeAscii());
        }

        System.out.println();

        int compteur = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            Lettre l = new Lettre(c);
            System.out.print(l.getCarac() + " ");

            compteur++;

            if (compteur % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}