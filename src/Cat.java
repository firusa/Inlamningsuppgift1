import javax.swing.*;

public class Cat extends Animal {
    public Cat(String name, double weight, String typeOfFood) {
        super(name, weight, typeOfFood);
    }

    public void servingPortion(){
        double amount= weight/150;
        JOptionPane.showMessageDialog(null,amount + " grams of cat food");

    };
     public void sayHello(){
         System.out.println("I am a cat");
     };
}
