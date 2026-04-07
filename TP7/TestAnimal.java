public class TestAnimal{
    public static void main(String[] args) {

        Animal v = new Vache(2,3);
        Animal b = new Boa("Boa", 4);
        Animal v1 = new Vache(21,31);
        Animal b1 = new Boa("Boa1", 41);
        Menagerie  m = new Menagerie(5);

        System.out.println(v);
        System.out.println(b);

        m.ajouter(b);
        m.ajouter(v1);
        m.ajouter(b1);
        m.ajouter(v);

        System.out.println(m.toString());
        m.midi();
        m.veiller();
        System.out.println(m.toString());
    }
}
