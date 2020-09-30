import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("What animal should be fed?");


        Animal dog1 = new Dog("Sixten", 5000, TypeOfFood.DOG_FOOD);
        Animal dog2 = new Dog("Dogge", 10000, TypeOfFood.DOG_FOOD);

        Animal cat1 = new Cat("Venus", 5000, TypeOfFood.CAT_FOOD);
        Animal cat2 = new Cat("Ove", 3000, TypeOfFood.CAT_FOOD);

        Animal snake1 = new Snake("Hypno", 1000, TypeOfFood.SNAKE_PILLS);


        List<Animal> myListOfAnimals = new ArrayList<>();
        myListOfAnimals.add(dog1);
        myListOfAnimals.add(dog2);
        myListOfAnimals.add(cat1);
        myListOfAnimals.add(cat2);
        myListOfAnimals.add(snake1);


        List<Animal> objectSearchedFor = new ArrayList<>();//creating another list of found objects

        for (Animal a : myListOfAnimals) {                  //go through myLIstofAnimals

            if (userInput.equalsIgnoreCase(a.name)) {       //and if the object in that list has a matching name with user input
                objectSearchedFor.add(a);                      //put it in the list objectSearchedfor
            }
        }

        if (objectSearchedFor.isEmpty()) {  //mutually exclusive condition and loop. if list is empty
                                            // message printed and goe further for loop but nothing happens.
            JOptionPane.showMessageDialog(null, "No animal guest found");
        }
        for (Animal b : objectSearchedFor) { //if list has objects it is going to print the method.

            b.servingPortion();
        }


    }


}