import javax.swing.*;

public class Cat extends Animal {
    public Cat(String name, double weight, TypeOfFood typeOfFood) {
        super(name, weight, typeOfFood);
    }

    public void servingPortion() {
        double amount = weight / 150;
        String message = String.format("%.2f grams of cat food", amount);
        JOptionPane.showMessageDialog(null, message);

    }

}
