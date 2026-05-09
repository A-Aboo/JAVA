/******************************************************************************/
/*                                                                            */
/*   UL2IN002 - Programmation Orientée Objet          ███████╗██╗   ██╗       */
/*   Sorbonne Université                              ██╔════╝██║   ██║       */
/*                                                    ███████╗██║   ██║       */
/*   Author: A-Aboo                                   ╚════██║██║   ██║       */
/*                                                    ███████║╚██████╔╝       */
/*                                                    ╚══════╝ ╚═════╝        */
/*                                                                            */
/******************************************************************************/

import java.util.Scanner;
import java.util.InputMismatchException;

public class TestSleep {
    
        // For Q64.2
        // public static void main(String[] args) throws InterruptedException
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrer un nombre de secondes : ");

        try {
            int x = scan.nextInt();

            System.out.println("Attente de " + x + " secondes");

            Thread.sleep(x * 1000);

            System.out.println("Fin de l’attente");

        } catch (InputMismatchException e) {
            System.out.println("Le nombre est mal formé");
        } catch (InterruptedException e) {
            System.out.println("L’attente a été interrompue");
        }

        scan.close();
    }
}