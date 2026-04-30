public class AdresseWeb{
    private String protocole;
    private String domaine;
    private String chemin;
    public AdresseWeb(String pro , String dom, String che){
        this.protocole = pro;
        this.domaine = dom;
        this.chemin = che;
    }
    public AdresseWeb(String dom , String che){
        this("http", dom , che);
    }
    public AdresseWeb(String dom ){
        this("http", dom, "" );
    }
    public String toString(){
        return protocole + "://www." + domaine+ chemin;
    }

}