public class TestMoyenne{
    public static int moyenne(String[] tab){
        int note = 0, somme =0, n  =0;
        for (int i = 0 ; i < tab.length ; i++){
            try{
                note = Integer.parseInt(tab[i]);
            }catch(NumberFormatException e ){
                System.out.println( "Erreur : note pas entiers  ->>>   "  + tab[i]);
            }
            somme += note;
            n += 1;
        }
        return somme/n;
    }
    public static void main(String[] args) {
        System.out.println("Moyenne est "+  moyenne(args));
    }
}