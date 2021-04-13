package animal;

import java.util.ArrayList;

public class GO {
  public static void main(String[] args) {
    Dog dog = new Dog("Farfar",4, true);
    Flodhest flodhest = new Flodhest("Kasper", 4, true);
    Slange slange = new Slange("Ka", 0, false);

    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(dog);
    animals.add(flodhest);
    animals.add(slange);


    for (int i = 0; i < animals.size(); i++){
      System.out.println(animals.get(i));
    }
  }
}
