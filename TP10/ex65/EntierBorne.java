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

import java.time.temporal.ValueRange;

import javax.swing.border.EtchedBorder;

public class EntierBorne {
        private int valeur ; 
        private static final int MAX = 100;
        private static final int MIN = -100;

        public EntierBorne(int v) throws HorsBornesException{
            if (v > MAX) throw new HorsBornesException("Entier Trop Grande : "  + v);
            if (v < MIN) throw new HorsBornesException("Entier Trop Petit  : "  + v);
            valeur = v;
        }


        public EntierBorne somme(EntierBorne o) throws HorsBornesException{
            return new EntierBorne(valeur  +o.valeur);
        }

        public EntierBorne divPar(EntierBorne o) throws DivisionParZeroException , HorsBornesException{
            if (o.valeur == 0) throw new DivisionParZeroException();
            return new EntierBorne(valeur / o.valeur);
        }
        
        public String toString(){
            return "Entier : "+ valeur;
        }

        

    }   