import java.time.Year;

public class Car {

    private int id;
    private int productionYear;
    private int power;
    static int counter;

    public Car(int id,int productionYear){
        this.id = id;
        this.productionYear = productionYear;
        counter++;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getAge(){
        int year = Year.now().getValue();
        return  year - getProductionYear();
    }

    public void StartAndMove(){
        System.out.println("The engine of the car is started.");
        System.out.println("Car ready to go");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public String toString(){
        return "id : " + id + "production year: " + productionYear + " Power: "+power;
    }
}
