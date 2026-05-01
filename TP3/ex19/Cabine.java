public class Cabine{
    private int volume;
    private String couleur;
    public Cabine(int vol , String col){
        this.volume = vol;
        this.couleur = col;
    }

    public Cabine copie(){
        return new Cabine(volume, couleur);
    }

    public String toString(){
        return "Cabine : " + couleur + ", volume : " + volume + "m3 ";
    }

    public void setCouleur(String col){couleur = col; }



}