import java.util.*;
public class TestSleep{
    public static void main(String[] args){
        int n = 0;
        Scanner s =new Scanner(System.in);
        System.out.print("Entrere un nombre : ");
        try{
            n = s.nextInt();
            System.out.println("Attends de " + n + " seconds ");
            try{
                Thread.sleep(n);
            }catch(InterruptedException i){
                System.out.println(i.getMessage());
            }
            System.out.println("Fin de attente !");
        }catch(InputMismatchException  e ){
            System.out.println("Le nombre est mal forme");
        }
    }
}