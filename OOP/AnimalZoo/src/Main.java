public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Eagle", AnimalTypes.BIRD);
        Animal animal2 = new Animal("Shark", AnimalTypes.FISH);
        Animal animal3 = new Animal("Cow", AnimalTypes.MAMMAL);
        Animal animal4 = new Animal("Lizard", AnimalTypes.REPTILE);

        Animal[] animals = {animal1,animal2,animal3,animal4};

        Zoo zoo = new Zoo(animals);

        zoo.printAnimals();
    }
}