
package com.journaldev.inheritance;

public class AnimalInheritanceTest {

    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());


//        Upcasting


        Cat cat2 = new Cat(false, "milk", 4, "brown"); //subclass instance
        Animal a1 = cat2;  //upcasting, it's fine since Cat is also an Animal

        Cat cat3 = new Cat(false, "milk", 4, "grey");
        Animal a2 = cat3;
        Cat c1 = (Cat) a2; //explicit casting, works fine because "c" is actually of type Cat

    }

}

