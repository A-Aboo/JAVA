public class TestOrchestre{
    public static void main(String[] args){
        // ?? ou Guitar g = new ....  
        // ?? ou Piano p  = new ....

        Instrument g = new Guitare("Classic" , 10 , 40);
        Instrument p = new Piano(88, 40 ,100);
        Orchestre o = new Orchestre(10);

    
        System.out.println(g + "\n" + p + "\n");
        p.jouer();
        g.jouer();
        System.out.println("\n");
        o.ajouterInstrument(p);
        o.ajouterInstrument(g);
        o.ajouterInstrument(p);
        o.ajouterInstrument(p);
        o.jouer();
    }
}