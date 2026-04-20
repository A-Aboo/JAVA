public class TestSubmarine{
    public static void main(String[] args) {
        Submarine s1 = new Dauphine();
        Submarine s2 = new SousMarine();
        Submarine s3 = new Poisson();
        Ocean O = new Ocean(5);
        O.ajoter(s1);
        O.ajoter(s2);
        O.ajoter(s3);
        O.deplacer();
    }
}