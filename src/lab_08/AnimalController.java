package lab_08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lab_08.Animal.Builder;

public class AnimalController {
    public static void main(String[] args) {

        Animal.Builder animalBuilder = new Animal.Builder();
        List<Animal> animalLst = new ArrayList<>();

        animalBuilder.setName("Cat");
        animalBuilder.setSpeed(new SecureRandom().nextInt(50));
        animalBuilder.setFlyable(false);
        Animal Cat = animalBuilder.build();


        animalBuilder.setName("Tiger");
        animalBuilder.setSpeed(new SecureRandom().nextInt(100));
        animalBuilder.setFlyable(false);
        Animal Tiger = animalBuilder.build();

        animalBuilder.setName("Eagle");
        animalBuilder.setSpeed(new SecureRandom().nextInt(150));
        animalBuilder.setFlyable(false);
        Animal Eagle = animalBuilder.build();

        animalBuilder.setName("Falcon");
        animalBuilder.setSpeed(new SecureRandom().nextInt(170));
        animalBuilder.setFlyable(false);
        Animal Falcon = animalBuilder.build();

        animalBuilder.setName("Snake");
        animalBuilder.setSpeed(new SecureRandom().nextInt(80));
        animalBuilder.setFlyable(false);
        Animal Snake = animalBuilder.build();


        AnimalController animalControllerController = new AnimalController();
        animalControllerController.getWinner(Arrays.asList(Cat, Tiger, Eagle, Falcon, Snake));

    }

    public static void getWinner(List<Animal> animalList) {
        int fastestSpeed = 0;
        String animalName = null;
        for (Animal animal : animalList) {
            if (animal.isFlyable() == false) {
                if (fastestSpeed < animal.getSpeed()) {
                    fastestSpeed = animal.getSpeed();
                    animalName = animal.getName();
                }
            }
        }

        System.out.printf("Winer is %s with speed: %d", animalName, fastestSpeed);
    }
}