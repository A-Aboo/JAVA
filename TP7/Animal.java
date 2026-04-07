public abstract class Animal{
    private String nom; 
    private int age;
    public Animal(String nom , int age){
        this.nom = nom;
        this.age = age;
    }
    public Animal(){
        this("A1", 1);
    }
    public String toString(){
        return "L'animal " + nom +" a " + age + " ans ";
    }
    public void veiillir(){
        age += 1;
    }
    public abstract void crier();

}