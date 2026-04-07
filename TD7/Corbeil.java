import java.util.ArrayList;
public class Corbeil{
    public ArrayList<Fruits> liste ;

    
    public Corbeil(int n ){
        liste = new ArrayList<Fruits>(n);
        for( int i  =0 ; i <  n ; i++){
            if (Math.random() < 0.5){
                liste.add(new Pomme());
            }else{
                liste.add(new Kiwi());
            }
        }
    }
    public void lister(){
        for ( Fruits f : liste){
            f.afficher();
        }
    }
    public void methK(){
        for(Fruits  f : liste){
            if (f instanceof Kiwi){
                ((Kiwi)f).methKiwi();
            }
        }
    }

    public void compteNobrePomme(){
        int i = 0;
        for( Fruits f : liste){
            if (f instanceof Pomme){
                i += 1;
            }
        }
        System.out.println(i);
    }
}