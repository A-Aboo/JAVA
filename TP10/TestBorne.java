public class TestBorne{
    public static void main(String [] args){
        EntierBorne i = null;
        EntierBorne e = null;
        EntierBorne k = null;
        try{
            EntierBorne l = new EntierBorne(0);
            i = new EntierBorne(40);
            e = i.somme(i);
            k = i.division(l);
        }catch(HorsBorneException h){
            System.out.println(h.getMessage());
        }catch(DivisionParZeroException d){
            System.out.println(d.getMessage());
        }
        System.out.println(i);

        System.out.println(e);
    }
}