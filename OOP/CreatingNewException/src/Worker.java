public class Worker {
    private String name;
    private double salary;
    private static int count = 0;

    public Worker(String name){
        this.name = name;
        this.salary = 0.0;
        this.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCount(){
        return count;
    }

    public String toString(){
        return  String.format(name + " " + salary );
    }
}
