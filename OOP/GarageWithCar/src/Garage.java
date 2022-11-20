public class Garage {

    Car[] cars;

    public Garage(Car[] cars){
        this.cars = cars;
    }

    public void printCarsOlderThan(int age){
        for (Car car: cars) {
            if(car.getAge() < age){
                System.out.println(car.toString());
            }
        }
    }
}
