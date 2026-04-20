public class EntierBorne{
    private int valeur;
    private static final int MAX = 100;
    private static final int MIN = -100;
    public EntierBorne(int val) throws HorsBorneException{
        
        if (val > MAX) throw new HorsBorneException("Entier Trop grande");
        if (val < MIN) throw new HorsBorneException("Entier Trop petite");
        valeur = val;
    }
    public String toString(){
        return "The number is  " + valeur;
    }
    public EntierBorne somme (EntierBorne eb) throws HorsBorneException{
        return new EntierBorne(valeur + eb.valeur);
    }
    public EntierBorne division(EntierBorne eb) throws DivisionParZeroException{
        if (rb.valeur == 0) throw new DivisionParZeroException("Division par zero");
        return new EntierBorne(valeur / eb.valeur);
    }
}