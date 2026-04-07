public class TestVehicule {
    public static void main(String[] args) {
        Vehicule v1 = new Vehicule("MyVTT");
        Amoteur am  =new Amoteur("A&" ,4);
        SansMoteur sm = new SansMoteur("S1");
        Voiture Vo  = new Voiture("MyVTT" , 4);
        Velo v2= new Velo("MyVTT",17);
        Camion c = new Camion("MyVTT",50);
        System.out.println(v1);
        System.out.println(am);
        System.out.println(sm);
        System.out.println(v2);
        v2.transporter("Paris", "Lyon");
        v2.Rouler(10);
        System.out.println(Vo);
        Vo.transporter(4, 100);
        Vo.approvisionner(50);
        Vo.transporter(4, 100);
        System.out.println(c.toString()+ "\n\n\n");
        Vehicule [] tabV   = new Vehicule[5];
        tabV[0] = v1;
        tabV[1] = am;
        tabV[2] = sm;
        tabV[3] = Vo;
        tabV[4]  =c;
        for(Vehicule v : tabV){
            v.Rouler(10);
        }
    }
    
}