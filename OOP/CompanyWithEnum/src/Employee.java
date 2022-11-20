public class Employee {

    private int id;
    private String name;
    private double Salary;
    private CompanyName companyName;

    public Employee(int i, String name, double salary, CompanyName  companyName){
        this.id = id;
        this.name = name;
        this.Salary = salary;
        this.companyName = companyName;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return id + " " + name + " " + Salary + " " + companyName;
    }
}
