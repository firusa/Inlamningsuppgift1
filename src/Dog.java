import javax.swing.*;

public class Dog extends Animal {

    public Dog(String name, double weight, TypeOfFood typeOfFood) {
        super(name, weight, typeOfFood);
    }

    public void servingPortion() {
        double amount = weight / 100;
        String message = String.format("%.2f grams of dog food", amount);
        JOptionPane.showMessageDialog(null, message);
    }

}
