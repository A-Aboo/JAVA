public class TestBorne{
    public static void main(String [] args){
        EntierBorne i = null;
        EntierBorne e = null;
        try{
            i = new EntierBorne(50);
        }catch(HorsBorneException h){
            System.out.println(h.getMessage());
        }
        System.out.println(i);
        try {
            
            e = i.somme(i);
        } catch (HorsBorneException h) {
            // TODO: handle exception
            System.out.println(h.getMessage());
            
        }
        System.out.println(e);
    }
}