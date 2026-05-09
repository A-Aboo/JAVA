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

public class Camion extends AMoteur{
    private double volume;

    public Camion(String marque ,int vol , int cap){
        super(marque,cap);
        volume = vol;
    }

    public String toString(){
        return "Le Camion " + super.toString() + " peur transporter "+ volume;
    }

    public void transporter(String ma, int km){
        if (!estEnPanne()){
            System.out.println("Le Camion "  + id + " a transporter des" + ma + " sur " + km + " km"); 
        }else{
            System.out.println("Le Camion est En panne!!");
        }
    }
}