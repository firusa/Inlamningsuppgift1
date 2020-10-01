public abstract class Animal {
    private String name;
    private double weight;
    private TypeOfFood typeOfFood;

    public Animal(String name, double weight, TypeOfFood typeOfFood) {
        this.name = name;
        this.typeOfFood = typeOfFood;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    public abstract void servingPortion();

}
