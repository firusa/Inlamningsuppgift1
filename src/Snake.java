import javax.swing.*;

public class Snake extends Animal {
    public Snake(String name, double weight, String typeOfFood) {
        super(name, weight, typeOfFood);
    }

    public void servingPortion() {
        int amount= 20;
        JOptionPane.showMessageDialog(null,amount + " of snake nutrition pills");

    }


}
