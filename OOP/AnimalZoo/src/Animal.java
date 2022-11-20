public class Animal {

    private String name;
    AnimalTypes animalTypes;

    public Animal(String name, AnimalTypes animalTypes) {
        this.name = name;
        this.animalTypes = animalTypes;
    }

    public String toString(){
        return name + " " + animalTypes;
    }
}
