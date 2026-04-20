public class TestBorne{
    public static void main(String [] args){
        EntierBorne i = null;
        EntierBorne e = null;
        try{
            i = new EntierBorne(60);
            e = i.somme(i);
        }catch(HorsBorneException h){
            System.out.println(h.getMessage());
        }
        System.out.println(i);

        System.out.println(e);
    }
}