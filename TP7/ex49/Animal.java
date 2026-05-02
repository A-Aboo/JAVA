public abstract class Animal{
    private String nom;     
    private int age;

    public Animal(String no ,int a){
        nom = no;
        age = a;
    }

    public Animal(String nom){
        this(nom,1);
    }

    public void vieillir(){
        age += 1;
    }

    public String toString(){
        return nom + " age : " + age + " ans  ";
    }

    public void crier(){}
}