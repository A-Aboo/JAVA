public class TestVillageois{
    public static void main(String[] args){
        Villageois v1 = new Villageois("v1");
        Villageois v2 = new Villageois("v2");
        Villageois v3 = new Villageois("v3");
        Villageois v4 = new Villageois("v4");
        System.out.println(v1 + "\n" + v2 + "\n" + v3 + "\n" + v4);
        System.out.println(v1.getNom() + " " + v1.getPoids() + " "  + v1.getMalade());

        double poidsT = v1.poidsSouleve() + v2.poidsSouleve() + v3.poidsSouleve() + v4.poidsSouleve();
        if (poidsT >= 100) {
            System.out.println("Ils réussissent à soulever le rocher.");
        } else {
            System.out.println("Ils ne réussissent pas à soulever le rocher.");
        }
    }
}