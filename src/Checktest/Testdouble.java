package Checktest;

import Animal.Animal1;
import Animal.Chicken;
import Animal.Tirger;

public class Testdouble {
    public static void main(String[] args) {
        Animal1[] dongvat = new Animal1[2];
        dongvat[0] = new Tirger();
        dongvat[1] = new Chicken();
        for (int i = 0; i < dongvat.length; i++) {
            System.out.println(dongvat[i].makeSound());
            if (dongvat[i] instanceof  Chicken){
                System.out.println(((Chicken) dongvat[i]).howToEat());
            }
        }

    }
}
