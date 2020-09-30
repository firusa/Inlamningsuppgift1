import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
       /* JOptionPane.showInputDialog("What animal should be fed?");*/

        Animal dog1 = new Dog("Sixten", 5000, "Dog food");
        Animal dog2 = new Dog("Dogge", 10000, "Dog food");

        Animal cat1 = new Cat("Venus", 5000, "Cat food");
        Animal cat2 = new Cat("Ove", 3000, "Cat food");

        Animal snake1 = new Snake("Hypno", 1000, "snake nutrition pills");
      /*  dog1.servingPortion();
        dog2.servingPortion();
        cat1.servingPortion();
        cat2.servingPortion();
        snake1.servingPortion();
      //  cat1.sayHello();
*/
        //List<Animal> myListOfAnimals = new ArrayList <Dog>();// this way i am saying putting Animals into Dogs because reference says i am list of animals so you can add anything you want into me
        List<Animal> myListOfAnimals = new ArrayList<>();
        myListOfAnimals.add(dog1);
        myListOfAnimals.add(dog2);
        myListOfAnimals.add(cat1);
        myListOfAnimals.add(cat2);
        myListOfAnimals.add(snake1);
        System.out.println(myListOfAnimals.get(0).name);
        myListOfAnimals.get(0).servingPortion();
        



    }

}
