public abstract class Animal {
    String name;
    double weight;
    String typeOfFood;
    public Animal(String name, double weight, String typeOfFood){
        this.name= name;
        this.typeOfFood= typeOfFood;
        this.weight= weight;
    }
    public abstract void servingPortion();

}
