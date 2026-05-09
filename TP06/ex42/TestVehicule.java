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

public class TestVehicule{
    public static void main(String[] args){
        Velo v = new Velo("MYVTT"  , 17);
        Voiture vo = new Voiture("v1" ,5 ,10);
        System.out.println(v);
        v.rouler(10);
        System.out.println(vo);
        vo.approvisionner(4);
        vo.transporter(5, 100);
        System.out.println("\n\n");
        Camion c = new Camion("Renault", 20, 100);

        Vehicule[] tab = new Vehicule[3];
        tab[0] = v;
        tab[1] = vo;
        tab[2] = c;

        for (Vehicule veh : tab) {
            veh.rouler(10);
        }
    }
}