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

public class Point{
    private int  posx,posy;
    public Point(int x, int y){
        this.posx = x;
        this.posy = y;
    }
    
    public Point(Point autre ){
        this.posx = autre.posx;
        this.posy = autre.posy;
    }

    public Point(){
        this((int)(Math.random()*(10) ) , (int) (Math.random()*(10)));
    }

    public String toString(){
        return "("+posx + ", "+ posy+")";
    }

    public double distance(Point p){
        return Math.sqrt(  ( (p.posx - posx  ) * (p.posx - posx)  ) + ( (p.posy - posy ) * (p.posy - posy)  )   );
    }

    public boolean equals(Point autre) {
        return this.posx == autre.posx && this.posy == autre.posy;
    }

    public void deplaceToi(int newx , int newy){
        posx = newx;
        posy = newy;
    }

}