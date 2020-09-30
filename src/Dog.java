import javax.swing.*;

public class Dog extends Animal {

    public Dog(String name, double weight, String typeOfFood) {
        super(name, weight, typeOfFood);
    }

    public void servingPortion(){
        double amount= weight/100;
        JOptionPane.showMessageDialog(null,amount + " grams of dog food");


    };
}
