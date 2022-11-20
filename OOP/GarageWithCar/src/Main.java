public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(354865,2005);
        Car car2 = new Car(351568,2010);
        Car car3 = new Car(615523,2018);
        Car car4 = new Car(186845,2021);

        Car[] cars = {car1,car2,car3,car4};

        Garage garage = new Garage(cars);

        garage.printCarsOlderThan(5);
        System.out.println("Number of cars in inventory : " + Car.counter);
    }
}