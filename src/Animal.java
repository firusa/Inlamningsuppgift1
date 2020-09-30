public abstract class Animal {
    String name;
    double weight;
    TypeOfFood typeOfFood;

    public Animal(String name, double weight, TypeOfFood typeOfFood) {
        this.name = name;
        this.typeOfFood = typeOfFood;
        this.weight = weight;
    }

    public abstract void servingPortion();

}
