package Animal;

import Edible.Edible;

public class Chicken  extends Animal1 implements Edible {

    @Override
    public String makeSound() {
        return " tuc tuc";
    }

    @Override
    public String howToEat() {
        return "gà chiên KFC";
    }
}
