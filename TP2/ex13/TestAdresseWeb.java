public class TestAdresseWeb{
    public static void main(String[] args){
        AdresseWeb a1 = new AdresseWeb("https", "site.fr" , "/dir/page1.html");
        AdresseWeb a2 = new AdresseWeb("site.fr", "/dir/page1.html");
        AdresseWeb a3 = new AdresseWeb("site.fr");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

    }
}