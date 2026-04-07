public abstract class SansPatte extends Animal{
    public SansPatte(String nom , int age){
        super(nom, age);
    }
    public SansPatte(){
        super();
    }
    public String toString(){
        return  super.toString() + " sans pate ";
    }
}