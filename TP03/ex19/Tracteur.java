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

public class Tracteur{
    private Roue r1,r2,r3,r4;
    private Cabine c;
    public Tracteur(Roue r11,Roue r22, Roue r33, Roue r44, Cabine c1){
        this.r1 = r11;
        this.r2 = r22;
        this.r3 = r33;
        this.r4 = r44;
        this.c  = c1;
    }

    public Tracteur copie(){
        return new Tracteur(r1.copie(),r2.copie(),r3.copie(),r4.copie(),c.copie());
    }

    public void peindre(String couleur){
        c.setCouleur(couleur);
    }

    public String toString(){
        return "Tracteur constitue de \n" + c.toString() + " et de 4 Roue \n"+ r1.toString() + r2.toString() + r3.toString() + r4.toString();
    }
}