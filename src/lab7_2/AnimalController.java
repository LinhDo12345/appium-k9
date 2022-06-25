package lab7_2;

import java.util.Arrays;
import java.util.List;

public class AnimalController {



        public static void main(String[] args) {
            Animal horse = new Horse();
            Animal tiger = new Tiger();
            Animal dog = new Dog();

            AnimalController animalController = new AnimalController();
            animalController.getWinner(Arrays.asList(horse,tiger,dog));
        }

        public static void getWinner(List<Animal> animalList){
            int fastestSpeed = 0;
            String animalName = null;
            for (Animal animal : animalList) {
                if(fastestSpeed < animal.getSpeed()){
                    fastestSpeed = animal.getSpeed();
                    animalName = animal.getClass().getSimpleName();
                }
            }
            System.out.printf("Winer is %s with speed: %d km/h",animalName,fastestSpeed);
        }
}

