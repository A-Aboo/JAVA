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

public class Triangle{
    private Point p1,p2,p3;
    public Triangle(Point p11, Point p22, Point p33){
        this.p1 = p11;
        this.p2 = p22;
        this.p3 = p33;
    }

    public Triangle(Triangle autre){
        this.p1 = new Point(autre.p1);
        this.p2 = new Point(autre.p2);
        this.p3 = new Point(autre.p3);
    }

    public Triangle(){
        this(new Point(), new Point (), new Point());
    }

    public double getPerimetre() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean equals(Triangle autre) {
    return this.p1.equals(autre.p1) && this.p2.equals(autre.p2) && this.p3.equals(autre.p3);
    }

    public String toString(){
        return "{" + p1.toString() + ";"+p2.toString()+";"+p3.toString()+"}";
    }
}